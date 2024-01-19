package com.enviro.assessment.grad001.katlegomashego.exception.amountExceeded;

public class CustomUserException extends RuntimeException{
    public CustomUserException(String message) {
        super(message);
    }

    public CustomUserException(String message, Throwable cause) {
        super(message, cause);
    }
}
