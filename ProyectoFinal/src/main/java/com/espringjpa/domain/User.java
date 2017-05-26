package com.espringjpa.domain;
import java.util.Vector;

public class User extends Person {
    private Timeline timeline; //TODO: puede haber conflicto con Timeline de javafx...
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
        // TODO: verificar: si ya lo sigue, no hace nada, o esto es parte de la base de datos.
        followedUsers.add(targetUser);
    }

    void unfollowUser(User targetUser) {
        followedUsers.remove(targetUser);
    }

    void followArtist(Artist targetArtist) {
        // TODO: verificar: si ya lo sigue, no hace nada, o esto es parte de la base de datos.
        followedArtists.add(targetArtist);
    }

    void unfollowArtist(User targetArtist) {
        followedArtists.remove(targetArtist);
    }

    void createPlaylist(String playlistName) {
        // TODO: hacer algo;
    }

    void rateSong(Song song, int points) {
        // TODO: do something;
    }

    void followPlaylist(PlayList targetPlaylist) {
        // TODO: verificar: si ya lo sigue, no hace nada, o esto es parte de la base de datos.
        followedPlaylists.add(targetPlaylist);
    }

    void unfollowPlaylist(PlayList targetPlaylist) {
        followedPlaylists.remove(targetPlaylist);
    }

}
