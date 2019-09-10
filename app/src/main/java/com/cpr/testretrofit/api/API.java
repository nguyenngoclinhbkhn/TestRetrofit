package com.cpr.testretrofit.api;

import com.cpr.testretrofit.model.Data;

import retrofit2.Call;
import retrofit2.http.GET;

public interface API {
    @GET("list_apps.php")
    Call<Data> getListData();
}
