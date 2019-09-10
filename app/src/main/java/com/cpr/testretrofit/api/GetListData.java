package com.cpr.testretrofit.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class GetListData {
    private static Retrofit retrofit;

    private static Retrofit createRetrofit(){
        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl("http://cprcorp.com/cprsoftware/api/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }


    public static API getListData(){
        return createRetrofit().create(API.class);
    }
}
