package com.xyz.controller;

import com.xyz.dao.UserRepository;
import com.xyz.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * Created by dell on 2017/8/5.
 */
@RestController
public class LoginController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/login/{id}")
    public User login(@PathVariable String id) {
        User user = new User();
        user.setId("1");
        user.setName("南晓峰");
        user.setBirthDate(new Date());
        user.setStreet("南阳路");
        user.setHomeNo("103");
        user.setAge(10);
        userRepository.save(user);
        if(id!=null)user.setId(id);
        return user;
    }

    @GetMapping(value = "findUser/{name}")
    public String logout(@PathVariable("name") String name){
        System.out.println(name);
        return "hh";
    }

    @RequestMapping(value = "/signout")
    public void signout(){
        userRepository.delete("1");
        System.out.println("out!");
    }
}
