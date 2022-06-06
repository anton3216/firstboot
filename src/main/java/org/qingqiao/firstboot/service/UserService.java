package org.qingqiao.firstboot.service;

import org.apache.ibatis.annotations.*;
import org.qingqiao.firstboot.bean.User;

import java.util.List;

public interface UserService {

    List<User> getAllUser();

    List<User> getAllUsers();

    User getUserById(Integer id);

    List<User> getUsersByName(String name);

    Integer addUser(User user);

    Integer updateUserById(User user);

    Integer deleteUserById(Integer id);
}
