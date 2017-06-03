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
    //Followed Artists:
    @Query("SELECT f FROM  Artist a JOIN a.followedBy f where f.id = ?1")
    Collection<Artist> getFollowedArtists(long id);

    //Followed Users:
    @Query("SELECT f FROM  User u JOIN u.followedUsers f where f.id = ?1")
    Collection<User> getFollowedUsers(long id);

    //ERROR: playlist is not mapped ???
    //Followed Playlists:
    //@Query("SELECT f FROM  Playlist p JOIN p.followers f where f.id = ?1")
    //Collection<PlayList> getFollowedPlaylists(long id);

    /*
    //Get own playlists
    @Query("SELECT f FROM  Playlist p JOIN p.followers f where f.id = ?1")
    Collection<PlayList> getPlaylists();
*/

}
