package org.qingqiao.firstboot.service;

import org.qingqiao.firstboot.bean.User;
import org.qingqiao.firstboot.mapper.UserMapper;
import org.qingqiao.firstboot.mapper.UserMapper2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper2 mapper;
    @Autowired
    private UserMapper mapper1;

    @Override
    public List<User> getAllUser() {
        return mapper1.getAllUser();
    }

    @Override
    public List<User> getAllUsers() {
        return mapper.getAllUsers();
    }

    @Override
    public User getUserById(Integer id) {
        return mapper.getUserById(id);
    }

    @Override
    public List<User> getUsersByName(String name) {
        return mapper.getUsersByName(name);
    }

    @Override
    public Integer addUser(User user) {
        return mapper.addUser(user);
    }

    @Override
    public Integer updateUserById(User user) {
        return mapper.updateUserById(user);
    }

    @Override
    public Integer deleteUserById(Integer id) {
        return mapper.deleteUserById(id);
    }
}
