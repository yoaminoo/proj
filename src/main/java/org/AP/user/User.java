package org.AP.user;

import org.AP.account.Account;

import java.util.ArrayList;

public class User extends Account {
    private ArrayList<String> followedArtists;

    public User(String role, String nameAndAge, String username, String password, String Email) {
        super(role, nameAndAge, username, password, Email);
        followedArtists = new ArrayList<>();
    }

    public void addFollowedArtist(String artist){
        if (!followedArtists.contains(artist)){
            followedArtists.add(artist);
        }
    }

    public ArrayList<String> getFollowedArtists(){
        return followedArtists;
    }
}
