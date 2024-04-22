package com.netology_dao.exceptions;

import com.netology_dao.dto.ErrorResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerForControllersAdvice {

    @ExceptionHandler(DataNotFoundException.class)
    public ResponseEntity<ErrorResponseDTO> handleException(DataNotFoundException exception) {
        var error = ErrorResponseDTO.builder()
                .message("No data: " + exception)
                .build();
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}