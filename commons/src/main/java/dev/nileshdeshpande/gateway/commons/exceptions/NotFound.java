package dev.nileshdeshpande.gateway.commons.exceptions;

import org.springframework.http.HttpStatus;

public class NotFound extends BaseException {
    public NotFound(String message) {
        super(message, ErrorMessages.NOT_FOUND, HttpStatus.NOT_FOUND, "NOT_FOUND");
    }
}
