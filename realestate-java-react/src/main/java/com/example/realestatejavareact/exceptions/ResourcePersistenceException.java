package com.example.realestatejavareact.exceptions;

public class ResourcePersistenceException extends RealEstateException{
    public ResourcePersistenceException(){
        super(409, "The resource was not persisted!");
    }

    public ResourcePersistenceException(String message){
        super(409, message);
    }

    public ResourcePersistenceException(String message, Throwable cause){
        super(409, message, cause);
    }

}
