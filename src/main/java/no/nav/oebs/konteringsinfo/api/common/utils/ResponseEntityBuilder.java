package no.nav.oebs.konteringsinfo.api.common.utils;


import no.nav.oebs.konteringsinfo.api.db.entity.ApiError;
import org.springframework.http.ResponseEntity;

public class ResponseEntityBuilder {
    public static ResponseEntity<Object> build(ApiError apiError) {
        return new ResponseEntity<>(apiError, apiError.getStatus());
    }
}

