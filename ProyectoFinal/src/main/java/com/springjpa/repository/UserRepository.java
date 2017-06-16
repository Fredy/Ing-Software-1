package com.springjpa.repository;
import java.net.UnknownServiceException;
import java.util.Collection;
import java.util.List;

import com.springjpa.domain.Artist;
import com.springjpa.domain.PlayList;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.springjpa.domain.User;

public interface UserRepository extends CrudRepository<User, Long>{
    // Sets the active boolean to true or false.

    @Query("UPDATE User SET active = TRUE WHERE id = ?1")
    void active(Long id);

    @Query("UPDATE User SET active = FALSE WHERE id = ?1")
    void deactive(Long id);

    // TODO: remove this!
    @Query("SELECT p.name, p.userName, p.password, p.gender, p.signedInDate, p.active FROM User p")
    Collection<User> findAll();
    
    // TODO: change collection with Iterator
    // TODO: CHECK THIS QUERIES!!!
    //Followed Artists:
    @Query("SELECT a FROM  Artist a JOIN a.followedBy f where f.id = ?1")
    Collection<Artist> getFollowedArtists(Long id);
    //select b.fname, b.lname from Users b JOIN b.groups c where c.groupName = :groupName
    //Followed Users:
    @Query("SELECT u FROM  User u JOIN u.followedUsers f where f.id = ?1")
    Collection<User> getFollowedUsers(Long id);

    //Followed Playlists:
    @Query("SELECT p FROM  PlayList p JOIN p.followers f where f.id = ?1")
    Collection<PlayList> getFollowedPlaylists(Long id);


    //Get own playlists
    @Query("SELECT p FROM PlayList p JOIN p.user u where u.id = ?1" )
    Collection<PlayList> getPlaylists(Long id);

    //Get relevant information
    @Query("SELECT u.name AS name, u.email AS email FROM User u where u.id = ?1" )
    Object getRelevantInfo(Long id);
}

