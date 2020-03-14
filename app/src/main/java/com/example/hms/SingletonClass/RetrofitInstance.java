package com.example.hms.SingletonClass;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
    private static Retrofit retrofit = null;

    public static Retrofit getRetrofit() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder().baseUrl("URL").addConverterFactory(GsonConverterFactory.create()).build();

        }
        return retrofit;
    }

}

