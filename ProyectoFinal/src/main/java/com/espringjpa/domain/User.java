package com.espringjpa.domain;
import java.util.Vector;

import javax.persistence.*;

@Entity
public class User extends Person {

    @Id
    private long id;

    private Timeline timeline; // It could conflict with timeline from javafx...
    private Vector<Artist> followedArtists;
    private Vector<User> followedUsers;
    private Vector<PlayList> playlists;
    private Vector<PlayList> followedPlaylists;

    public Timeline getTimeline() {
        return timeline;
    }

    public Vector<Artist> getFollowedArtists() {
        return followedArtists;
    }

    public Vector<User> getFollowedUsers() {
        return followedUsers;
    }

    public Vector<PlayList> getPlaylists() {
        return playlists;
    }

    public Vector<PlayList> getFollowedPlaylists() {
        return followedPlaylists;
    }

    void followUser(User targetUser) {
        // TODO: Verify: if this already follows a User -> do nothing, else add it; or this is part of the db?.
        followedUsers.add(targetUser);
    }

    void unfollowUser(User targetUser) {
        followedUsers.remove(targetUser);
    }

    void followArtist(Artist targetArtist) {
        // TODO: Verify: if this already follows a User -> do nothing, else add it; or this is part of the db?.
        followedArtists.add(targetArtist);
    }

    void unfollowArtist(User targetArtist) {
        followedArtists.remove(targetArtist);
    }

    void createPlaylist(String playlistName) {
        // TODO: do something
    }

    void rateSong(Song song, int points) {
        // TODO: do something;
    }

    void followPlaylist(PlayList targetPlaylist) {
        // TODO: Verify: if this already follows a User -> do nothing, else add it; or this is part of the db?.
        followedPlaylists.add(targetPlaylist);
    }

    void unfollowPlaylist(PlayList targetPlaylist) {
        followedPlaylists.remove(targetPlaylist);
    }

}
