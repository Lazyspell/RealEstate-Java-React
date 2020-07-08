package com.example.realestatejavareact.exceptions;

public class AuthorizationException extends RealEstateException{
    public AuthorizationException(){super(403, "Authorization Failed");}

    public AuthorizationException(String message){super (403, message);}

    public AuthorizationException(String message, Throwable cause){super(403, message);}
}
