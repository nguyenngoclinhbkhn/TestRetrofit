package com.cpr.testretrofit.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {
    @SerializedName("success")
    @Expose
    private int code;
    @SerializedName("data")
    @Expose
    private List<Application> list;


    public int getSuccess() {
        return code;
    }

    public void setSuccess(int success) {
        this.code = success;
    }

    public List<Application> getList() {
        return list;
    }

    public void setList(List<Application> list) {
        this.list = list;
    }

    public Data(int code, List<Application> list) {
        this.code = code;
        this.list = list;
    }
}
