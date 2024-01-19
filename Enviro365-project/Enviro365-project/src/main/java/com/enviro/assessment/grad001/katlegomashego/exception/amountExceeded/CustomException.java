package com.enviro.assessment.grad001.katlegomashego.exception.amountExceeded;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@RequiredArgsConstructor
public class CustomException {
    private final String message;
    private final Throwable throwable;
    private final HttpStatus httpStatus;


}
