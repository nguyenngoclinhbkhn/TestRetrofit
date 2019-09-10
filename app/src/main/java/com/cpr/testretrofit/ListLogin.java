package com.cpr.testretrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ListLogin {
    private static  Retrofit retrofit;

    private static Retrofit createRetrofit(){
        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl("https://api.github.com")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

    public static API getListLogin(){
        return createRetrofit().create(API.class);
    }
}
