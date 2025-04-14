package org.AP.comment;

public class Comments {
    private String text;
    private String username;
    private int like;
    private int dislike;

    public Comments(String text, String username) {
        this.username = username;
        this.text = text;
        this.like = 0;
        this.dislike = 0;
    }
    public void edit(String text, String newText) {
        text = newText;
    }

    public String getText() {
        return text;
    }
    public String getUsername() {
        return username;
    }
    public int getLike() {
        return like;
    }
    public int getDislike() {
        return dislike;
    }
    public void addLike() {
        like++;
    }
    public void addDislike() {
        dislike++;
    }
    public String toString() {
        return username + ": " + text + " " + "Like-Dislike: " + like + "-" + dislike;
    }
}