package com.example.realestatejavareact.exceptions;

public class RealEstateException extends RuntimeException {

    private int status;

    public RealEstateException(int status){this.status = status;}

    public RealEstateException(int status, Throwable cause){
        super(cause);
        this.status = status;
    }

    public RealEstateException(int status, String message){
        super(message);
        this.status = status;
    }

    public RealEstateException(int status, String message, Throwable cause){
        super(message, cause);
        this.status = status;
    }

    public int getStatus(){
        return status;
    }
}
