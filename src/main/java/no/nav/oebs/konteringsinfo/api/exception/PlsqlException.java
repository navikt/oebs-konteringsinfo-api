package no.nav.oebs.konteringsinfo.api.exception;

import no.nav.oebs.konteringsinfo.api.config.common.logging.LoggingUtils;

public abstract class PlsqlException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public PlsqlException(String message) {
		super(LoggingUtils.maskIfFnr(message));
	}
}
