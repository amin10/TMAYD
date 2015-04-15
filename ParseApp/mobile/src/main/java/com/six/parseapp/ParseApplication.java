package com.six.parseapp;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseACL;

/**
 * Created by amin on 4/15/15.
 */
public class ParseApplication extends Application{

    private static final String APPLICATION_ID = "hkB2mB6VpDOhgLHsxN9ncC4IakLIjW79ocmrNI8T";
    private static final String CLIENT_KEY = "yx00CC43B9q9GNkhwRQ7EG0tbkd8uXwhsBM4tp95";

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
