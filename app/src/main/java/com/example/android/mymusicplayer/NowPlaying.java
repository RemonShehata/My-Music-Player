package com.example.android.mymusicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        // get the view and store it in a variable
        ImageView img = findViewById(R.id.nowPlaying_albumArt);
        TextView nameTextView = findViewById(R.id.nowPlaying_songTitle);
        TextView artistTextView = findViewById(R.id.nowPlaying_artistName);
        //retrive the data that was sent using intent put extras
        Intent in = getIntent();
        Bundle b = in.getExtras();
        //make sure it's not null before setting the values to the views
        if (b != null) {
            nameTextView.setText((String) b.get("songName"));
            artistTextView.setText((String) (b.get("artistName")));
            img.setImageResource((int) b.get("albumArt"));
        }


    }
}
