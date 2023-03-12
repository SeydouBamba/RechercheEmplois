package sn.esmt.rechercheemploi.httpconfig;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface Api {
    @GET("/users/login")
    public retrofit2.Call<UsersApiResponse> login(@Query("email") String email);

    @GET("/users/all")
    public Call<ArrayList<UsersResponse>> all();
    @POST("/users/save")
    Call<UsersResponse> save(@Body UsersResponse usersResponse);

}
