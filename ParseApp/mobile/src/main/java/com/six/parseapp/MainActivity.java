package com.six.parseapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseUser;
import com.parse.SignUpCallback;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Open https://www.parse.com/docs/android_guide for API reference.

        /* Getting Started: Sign up. Create a TMAYD ParseObject and save it */

        ParseUser user = new ParseUser();
        user.setUsername(""); /*TODO*/
        user.setPassword(""); /*TODO*/
        user.setEmail(""); /*TODO*/
        user.signUpInBackground(new SignUpCallback() {
            @Override
            public void done(ParseException e) {
            if(e == null) {
                ParseObject po = new ParseObject("TMAYD"); /*TODO*/
                po.put("author", ParseUser.getCurrentUser()); /*TODO*/
                po.put("description", ""); /*TODO*/
                po.saveInBackground();

                Intent i = new Intent(getApplicationContext(), TMAYD.class);
                startActivity(i);
            }else{
                // Troubleshooting:
                // Run your app again. Why doesn't the next activity start?
                // Comment out the 4 lines above that create and save a ParseObject... we don't want duplicates.
                // Fix the code so that the new activity starts.
            }
            }
        });

        // Well done. Move on to TMAYD.java
    }
}
