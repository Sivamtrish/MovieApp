package com.example.movieapp.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    public static final String BASE_URL = "https://api.themoviedb.org/3/";
    public static Retrofit retrofit;

    public static final String API_KEY = "271b525b76dac68ca1032bc4fe250646";
    public static final String IMAGE_BASE_URL = "http://image.tmdb.org/t/p/w200/";

    //create an instance of retrofit but following the singleton pattern. one instance to be used throught the app lifecycle.
    public static Retrofit getClient() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}