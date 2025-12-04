package dev.nileshdeshpande.gateway.commons.exceptions;

import org.springframework.http.HttpStatus;

public class BadRequest extends BaseException {
    public BadRequest(String message) {
        super(message, ErrorMessages.BAD_REQUEST, HttpStatus.BAD_REQUEST, "BAD_REQUEST");
    }
}
