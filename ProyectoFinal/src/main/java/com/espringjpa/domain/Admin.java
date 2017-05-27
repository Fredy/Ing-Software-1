package com.espringjpa.domain;

import javax.persistence.*;

@Entity
public class Admin extends Person{

    @Id
    private long id;

    void activateUser(User targetUser) {

    }

    void deactivateUser(User targetUser) {

    }

    void addArtist(Artist newArtist) {

    }

    void activateArtist(User newArtist) {

    }

    void deactivateArtist(User newArtist) {

    }
}
