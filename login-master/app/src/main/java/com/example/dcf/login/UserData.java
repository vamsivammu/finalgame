package com.example.dcf.login;

import android.content.Context;
import android.content.SharedPreferences;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.Volley;

public class UserData {
    private static  UserData mInstance;
    private final String  sharedprefname = "userinfo";
    private final String key_useremail = "useremail";
    private final String key_name = "name";
    private final String key_score = "score";


    private static Context mCtx;

    private UserData(Context context) {
        mCtx = context;


    }

    public static synchronized UserData getInstance(Context context) {
        if (mInstance == null) {
            mInstance = new UserData(context);
        }
        return mInstance;
    }

    public boolean userlogin(String email,String name){

        SharedPreferences sp = mCtx.getSharedPreferences(sharedprefname,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString(key_name,name);
        editor.putString(key_useremail,email);
        //editor.putInt(key_score,score);
        editor.apply();
        return true;

    }

    public boolean isloggedin(){
        SharedPreferences sp = mCtx.getSharedPreferences(sharedprefname,Context.MODE_PRIVATE);
        if(sp.getString(key_useremail,null) != null){
            return true;
        }else{
            return false;

        }


    }

    public boolean logout(){
        SharedPreferences sp = mCtx.getSharedPreferences(sharedprefname,Context.MODE_PRIVATE);
        SharedPreferences.Editor ed = sp.edit();
        ed.clear();
        ed.apply();
        return true;
    }


}