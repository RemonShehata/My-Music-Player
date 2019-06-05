package com.example.android.mymusicplayer;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {
    public SongAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link songs} object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID song_title
        TextView nameTextView = convertView.findViewById(R.id.song_title);
        // Get the song name from the current Song object and
        // set this text on the song TextView
        nameTextView.setText(currentSong.getSongName());

        // Find the TextView in the list_item.xml layout with the ID artist_title
        TextView numberTextView = convertView.findViewById(R.id.artist_title);
        // Get the artist name from the current words object and
        // set this text on the number TextView
        numberTextView.setText(currentSong.getArtistName());

        // Find the ImageView in the list_item.xml
        ImageView albumartImageView = convertView.findViewById(R.id.album_art);
        //get the album art from the current song object
        // and set this img on the albumartImageView
        albumartImageView.setImageResource(currentSong.getAlbumArt());


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return convertView;
    }
}
