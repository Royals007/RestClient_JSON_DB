package com.example.restservice.model;

import java.io.Serializable;

public class ErrorData implements Serializable {

    private String errorMessage;

    public ErrorData(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
