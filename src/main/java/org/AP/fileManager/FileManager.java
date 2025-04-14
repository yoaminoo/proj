package org.AP.fileManager;

import org.AP.account.Account;
import org.AP.song.Song;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
    public static void saveAccount (Account account) throws IOException{
        String fileName = "";
        switch (account.getRole()) {
            case "User" :
                fileName = "user.txt";
            case "Admin" :
                fileName = "admin.txt";
            case "Artist" :
                fileName = "artist.txt";
        }
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

    public static void saveSongs (Song song) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("songs.txt", true))) {
            bw.write(song.getName() + "," +
                    song.getArtist() + "," +
                    song.getAlbum() + "," +
                    song.getGenre() + "," +
                    song.getLyric() + "," +
                    song.getViews() + "," +
                    song.getLikes());
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
