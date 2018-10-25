package com.otr.wuhan.learning.shared.config;

public class ErrorMessage {
    private String errorCode;
    private String detail;

    public ErrorMessage(String errorCode, String detail) {
        this.errorCode = errorCode;
        this.detail = detail;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getDetail() {
        return detail;
    }
}
