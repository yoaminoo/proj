package org.AP.artist;

import org.AP.account.Account;
import org.AP.p.P;
import org.AP.song.Song;

import java.util.Scanner;

public class Artist extends Account {
    public Artist(String role, String nameAndAge, String username, String password, String Email) {
        super(role, nameAndAge, username, password, Email);
    }
    public Artist(Artist artist) {
        super(artist.role, artist.nameAndAge, artist.username, artist.password, artist.Email);
    }

    public Song newSong(){
        Scanner scan = new Scanner(System.in);
        P.ln("Enter the name of the song: ");
        String name = scan.nextLine();
        P.ln("Enter the artist's name: ");
        String artist = this.getUsername();
        P.ln("Enter the song's album: ");
        String album = scan.nextLine();
        P.ln("Enter the song's genre: ");
        String genre = scan.nextLine();
        P.ln("Enter the song's lyrics: ");
        String lyrics = scan.nextLine();

        Song song = new Song(name, artist, album, genre, lyrics);

        return song;
    }
}
