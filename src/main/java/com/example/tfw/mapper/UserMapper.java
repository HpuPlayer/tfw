package com.example.tfw.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.tfw.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper extends BaseMapper<User> {

    @Select("select * from t_user")
    User selectByUUID();

    @Select("select u.username from t_user u where u.uuid =:uuid")
    String selectUserName(String uuid);

}
