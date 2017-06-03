package com.springjpa.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@PrimaryKeyJoinColumn(referencedColumnName="id")
public class Admin extends Person{

    public Admin(String name, boolean gender, String userName, String password, Date signedInDate) {
        super(name, gender, userName, password, signedInDate);
    }

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
