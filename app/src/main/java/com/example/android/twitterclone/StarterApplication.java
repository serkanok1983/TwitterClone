package com.example.android.twitterclone;

import android.app.Application;
import android.util.Log;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.SaveCallback;

public class StarterApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.enableLocalDatastore(this);

        Parse.initialize(new Parse.Configuration.Builder(getApplicationContext())
                .applicationId("ee930d916ae6ac0079d5f9a6c68d23edad66aa6d")
                .clientKey("f115f18fd416f34c554186869c0d56e4a5bf937b")
                .server("http://18.188.146.193:80/parse/")
                .build()
        );

        //http://18.188.146.193:80/apps
        //user vYhYW5nV5eiB

//        ParseObject object = new ParseObject("ExampleObject");
//        object.put("myNum", 123);
//        object.put("myStr", "Serkan");
//
//        object.saveInBackground(new SaveCallback() {
//            @Override
//            public void done(ParseException e) {
//                if (e==null) {
//                    Log.i("Parse result", "Successful!");
//                } else {
//                    Log.i("Parse result", "Failed" + e.toString());
//                }
//            }
//        });

        //ParseUser.enableAutomaticUser();
        ParseACL defaultACL = new ParseACL();
        defaultACL.setPublicReadAccess(true);
        defaultACL.setPublicWriteAccess(true);
        ParseACL.setDefaultACL(defaultACL, true);
    }
}
