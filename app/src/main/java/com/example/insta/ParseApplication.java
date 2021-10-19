package com.example.insta;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("CLT1PaSTi4eFKboUOkEsQ8HEvELylFbkDr2GYgKc")
                .clientKey("CWJFED5WmRv7gijbIPC65LulbGUhIzmUWtMTMs7f")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
    }

