package com.example.android.mymusicplayer;

/*
create a custom class Song to store data about every song and
 */

public class Song {
    //declare the member fields to store data about the song object
    private String mSongName;
    private String mArtistName;
    private int mAlbumArt;

    // constructor that gets called every time a new instance is created
    //the constructor job is to set the member variables value to the args value
    public Song(String songName, String artistName, int albumArt) {
        mSongName = songName;
        mArtistName = artistName;
        mAlbumArt = albumArt;
    }

    // getter methods to get the songName and artist name and album art
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
