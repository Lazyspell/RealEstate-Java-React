package com.example.realestatejavareact.exceptions;

public class ResourceNotFoundException extends RealEstateException{

    public ResourceNotFoundException(){
        super(404, "No resource found using provided criteria");
    }

    public ResourceNotFoundException(String message){
        super(404, message);
    }

    public ResourceNotFoundException(String message, Throwable cause){
        super(404, message, cause);
    }
}
