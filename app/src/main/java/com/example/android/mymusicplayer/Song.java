package com.example.android.mymusicplayer;

/*
create a custom class Song to store data about every song and
 */

public class Song {
    //declate the member fields to store data about the song object
    String mSongName;
    String mArtistName;
    int mAlbumArt;

    // constructor that gets called everytime a new instance is created
    //the constructor job is to set the member variables value to the args value
    public Song(String songName, String artistName, int albumArt) {
        mSongName = songName;
        mArtistName = artistName;
        mAlbumArt = albumArt;
    }

    // getter methods to get the songName and artist name and albumart
    public String getSongName() {
        return mSongName;
    }

    public String getArtistName() {
        return mArtistName;
    }

    public int getAlbumArt() {
        return mAlbumArt;
    }
}
