package no.nav.oebs.konteringsinfo.api.kontering.v1;


import no.nav.security.token.support.core.api.Unprotected;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/v1")
public class KonteringController {

    @Unprotected
    @GetMapping(path = "/kontering")
    public String getKontering(
            @RequestParam(required = false) Boolean aktiv,
            @RequestParam(required = false) Boolean lonn) {
        return "Konteringsinfo for aktiv: " + aktiv + ", lonn: " + lonn;
    }

    @Unprotected
    @GetMapping(path = "/kontering/segmenter/{segmenttype}")
    public String getKonteringSegmenter(@PathVariable String segmenttype) {
        return "Konteringsifo for valgt segmenttype: " + segmenttype;
    }

}
