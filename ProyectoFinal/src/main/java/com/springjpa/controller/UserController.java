package com.springjpa.controller;

import com.springjpa.domain.User;
import com.springjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @ResponseBody
    public Collection<User> showUsers(){
        return userService.showUsers();
    }

    @RequestMapping(value = "/usera", method = RequestMethod.GET)
    @ResponseBody
    public User showUser(@RequestParam Long id){
        return userService.showUser(id);
    }

    @RequestMapping(value = "/ufollowed", method = RequestMethod.GET)
    @ResponseBody
    public Collection<User> showUFollowed(@RequestParam Long id){
        return userService.showUFollowed(id);
    }

    @RequestMapping(value = "/relevantInfo", method = RequestMethod.GET)
    @ResponseBody
    public Object showRelevantInfo(@RequestParam Long id){
        return userService.showRelevantInfo(id);
    }
}
