package dev.nileshdeshpande.gateway.commons.exceptions;

public class ErrorMessages {
    // Prevents instantiation
    private ErrorMessages() {}

    public static final String BAD_REQUEST = "Invalid request data";
    public static final String NOT_FOUND = "Requested resource not found";
    public static final String UNAUTHORIZED = "You are not authorized to perform this action";
    public static final String INTERNAL_SERVER_ERROR = "An unexpected error occurred";
}
