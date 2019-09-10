package com.cpr.testretrofit;

import com.google.gson.JsonElement;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface API {
    @GET("/users")
    Call<List<Login>> getList();
}
