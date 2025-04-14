package org.AP.search;

import org.AP.song.Song;
import java.util.ArrayList;

public class Search {
    public static ArrayList<Song> searchSongs(String query, ArrayList<Song> songs) {
        ArrayList<Song> result = new ArrayList<>();
        String lowerS = query.toLowerCase();
        for (Song s : songs) {
            if (s.getName().toLowerCase().contains(lowerS) ||
                s.getArtist().toLowerCase().contains(lowerS) ||
                s.getAlbum().toLowerCase().contains(lowerS) ||
                s.getGenre().toLowerCase().contains(lowerS)) {
                    result.add(s);
            }
        }
        return result;
    }
}
