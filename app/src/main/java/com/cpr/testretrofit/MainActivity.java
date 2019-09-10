package com.cpr.testretrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private List<Login> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = new ArrayList<>();

        Call<List<Login>> call = ListLogin.getListLogin().getList();

        call.enqueue(new Callback<List<Login>>() {
            @Override
            public void onResponse(Call<List<Login>> call, Response<List<Login>> response) {
//                JsonArray jsonArray = response.body().getAsJsonArray();
//                for (int i = 0; i < jsonArray.size(); i++) {
//                    String login = jsonArray.get(i).getAsJsonObject().get("followers_url").getAsString();
//
//                    Log.e("TAG", "test " + login);
//                }
                list.clear();
                for (Login l : response.body()){
                    list.add(l);
                }
                for (int i = 0; i < list.size(); i++) {
                    Log.e("TAG", "login " + list.get(i).getLogin());
                    Log.e("TAG", "id " + list.get(i).getId());
                    Log.e("TAG", "node_id " + list.get(i).getNode_id());
                    Log.e("TAG", "avatar_url " + list.get(i).getAvatar_url());
                    Log.e("TAG", "gravatar_id " + list.get(i).getGravatar_id());
                    Log.e("TAG", "url " + list.get(i).getUrl());
                    Log.e("TAG", "html_url " + list.get(i).getHtml_url());
                    Log.e("TAG", "followers_url " + list.get(i).getFollower_url());
                    Log.e("TAG", "folowing_url " + list.get(i).getFollowing_url());
                    Log.e("TAG", "gists_url " + list.get(i).getGists_url());
                    Log.e("TAG", "starred_url " + list.get(i).getStarred_url());
                    Log.e("TAG", "subscription_url " + list.get(i).getSubscriptions_url());
                    Log.e("TAG", "organization_url " + list.get(i).getOrganizations_url());
                    Log.e("TAG", "repos_url " + list.get(i).getRepos_url());
                    Log.e("TAG", "event_url " + list.get(i).getEvents_url());
                    Log.e("TAG", "recevied_url " + list.get(i).getReceived_events_url());
                    Log.e("TAG", "type " + list.get(i).getType());
                    Log.e("TAG", "site_admin " + list.get(i).getSite_admin());
                }
            }

            @Override
            public void onFailure(Call<List<Login>> call, Throwable t) {
                Log.e("TAG", "error ");

            }
        });
    }
}
