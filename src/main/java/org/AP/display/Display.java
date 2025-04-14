package org.AP.display;

import org.AP.comment.Comments;
import org.AP.p.P;
import org.AP.song.Song;

import java.util.ArrayList;
import java.util.Scanner;

public class Display {

    public void displayUser(){
        Scanner scan = new Scanner(System.in);

        ArrayList<Song> songs = new ArrayList<>();

        Song song1 = new Song("Imagine", "John Lennon", "Imagine", "Soft Rock", "Imagine there's no heaven...", 100000, 8000, 200);
        Song song2 = new Song("Bohemian Rhapsody", "Queen", "A Night at the Opera", "Rock", "Is this the real life? Is this just fantasy...", 120000, 9000, 300);
        Song song3 = new Song("Shape of You", "Ed Sheeran", "Divide", "Pop", "The club isn't the best place to find a lover...", 150000, 10000, 250);
        Song song4 = new Song("Billie Jean", "Michael Jackson", "Thriller", "Pop", "Billie Jean is not my lover...", 130000, 8500, 300);
        Song song5 = new Song("Hotel California", "Eagles", "Hotel California", "Rock", "On a dark desert highway, cool wind in my hair...", 110000, 8000, 280);
        Song song6 = new Song("Rolling in the Deep", "Adele", "21", "Pop", "There's a fire starting in my heart...", 140000, 9500, 150);
        Song song7 = new Song("Smells Like Teen Spirit", "Nirvana", "Nevermind", "Grunge", "Load up on guns, bring your friends...", 160000, 11000, 400);
        Song song8 = new Song("Hey Jude", "The Beatles", "Single", "Rock", "Hey Jude, don't make it bad...", 90000, 7000, 100);
        Song song9 = new Song("Stairway to Heaven", "Led Zeppelin", "Untitled", "Rock", "There's a lady who's sure all that glitters is gold...", 95000, 7500, 90);
        Song song10 = new Song("Lose Yourself", "Eminem", "8 Mile", "Hip-Hop", "Look, if you had one shot, or one opportunity...", 170000, 12000, 350);

        String username = "yoaminoo";
        String comment = "mmh not bad kid";
        Comments comments = new Comments(username, comment);

        song1.setComments(comments);song2.setComments(comments);song3.setComments(comments);song4.setComments(comments);song5.setComments(comments);
        song6.setComments(comments);song7.setComments(comments);song8.setComments(comments);song9.setComments(comments);song10.setComments(comments);

        songs.add(song1);songs.add(song2);songs.add(song3);songs.add(song4);songs.add(song5);
        songs.add(song6);songs.add(song7);songs.add(song8);songs.add(song9);songs.add(song10);
        songs.sort((s1, s2) -> s2.getViews() - s1.getViews());

        P.ln("\t\t\"TOP SONGS\"");
        for (int i = 0; i < songs.size(); i++) {
            Song song = songs.get(i);
            P.ln((i + 1) + ". " + song.getName() + " by " + song.getArtist() + " (Views: )" + song.getViews());
        }

        P.ln("select a number to see more details (or enter 0 to exit): ");
        int choice = Integer.parseInt(scan.nextLine());
        while (choice < 0 || choice > songs.size()) {
            P.ln("Please enter a number between 1 and " + (songs.size() - 1));
            choice = Integer.parseInt(scan.nextLine());
        }
        Song s = songs.get(choice - 1);
        s.addView();
        displaySong(s);
    }
    public void displaySong(Song song){
        Scanner scan = new Scanner(System.in);
        boolean exitSongMenu = false;
        while (!exitSongMenu) {
            P.ln("\n" + song.toString());
            P.ln("\nchose an option: ");
            P.ln("1. see all comments");
            P.ln("2. see song's lyrics");
            P.ln("3. leave a comment");
            P.ln("4. like the song");
            P.ln("5. dislike the song");
            P.ln("6. exit the song list");
            P.ln("enter your choice: ");

            String option = scan.nextLine();
            switch (option) {
                case "1":
                    displayComments(song.getComments());
                    break;
                case "2":
                    P.ln("Lyrics:\n" + song.getLyric());
                    break;
                case "3":
                    P.ln("please enter your username: ");
                    String commenter = scan.nextLine();
                    P.ln("enter your comment: ");
                    String commentText = scan.nextLine();
                    song.addComment(new Comments(commentText, commenter));
                    P.ln("comment added!\n");
                    break;
                case "4":
                    song.addLike();
                    P.ln("you liked the song\n");
                    break;
                case "5":
                    song.addDislike();
                    P.ln("you disliked the song\n");
                    break;
                case "6":
                    exitSongMenu = true;
                    break;
                default:
                    P.ln("invalid option. Try again");
            }
        }
    }
    public void displayArtist(){}
    public void displayAdmin(){}
    public void displayComments(ArrayList<Comments> comments){
        P.ln("comments: ");
        if (comments.isEmpty()) {
            P.ln("No comments yet.");
        } else {
            for (Comments c : comments) {
                P.ln(c.toString());
            }
        }
    }

    public void displaySongs(ArrayList<Song> song) {
        P.ln(song.toString());
    }

    public void displayAlbum(ArrayList<Song> song) {
        P.ln("album songs: ");
        for (Song s : song) {
            P.ln(s.getName() + " by " + s.getArtist());
        }
    }
}