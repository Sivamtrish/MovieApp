package com.example.movieapp.network;
import com.example.movieapp.model.MovieListResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("movie/popular")
    Call<MovieListResponse> getPopularMovies(@Query("api_key") String apiKey, @Query("page") int pageNo);
}
