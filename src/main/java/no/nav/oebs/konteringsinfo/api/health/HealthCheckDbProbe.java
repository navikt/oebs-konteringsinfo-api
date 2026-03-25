package no.nav.oebs.konteringsinfo.api.health;

import no.nav.oebs.konteringsinfo.api.db.repository.KallLoggRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("!local & !t1")
public class HealthCheckDbProbe {

	private KallLoggRepository kallLoggRepository;

	HealthCheckDbProbe(KallLoggRepository kallLoggRepository) {
		this.kallLoggRepository = kallLoggRepository;
	}

	public void pingDatabase() {
		kallLoggRepository.pingKallLogg();
	}
}
