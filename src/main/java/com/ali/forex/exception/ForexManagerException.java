package com.ali.forex.exception;

import lombok.Getter;

@Getter
public class ForexManagerException extends RuntimeException{
    private final EErrorType errorType;

    public ForexManagerException(EErrorType errorType){
        super(errorType.getMessage());
        this.errorType = errorType;
    }

    public ForexManagerException(EErrorType errorType, String message){
        super(message);
        this.errorType = errorType;
    }
}