package com.example.orange.retro;

import com.example.orange.models.User;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface RetroInterface {
    //get users
    @GET("api/Users1/{id}")
    public Call<User> getUserById(@Path("id") int id);
    //delete User by Id
    @DELETE("api/Users1/{id}")
    public Call<User> deleteUserById(@Path("id") int id);
    //add Users
    @POST("api/Users1")
    public Call<User> addUser(@Body User user);
    //update User
    public Call<User> updateUser(@Path("id") int id,@Field("Id") int idU, @Field("Email") String email,@Field("FName") String fName,@Field("LName") String lName,@Field("Age") int age,@Field("PhoneNumber") String phone_number,@Field("Country") String country);

}
