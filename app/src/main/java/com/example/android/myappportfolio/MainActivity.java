package com.example.android.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import 	android.app.Activity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onLaunchSpotifyStreamer(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch Spotify Streamer app!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void onLaunchScoresApp(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch Scores app!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void onLaunchLibraryApp(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch Library app!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void onLaunchBuidItBigger(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch Build It Bigger app!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void onLaunchXyzReader(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch XYZ Reader app!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void onLaunchCapstoneMyOwnApp(View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my capstone app!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
