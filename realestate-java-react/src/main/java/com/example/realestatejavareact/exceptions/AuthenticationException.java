package com.example.realestatejavareact.exceptions;

public class AuthenticationException extends RealEstateException{

    public AuthenticationException(){
        super(401, "Authentication Failed");
    }

    public AuthenticationException(String message){ super(401, message);}

    public AuthenticationException(String message, Throwable cause){super(401, message, cause);}
}
