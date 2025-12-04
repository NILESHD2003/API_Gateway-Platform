package dev.nileshdeshpande.gateway.commons.advices;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@Builder
public class ApiSuccess<T> {
    private HttpStatus status;
    private String message;
    private LocalDateTime timestamp;
    private T data;
}
