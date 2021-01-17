package com.zrtech.com.user.controller;

import com.zrtech.com.user.VO.ResponseTemplateVO;
import com.zrtech.com.user.entity.User;
import com.zrtech.com.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info(("inside the saveUser of the UserController"));
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId){
        log.info(("inside the getUserWithDepartment of the UserController"));

        return userService.getUserWithDepartment(userId);
    }
}
