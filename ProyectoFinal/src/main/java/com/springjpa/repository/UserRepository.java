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
    void active(long id);

    @Query("UPDATE User SET active = FALSE WHERE id = ?1")
    void deactive(long id);

    // TODO: remove this!
    @Query("SELECT p FROM User p")
    Collection<User> findAll();
    
    // TODO: change collection with Iterator
    // TODO: CHECK THIS QUERIES!!!
    //Followed Artists:
    @Query("SELECT a FROM  Artist a JOIN a.followedBy f where f.id = ?1")
    Collection<Artist> getFollowedArtists(long id);
    //select b.fname, b.lname from Users b JOIN b.groups c where c.groupName = :groupName
    //Followed Users:
    @Query("SELECT u FROM  User u JOIN u.followedUsers f where f.id = ?1")
    Collection<User> getFollowedUsers(long id);

    //Followed Playlists:
    @Query("SELECT p FROM  PlayList p JOIN p.followers f where f.id = ?1")
    Collection<PlayList> getFollowedPlaylists(long id);


    //Get own playlists
    @Query("SELECT p FROM PlayList p JOIN p.user u where u.id = ?1" )
    Collection<PlayList> getPlaylists(long id);
}
