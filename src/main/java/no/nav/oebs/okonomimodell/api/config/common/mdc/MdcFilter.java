package no.nav.oebs.okonomimodell.api.config.common.mdc;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

public class MdcFilter extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		try {
			generateAndSetInternalCorrelationId();

			filterChain.doFilter(request, response);
		} finally {
			MdcOperations.remove(MdcOperations.MDC_CORRELATION_ID);
		}
	}

	private void generateAndSetInternalCorrelationId() {
		String correlationId = MdcOperations.generateCorrelationId();

		MdcOperations.put(MdcOperations.MDC_CORRELATION_ID, correlationId);
	}
}

