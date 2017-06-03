package com.springjpa.repository;
import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.springjpa.domain.User;

public interface UserRepository extends CrudRepository<User, Long>{
    // TODO: more queries ??
    // Sets the active boolean to true or false.
    @Query("UPDATE User SET active = TRUE WHERE id = ?1")
    void active(long id);

    @Query("UPDATE User SET active = FALSE WHERE id = ?1")
    void deactive(long id);

}
