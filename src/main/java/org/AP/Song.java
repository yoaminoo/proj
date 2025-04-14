import java.util.ArrayList;

class Song {
    private String name;
    private String artist;
    private String album;
    private String genre;
    private String lyric;
    private int views;
    private ArrayList<Comment> comments;

    public Song(String name, String artist, String album, String genre) {
        this.name = name;
        this.artist = artist;
        this.album = album;
        this.genre = genre;
        this.views = 0;
        this.comments = new ArrayList<Comment>();
    }
    public void view(){
        views++;
    }
    public void addComment(Comment comment){
        comments.add(comment);
    }
}