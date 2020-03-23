package com.example.lab6;

import android.content.Context;
import android.content.SharedPreferences;

public class MySharedPreference {
    SharedPreferences pref;
    SharedPreferences.Editor editor;

    public MySharedPreference (Context context) {
         pref = context.getSharedPreferences("MyPref", 0); // 0 - for private mode
         editor = pref.edit();

    }

    public void save(String text){
        editor.putString("string", text);
        editor.commit(); // commit changes

    }

    public String getValue(){
       return  pref.getString("string", null); // getting String
    }

    public void clearSharedPreferences(){
        editor.clear();
        editor.commit(); // commit changes
    }
}
