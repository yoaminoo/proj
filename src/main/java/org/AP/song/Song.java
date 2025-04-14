package org.AP.song;

import org.AP.comment.Comments;

import java.util.ArrayList;

public class Song {
    private String name;
    private String artist;
    private String album;
    private String genre;
    private String lyric;
    private int views;
    private int likes;
    private int dislikes;
    private ArrayList<Comments> comments;

    public Song(String name, String artist, String album, String genre, String lyric, int views, int likes, int dislikes) {
        this.name = name;
        this.artist = artist;
        this.album = album;
        this.genre = genre;
        this.lyric = lyric;
        this.views = views;
        this.likes = likes;
        this.dislikes = dislikes;
        this.comments = new ArrayList<Comments>();
    }

    public Song(String name, String artist, String album, String genre, String lyric) {
        this.name = name;
        this.artist = artist;
        this.album = album;
        this.genre = genre;
        this.lyric = lyric;
        this.views = 0;
        this.likes = 0;
        this.dislikes = 0;
        this.comments = new ArrayList<Comments>();
    }
    public Song(String name, String artist, String album, String genre) {
        this(name, artist, album, genre, "Lyrics is not availabe yet");
    }
    public void addView(){
        views++;
    }
    public void addLike(){
        likes++;
    }
    public void addDislike(){
        dislikes++;
    }
    public void addComment(Comments comment){
        comments.add(comment);
    }
    public ArrayList<Comments> getComments(){
        return comments;
    }

    // getters
    public String getArtist() {
        return artist;
    }
    public String getAlbum() {
        return album;
    }
    public String getGenre() {
        return genre;
    }
    public String getLyric() {
        return lyric;
    }
    public String getName() {
        return name;
    }
    public int getViews() {
        return views;
    }
    public int getLikes() {
        return likes;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setLyric(String lyric) {
        this.lyric = lyric;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public void setComments(Comments comment) {
        this.comments.add(comment);
    }

    public String toString() {
        return "Song Details:\n" +
                "Name: " + name + "\n" +
                "Artist: " + artist + "\n" +
                "Album: " + album + "\n" +
                "Genre: " + genre + "\n" +
                "Lyrics: " + lyric + "\n" +
                "Views: " + views  + "Likes: " + likes + "Comments count: " + comments.size();
    }
}