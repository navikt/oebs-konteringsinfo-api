package no.nav.oebs.okonomimodell.api.exception;

import no.nav.oebs.okonomimodell.api.config.common.logging.LoggingUtils;

public abstract class PlsqlException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public PlsqlException(String message) {
		super(LoggingUtils.maskIfFnr(message));
	}
}
