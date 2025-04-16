package org.AP.fileManager;

import org.AP.account.Account;
import org.AP.song.Song;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
    public static void saveAccount (Account account) throws IOException{
        String fileName = switch (account.getRole()) {
            case "User" -> "user.txt";
            case "Admin" -> "admin.txt";
            case "Artist" -> "artist.txt";
            default -> "";
        };
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
            bw.write(account.getNameAndAge() + "," +
                    account.getRole() + "," +
                    account.getUsername() + "," +
                    account.getPassword() + "," +
                    account.getEmail());
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveSong (Song song) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("songs.txt", true))) {
            bw.write("Song Details:");
            bw.newLine();
            bw.write("Name: " + song.getName());
            bw.newLine();
            bw.write("Artist: " + song.getArtist());
            bw.newLine();
            bw.write("Album: " + song.getAlbum());
            bw.newLine();
            bw.write("Genre: " + song.getGenre());
            bw.newLine();
            bw.write("Lyrics: " + song.getLyric());
            bw.newLine();
            bw.write("Views: " + song.getViews());
            bw.newLine();
            bw.write("Likes: " + song.getLikes());
            bw.newLine();
            bw.write("====================================");
            bw.newLine();
        } catch (IOException e) {
            throw e;
        }
    }
}
