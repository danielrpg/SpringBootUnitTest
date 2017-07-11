package com.mockito.service.impl;

import com.mockito.domain.User;
import com.mockito.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("UserService")
public class UserServiceImpl implements UserService{

    private List<User> users = new ArrayList<>();

    @Override
    public Map<String, Object> getUsers() {
        Map<String, Object> result = new HashMap<>();
        result.put("usuarios", getListUsers());
        return result;
    }

    private List<User> getListUsers(){
        users.add(new User("danielrpg", "123", "Daniel", "Fernandez"));
        users.add(new User("juanrpg", "123", "Juan", "Fernandez"));
        users.add(new User("pedrorpg", "123", "Pedro", "Fernandez"));
        users.add(new User("pablorpg", "123", "Pablo", "Fernandez"));
        return users;
    }



}
