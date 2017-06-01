package com.espringjpa.repository;
import java.util.Collection;
import com.espringjpa.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>{
    // TODO: more queries ??
}
