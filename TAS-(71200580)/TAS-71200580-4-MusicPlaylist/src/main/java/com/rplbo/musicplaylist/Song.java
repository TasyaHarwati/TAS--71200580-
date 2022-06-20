package com.rplbo.musicplaylist;

public class Song {
    private String artist;
    private String album;
    private String name;
    private int length;



    public Song(String songName, String artistName, String albumName, int songLength) {
        this.name = songName;
        this.artist = artistName;
        this.album = albumName;
        this.length = songLength;
    }
    public void setName(String songName) {
        name = songName;
    }
    public String getName() {
        return name;
    }
    public void setArtist(String artistName) {
        artist = artistName;
    }
    public String getArtist() {
        return artist;
    }
    public void setAlbum(String albumName) {
        album = albumName;
    }
    public String getAlbum() {
        return album;
    }
    public void setLength(int h, int m, int s) {
        length = (h*3600 + m*60 + s);
        if(h==0) {
            length = (m*60+s);
        }
    }
    public int getLength() {
        return length;
    }

    public String toString() {
        return "Title: " + getName() + ", Artist: " + getArtist()
                + ", Album: " + getAlbum() + ", Song Length: " + getLength();
    }

}

