package no.nav.oebs.okonomimodell.api.segmenter.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Builder
public class SegmentResponse {

    @JsonProperty("Segment")
    private Segment segment;

    @JsonProperty("SegmentKey")
    private String segmentKey;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("DefaultDimension")
    private List<DefaultDimension> defaultDimension;

    private LocalDate startdato;
    private LocalDate sluttdato;

    @Getter
    @Builder
    public static class DefaultDimension {

        @JsonProperty("Segment")
        private Segment segment;

        @JsonProperty("SegmentKey")
        private String segmentKey;
    }
}
