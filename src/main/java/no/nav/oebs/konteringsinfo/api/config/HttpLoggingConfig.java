package no.nav.oebs.konteringsinfo.api.config;

import no.nav.oebs.konteringsinfo.api.config.common.logging.HttpLoggingFilter;
import no.nav.oebs.konteringsinfo.api.config.common.mdc.MdcFilter;
import no.nav.oebs.konteringsinfo.api.db.repository.KallLoggRepository;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.Ordered;

@Configuration
public class HttpLoggingConfig {
	@Bean
	public FilterRegistrationBean<MdcFilter> mdcFilterRegistrationBean() {
		FilterRegistrationBean<MdcFilter> registrationBean = new FilterRegistrationBean<>();
		registrationBean.setFilter(new MdcFilter());
		registrationBean.addUrlPatterns("/api/*");
		registrationBean.setOrder(Ordered.HIGHEST_PRECEDENCE);
		return registrationBean;
	}

	@Bean
	@Profile("!local & !t1")
	public FilterRegistrationBean<HttpLoggingFilter> httpLoggingFilterRegistrationBean(KallLoggRepository kallLoggRepository) {
		FilterRegistrationBean<HttpLoggingFilter> registrationBean = new FilterRegistrationBean<>();
		registrationBean.setFilter(new HttpLoggingFilter(kallLoggRepository));
		registrationBean.addUrlPatterns("/api/*");
		registrationBean.setOrder(Ordered.HIGHEST_PRECEDENCE + 1);
		return registrationBean;
	}
}
