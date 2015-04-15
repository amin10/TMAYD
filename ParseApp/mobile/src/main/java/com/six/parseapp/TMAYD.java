package com.six.parseapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.concurrent.atomic.AtomicInteger;


public class TMAYD extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tmayd);

        //Show that you care: Access someone else's TMAYD, add a "response" to it, and save it.

        //Basic functionality: Instead of "response", we'll save an array, "responseArr".
        // Add your response to the "responseArr" of someone else's TMAYD.

        //Getting fancy:
        // 1) Create your response as a new type of ParseObject: "Response".
        // It should have a field called "text" and a field called "author". Populate these.
        // 2) Add your response to the ParseRelation that is "responses".

        //You're too good at this. Uncomment this line
        //findViewById(R.id.button_responses).setVisibility(View.VISIBLE);
    }

    public void getResponses(View v){
        /*   Done with all the tasks in the onCreate?
                    Then it's time to get some love.
            Get all the responses to the TMAYD that you created.*/
        final CharSequence items[] = new CharSequence[4];
        items[0]="foo";
        items[1]="bar";
        items[2]="baz";
        items[3]="qux";
        AlertDialog.Builder adb = new AlertDialog.Builder(this);
        final AtomicInteger choice = new AtomicInteger(0);
        adb.setSingleChoiceItems(items, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface d, int n) {
                choice.set(n);
            }
        });
        adb.show();
    }
}
