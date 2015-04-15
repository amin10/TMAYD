package com.six.parseapp;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseACL;

/**
 * Created by amin on 4/15/15.
 */
public class ParseApplication extends Application{

    private static final String APPLICATION_ID = "YFe5lad618iuOTGoZD04k9v92uy79wRMaHpCBG5q";
    private static final String CLIENT_KEY = "BE6nUF1ZZBoofgGYBZTBTTwXyqk2SG88EEsQrYDZ";

    @Override
    public void onCreate() {
        super.onCreate();

        /*
            We make ParseObjects created by one user
        publicly accessible for both reading and writing.
            Your app may not want to do this.
        */

        ParseACL defaultAcl = new ParseACL();
        defaultAcl.setPublicReadAccess(true);
        defaultAcl.setPublicWriteAccess(true);
        ParseACL.setDefaultACL(defaultAcl, true);

        /*
            You can't use Parse without this line.
            It connects this application the Parse application
            you created online with your Parse.com account
        */
        Parse.initialize(this, APPLICATION_ID, CLIENT_KEY);

    }
}
