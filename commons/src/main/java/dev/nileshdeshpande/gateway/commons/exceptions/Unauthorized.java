package dev.nileshdeshpande.gateway.commons.exceptions;

import org.springframework.http.HttpStatus;

public class Unauthorized extends BaseException {
    public Unauthorized(String message) {
        super(message, ErrorMessages.UNAUTHORIZED, HttpStatus.UNAUTHORIZED, "UNAUTHORIZED");
    }
}
