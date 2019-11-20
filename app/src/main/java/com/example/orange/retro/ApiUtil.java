package com.example.orange.retro;

public class ApiUtil {
    static final String BASE_URL="https://evenement.azurewebsites.net/";
    public static RetroInterface getServiceClass(){
        return RetroFitAPI.getRetrofit(BASE_URL).create(RetroInterface.class);
    }

}
