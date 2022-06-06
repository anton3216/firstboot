package org.qingqiao.firstboot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.qingqiao.firstboot.bean.User;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> getAllUser();

    Integer addUser(User user);

    Integer updateUserById(User user);

    Integer deleteUserById(Integer id);
}
