package com.springjpa.service;

import com.springjpa.domain.User;
import com.springjpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public Collection<User> showUsers(){
        return userRepository.findAll();
    }

    public User showUser(Long id){
        return userRepository.findOne(id);
    }

    public Collection<User> showUFollowed(Long id){
        return userRepository.getFollowedUsers(id);
    }

    public Object showRelevantInfo(Long id) {
        return userRepository.getRelevantInfo(id);
    }

    public void updateRelvantInfo(Long id, String name, String email) {
        userRepository.changeRelevantInfo(id, name, email);
    }

    public Long login(String username, String password) {
        List<Long> id = new ArrayList( userRepository.login(username, password));
        if (id.isEmpty())
            return -1l;
        else
            return id.get(0);

    }
}
