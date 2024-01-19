package com.enviro.assessment.grad001.katlegomashego.exception.amountExceeded;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice

public class ExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler(value = {CustomUserException.class})
    public ResponseEntity<Object> handleAmountExceedLimitException(
            CustomUserException amountExceedLimitException
      ){
        CustomException amountException = new CustomException(
                amountExceedLimitException.getMessage(),
                amountExceedLimitException.getCause(),
                HttpStatus.BAD_REQUEST
        );
        return new ResponseEntity<>(amountException, HttpStatus.BAD_REQUEST);
    }
}
