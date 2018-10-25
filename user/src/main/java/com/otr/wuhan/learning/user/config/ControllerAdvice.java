package com.otr.wuhan.learning.user.config;

import com.otr.wuhan.learning.shared.config.ErrorMessage;
import com.otr.wuhan.learning.user.exception.BusinessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerAdvice {
    @ExceptionHandler(BusinessException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void handleResourceNotFoundException(BusinessException e) {
        //return new ErrorMessage(e.getErrorCode(), e.getMessage());
    }
}
