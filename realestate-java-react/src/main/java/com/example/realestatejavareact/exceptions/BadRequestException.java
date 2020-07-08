package com.example.realestatejavareact.exceptions;

public class BadRequestException extends RealEstateException{
    public BadRequestException(){super(400,"Invalid parameters provided");}

    public BadRequestException(String message){
        super(400, message);
    }

    public BadRequestException(String message, Throwable cause){
        super(400, message, cause);
    }

}
