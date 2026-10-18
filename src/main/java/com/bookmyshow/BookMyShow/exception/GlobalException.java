package com.bookmyshow.BookMyShow.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.server.ResponseStatusException;

import java.awt.*;

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(ResponseStatusException.class)
    public ResponseEntity<ApiError> handleResponseStatusException(ResponseStatusException exception) {
        HttpStatus httpStatus = HttpStatus.valueOf(
                exception.getStatusCode().value()
        );

        ApiError apiError = new ApiError(
                httpStatus.value(),
                httpStatus.getReasonPhrase(),
                exception.getReason() != null
                    ? exception.getReason() : httpStatus.getReasonPhrase()
        );

        return ResponseEntity.status(httpStatus).body(apiError);
    }
}
