package com.springjpa.domain;

import java.util.Date;
import java.util.List;
import java.util.Vector;

import javax.persistence.*;

@Entity
@Table(name = "user_table")
@PrimaryKeyJoinColumn(referencedColumnName="id")
public class User extends Person {
    @OneToOne
    @JoinColumn(name="timeline_id")
    private Timeline timeline; // It could conflict with timeline from javafx...

    @ManyToMany(mappedBy="followedBy")
    private List<Artist> followedArtists;

    public List<User> getFollowedUsers() {
        return followedUsers;
    }

    @ManyToMany
    @JoinTable (
            name = "UserUser",
            joinColumns = @JoinColumn(name = "UserID1", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name="UserID2", referencedColumnName = "id")
    )
    private List<User> followedUsers;
    
    
    @OneToMany(mappedBy = "user")
    private List<PlayList> playlists;

    @ManyToMany(mappedBy="followers")
    private List<PlayList> followedPlaylists;

    public User(String name, String email, boolean gender, String userName,
                String password, Date signedInDate, Timeline timeline) {
        super(name, email ,gender, userName, password, signedInDate);
        this.timeline = timeline;
        this.followedArtists = new Vector<Artist>();
        this.followedPlaylists = new  Vector<PlayList>();
        this.followedUsers = new Vector<User>();
    }

    public User() {
        this.followedArtists = new Vector<Artist>();
        this.followedPlaylists = new  Vector<PlayList>();
        this.followedUsers = new Vector<User>();

    }
/*
    public Timeline getTimeline() {
        return timeline;
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
    */

}

