package com.otr.wuhan.learning.user.exception;

public class BusinessException extends Exception {
    private String errorCode;
    private String message;

    public BusinessException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
