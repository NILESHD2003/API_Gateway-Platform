package dev.nileshdeshpande.gateway.commons.advices;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;

public class ApiResponse {
    /**
     * Create a Success response with the ApiSuccess structure
     *
     * @param data    Data to be sent in response
     * @param message Success message
     * @param status  Http Status Code
     * @return ResponseEntity with ApiSuccess Body
     */
    public static <T> ResponseEntity<ApiSuccess<T>> success(T data, String message, HttpStatus status) {
        ApiSuccess<T> apiSuccess = ApiSuccess.<T>builder()
                .status(status)
                .message(message)
                .data(data)
                .timestamp(LocalDateTime.now())
                .build();
        return ResponseEntity.status(status).body(apiSuccess);
    }

    /**
     * Create an Error with the ApiError structure
     *
     * @param error  Error message
     * @param status Http Status Code
     * @return ResponseEntity with ApiError Body
     */
    public static ResponseEntity<ApiError> error(HttpStatus status, String error) {
        ApiError apiError = ApiError.builder()
                .status(status)
                .error(error)
                .timestamp(LocalDateTime.now())
                .build();
        return ResponseEntity.status(status).body(apiError);
    }
}
