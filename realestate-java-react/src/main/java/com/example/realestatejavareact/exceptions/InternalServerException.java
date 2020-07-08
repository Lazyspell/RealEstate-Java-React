package com.example.realestatejavareact.exceptions;

public class InternalServerException extends RealEstateException{
    public InternalServerException(){
        super(500, "Internal Server Error!");
    }

    public InternalServerException(String message){
        super(500,message);
    }

    public InternalServerException(String message, Throwable cause){
        super(500, message, cause);
    }
}
