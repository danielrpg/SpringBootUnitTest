package com.mockito.controller;

import com.mockito.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HomeController {

    public static final String URL_GET_USERS = "/api/v1/users/getUsers";


    @Autowired
    @Qualifier("UserService")
    private UserService userService;

    @RequestMapping(value = URL_GET_USERS, method = RequestMethod.GET)
    public ResponseEntity<Map<String, Object>> getUsers(){
        return new ResponseEntity<>(userService.getUsers(), HttpStatus.OK);
    }
}
