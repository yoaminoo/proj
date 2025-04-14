package org.AP.albums;

import org.AP.song.Song;

import java.util.ArrayList;

class Albums {
    private String title;
    private String artist;
    private ArrayList<Song> songs;

    public Albums(String title, String artist) {
        this.title = title;
        this.artist = artist;
        songs = new ArrayList<>();
    }
    public void addSong(Song song) {
        songs.add(song);
    }

    public String getTitle() {
        return title;
    }
    public String getArtist() {
        return artist;
    }
    public ArrayList<Song> getSongs() {
        return songs;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();

        str.append("Title: ").append(title).append("\n");
        str.append("Artist: ").append(artist).append("\n");
        str.append("Songs:\n");
        for (Song song : songs) {
            str.append("\t").append(song.getName()).append(" by ").append(song.getArtist()).append("\n");
        }
        return str.toString();
    }
}