package no.nav.oebs.okonomimodell.api.segmenter.v1;

import no.nav.security.token.support.core.api.Unprotected;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/konteringsinfo")
public class KonteringsinfoController {

    @Unprotected
    @GetMapping
    public List<SegmentResponse> getSegmenter(
            @RequestParam(required = false) String org_id,
            @RequestParam(required = false) String segmentnavn,
            @RequestParam(required = false) String system,
            @RequestParam(required = false) Boolean aktiv) {
        return List.of();
    }

    @Unprotected
    @GetMapping(path = "/segmenter/{segmenttype}")
    public List<SegmentResponse> getSegmenterByType(
            @PathVariable Segment segmenttype,
            @RequestParam(required = false) String system,
            @RequestParam(required = false) Boolean aktiv) {
        return List.of();
    }
}
