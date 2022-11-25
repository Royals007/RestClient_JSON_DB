package com.example.restservice.controller;

import com.example.restservice.exception.MessageNotFoundException;
import com.example.restservice.model.ErrorData;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MessageExceptionHandler {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    // wenn einer der beiden Exception geworfen wird, wird diese Methode aufgerufen
    @ExceptionHandler ({MessageNotFoundException.class, IllegalArgumentException.class }) // {} uses number of exceptions can include
    public ErrorData handleException(Throwable th) {
        return new ErrorData(th.getMessage());
    }
}
