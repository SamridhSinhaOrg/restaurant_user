package com.samridh.User.info.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<String> handleUserNotFondException(UserNotFoundException e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }


}
