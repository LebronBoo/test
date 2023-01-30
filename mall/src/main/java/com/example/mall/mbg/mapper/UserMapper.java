package com.example.mall.mbg.mapper;

import com.example.mall.mbg.model.User;
import com.example.mall.mbg.model.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {


    List<User> selectAll();

    User selectByID(String id);


}