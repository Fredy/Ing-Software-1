package com.springjpa.repository;
import java.util.Collection;

import org.springframework.data.repository.CrudRepository;

import com.springjpa.domain.User;

public interface UserRepository extends CrudRepository<User, Long>{
    // TODO: more queries ??
}
