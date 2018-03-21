/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.jezik;

import java.util.logging.Level;
import java.util.logging.Logger;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class Main {

    public static void main(String [] args){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://private-5039a-restapiprenosdat.apiary-mock.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        //service
        RestServiceInterface service = retrofit.create(RestServiceInterface.class);

        // LIST USERS [GET]

        service.getUserList().enqueue(new Callback<UserList>() {
            @Override
            public void onResponse(Call<UserList> call, Response<UserList> rspns) {
                Logger.getGlobal().log(Level.INFO, rspns.body().toString());
            }

            @Override
            public void onFailure(Call<UserList> call, Throwable thrwbl) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

        // SINGLE USER [GET]

        service.getSingleUser(2).enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> rspns) {
                //Logger.getGlobal().log(Level.INFO, "SINGLE USER [GET]");
                Logger.getGlobal().log(Level.INFO, rspns.body().toString());
            }

            @Override
            public void onFailure(Call<User> call, Throwable thrwbl) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

        // SINGLE USER NOT FOUND [GET]

        service.getSingleUser(23).enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> rspns) {
                if(rspns.isSuccessful()) {
                   //Logger.getGlobal().log(Level.INFO, "SINGLE USER NOT FOUND [GET]");
                    Logger.getGlobal().log(Level.INFO,"OK: " +  rspns.code());
                } else {
                    //Logger.getGlobal().log(Level.INFO, "SINGLE USER NOT FOUND [GET]");
                    Logger.getGlobal().log(Level.INFO,"SINGLE USER NOT FOUND - CODE: " +  rspns.code());
                }
            }

            @Override
            public void onFailure(Call<User> call, Throwable thrwbl) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

        // LIST <RESOURCE> [GET]

        service.getResourceUnknown().enqueue(new Callback<ResourceUnknown>() {
            @Override
            public void onResponse(Call<ResourceUnknown> call, Response<ResourceUnknown> rspns) {
                //Logger.getGlobal().log(Level.INFO, "LIST <RESOURCE> [GET]");
                Logger.getGlobal().log(Level.INFO, rspns.body().toString());
            }

            @Override
            public void onFailure(Call<ResourceUnknown> call, Throwable thrwbl) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

        // SINGLE <RESOURCE> [GET]

        service.getSingleResourceUnknown(2).enqueue(new Callback<SingleResourceUnknown>() {
            @Override
            public void onResponse(Call<SingleResourceUnknown> call, Response<SingleResourceUnknown> rspns) {
                //Logger.getGlobal().log(Level.INFO, "LIST <RESOURCE> [GET]");
                Logger.getGlobal().log(Level.INFO, rspns.body().toString());
            }

            @Override
            public void onFailure(Call<SingleResourceUnknown> call, Throwable thrwbl) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

        // SINGLE <RESOURCE> NOT FOUND [GET]

        service.getSingleResourceUnknown(23).enqueue(new Callback<SingleResourceUnknown>() {
            @Override
            public void onResponse(Call<SingleResourceUnknown> call, Response<SingleResourceUnknown> rspns) {
                if(rspns.isSuccessful()) {
                    //Logger.getGlobal().log(Level.INFO, "SINGLE USER NOT FOUND [GET]");
                    Logger.getGlobal().log(Level.INFO,"OK: " +  rspns.code());
                } else {
                    //Logger.getGlobal().log(Level.INFO, "SINGLE USER NOT FOUND [GET]");
                    Logger.getGlobal().log(Level.INFO,"SINGLE <RESOURCE> NOT FOUND - CODE: " +  rspns.code());
                }
            }

            @Override
            public void onFailure(Call<SingleResourceUnknown> call, Throwable thrwbl) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

        // CREATE [POST]
        NewUser user = new NewUser();
                user.name = "morpheus";
                user.job = "leader";
        service.postUser(user).enqueue(new Callback<NewUser>() {
            @Override
            public void onResponse(Call<NewUser> call, Response<NewUser> rspns) {
                //Logger.getGlobal().log(Level.INFO, "LIST <RESOURCE> [GET]");
                Logger.getGlobal().log(Level.INFO, rspns.body().toString());
            }

            @Override
            public void onFailure(Call<NewUser> call, Throwable thrwbl) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

        // UPDATE [PUT]
        NewUser user2 = new NewUser();
        user2.name = "morpheus";
        user2.job = "zion resident";
        service.putUser(user2,2).enqueue(new Callback<UpdatedUser>() {
            @Override
            public void onResponse(Call<UpdatedUser> call, Response<UpdatedUser> rspns) {
                //Logger.getGlobal().log(Level.INFO, "LIST <RESOURCE> [GET]");
                Logger.getGlobal().log(Level.INFO, rspns.body().toString());
            }

            @Override
            public void onFailure(Call<UpdatedUser> call, Throwable thrwbl) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

        // UPDATE [PATCH]
        service.patchUser(user,2).enqueue(new Callback<UpdatedUser>() {
            @Override
            public void onResponse(Call<UpdatedUser> call, Response<UpdatedUser> rspns) {
                //Logger.getGlobal().log(Level.INFO, "LIST <RESOURCE> [GET]");
                Logger.getGlobal().log(Level.INFO, rspns.body().toString());
            }

            @Override
            public void onFailure(Call<UpdatedUser> call, Throwable thrwbl) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

        // DELETE [DELETE]
        service.deleteUser(2).enqueue(new Callback<UpdatedUser>() {
            @Override
            public void onResponse(Call<UpdatedUser> call, Response<UpdatedUser> rspns) {
                if(rspns.isSuccessful()) {
                    //Logger.getGlobal().log(Level.INFO, "SINGLE USER NOT FOUND [GET]");
                    Logger.getGlobal().log(Level.INFO,"DELETE OK - CODE: " +  rspns.code());
                } else {
                    //Logger.getGlobal().log(Level.INFO, "SINGLE USER NOT FOUND [GET]");
                    Logger.getGlobal().log(Level.INFO,"DELETE - CODE: " +  rspns.code());
                }
            }

            @Override
            public void onFailure(Call<UpdatedUser> call, Throwable thrwbl) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
}
