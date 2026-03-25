package no.nav.oebs.konteringsinfo.api.db.repository;

import no.nav.oebs.konteringsinfo.api.db.entity.KallLogg;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Profile("!local & !t1")
@Transactional(propagation = Propagation.REQUIRES_NEW)
public interface KallLoggRepository extends JpaRepository<KallLogg, Integer>, KallLoggRepositoryCustom {

}
