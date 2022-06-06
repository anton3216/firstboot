package org.qingqiao.firstboot.mapper;

import org.apache.ibatis.annotations.*;
import org.qingqiao.firstboot.bean.User;

import java.util.List;
@Mapper
public interface UserMapper2 {
    @Select("select * from demo")
    List<User> getAllUsers();

    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "u"),
            @Result(property = "address", column = "a")
    })
    @Select("select name as u,address as a,id as id from user where id=#{id}")
    User getUserById(Integer id);

    @Select("select * from user where username like concat('%',#{name},'%')")
    List<User> getUsersByName(String name);

    @Insert({"insert into user(username,address) values(#{username},#{address})"})
    @SelectKey(statement = "select last_insert_id()", keyProperty = "id", before = false, resultType = Integer.class)
    Integer addUser(User user);

    @Update("update user set username=#{username},address=#{address} where id=#{id}")
    Integer updateUserById(User user);

    @Delete("delete from user where id=#{id}")
    Integer deleteUserById(Integer id);
}
