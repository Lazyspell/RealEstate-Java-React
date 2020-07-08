package com.example.realestatejavareact.web.dtos;

import com.example.realestatejavareact.exceptions.RealEstateException;

import java.time.LocalDateTime;
import java.util.Objects;

public class ErrorResponse {

   private int status;
   private String message;
   private String timestamp;

    public ErrorResponse(){super();}

    public ErrorResponse(RealEstateException e){
        this.status = e.getStatus();
        this.message = e.getMessage();
        this.timestamp = LocalDateTime.now().toString();
    }

    public int getStatus(){return status;}

    public void setStatus(int status){this.status = status;}

    public String getMessage(){return message;}

    public void setMessage(String message) {this.message = message;}

    public String getTimestamp(){return timestamp;}

    public void setTimestamp(String timestamp){this.timestamp = timestamp;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ErrorResponse that = (ErrorResponse) o;
        return status == that.status &&
                Objects.equals(message, that.message) &&
                Objects.equals(timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, message, timestamp);
    }

    @Override
    public String toString() {
        return "ErrorResponse{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }

}
