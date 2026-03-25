package no.nav.oebs.konteringsinfo.api.config;


import no.nav.security.token.support.spring.api.EnableJwtTokenValidation;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("!local & !t1")
@EnableJwtTokenValidation(ignore = { "org.springframework", "org.springdoc" })
public class SecurityConfig {

}
