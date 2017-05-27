package com.espringjpa.repository;
import java.util.Collection;
import com.espringjpa.domain.User;

public interface IUserRepository {
    void save(User user);
    User get(long idNumber);
    Collection<User> getAll();
    void remove(String idNumber);
    // TODO: add id's and db connection in User class
}
