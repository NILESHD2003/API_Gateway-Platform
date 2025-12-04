package dev.nileshdeshpande.gateway.commons.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public abstract class BaseException extends RuntimeException {

    private final HttpStatus status;
    private final String errorCode;

    protected BaseException(String customMessage, String defaultMessage, HttpStatus status, String errorCode) {
        super(customMessage != null && !customMessage.isBlank() ? customMessage : defaultMessage);
        this.status = status;
        this.errorCode = errorCode;
    }
}
