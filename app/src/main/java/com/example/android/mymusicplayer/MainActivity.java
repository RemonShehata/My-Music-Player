package com.example.android.mymusicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Lost on you", "LP", R.drawable.lp_albumart));
        songs.add(new Song("When we were young", "LP", R.drawable.lp_albumart));
        songs.add(new Song("Bird set free", "Sia", R.drawable.sia_this_is_acting));
        songs.add(new Song("Alive", "Sia", R.drawable.sia_this_is_acting));
        songs.add(new Song("Demons", "Imagine Dragons", R.drawable.night_visions));
        songs.add(new Song("Faded", "Alan Walker", R.drawable.alan_walker_faded));
        songs.add(new Song("Run away", "Aurora", R.drawable.aurora));
        songs.add(new Song("Six feet under", "Billie Eilish", R.drawable.billie_eilish));
        songs.add(new Song("Home sick", "Dua Lipa", R.drawable.dua_lipa));


        SongAdapter adapter = new SongAdapter(this, songs);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlaying.class);
                nowPlayingIntent.putExtra("songName", songs.get(position).getSongName());
                nowPlayingIntent.putExtra("artistName", songs.get(position).getArtistName());
                nowPlayingIntent.putExtra("albumArt", songs.get(position).getAlbumArt());
                startActivity(nowPlayingIntent);
            }
        });
    }
}
