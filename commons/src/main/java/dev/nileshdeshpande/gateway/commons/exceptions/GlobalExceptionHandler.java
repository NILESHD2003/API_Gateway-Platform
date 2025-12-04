package dev.nileshdeshpande.gateway.commons.exceptions;

import dev.nileshdeshpande.gateway.commons.advices.ApiError;
import dev.nileshdeshpande.gateway.commons.advices.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

// TODO: write tests for this class
@RestControllerAdvice
public class GlobalExceptionHandler {
    /**
     * handle all BaseException types by returning the status and message from the defined custom exceptions.
     */
    @ExceptionHandler(BaseException.class)
    public ResponseEntity<ApiError> handleBaseException(BaseException ex) {
        return ApiResponse.error(ex.getStatus(), ex.getMessage());
    }

    /**
     * handle IllegalArgumentException specifically to return 400 Bad Request
     */
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ApiError> handleIllegalArgumentException(IllegalArgumentException ex) {
        return ApiResponse.error(HttpStatus.BAD_REQUEST, ex.getMessage());
    }

    /**
     * handle all unhandled exceptions
     * add a logger to log these exceptions for further analysis
     */
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiError> handleUnhandledException(Exception ex) {
//        TODO: add logger to log these exceptions
        return ApiResponse.error(HttpStatus.INTERNAL_SERVER_ERROR, ErrorMessages.INTERNAL_SERVER_ERROR);
    }
}
