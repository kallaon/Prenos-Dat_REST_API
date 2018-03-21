/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.jezik;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.*;

public interface RestServiceInterface {
    @GET("/api/users/{id}")
    Call<User> getSingleUser(@Path("id") int userID);

    @GET("/api/users?page=2")
    Call<UserList> getUserList();

    @GET("/api/unknown")
    Call<ResourceUnknown> getResourceUnknown();

    @GET("/api/unknown/{id}")
    Call<SingleResourceUnknown> getSingleResourceUnknown(@Path("id") int resourceID);

    @POST("/api/users")
    Call<NewUser> postUser(@Body NewUser newUser);

    @PUT("/api/users/{id}")
    Call<UpdatedUser> putUser(@Body NewUser newUser, @Path("id") int userID);

    @PATCH("/api/users/{id}")
    Call<UpdatedUser> patchUser(@Body NewUser newUser, @Path("id") int userID);

    @DELETE("/api/users/{id}")
    Call<UpdatedUser> deleteUser(@Path("id") int userID);
}
