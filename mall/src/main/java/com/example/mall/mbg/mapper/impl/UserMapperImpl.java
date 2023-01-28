package com.example.mall.mbg.mapper.impl;

import com.example.mall.mbg.mapper.UserMapper;
import com.example.mall.mbg.model.User;
import com.example.mall.mbg.model.UserExample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class UserMapperImpl implements UserMapper {
    /*
    执行SQl语句对象
    */
    private static PreparedStatement ps;
    /*
    数据库连接
    */
    private  static Connection conn;
    /*
    结果集
    */
    private static ResultSet rs;

    @Override
    public int countByExample(UserExample example) {
        try{

        }
        return 0;
    }

    @Override
    public int deleteByExample(UserExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(String id) {
        return 0;
    }

    @Override
    public int insert(User record) {
        return 0;
    }

    @Override
    public int insertSelective(User record) {
        return 0;
    }

    @Override
    public List<User> selectByExample(UserExample example) {
        return null;
    }

    @Override
    public User selectByPrimaryKey(String id) {
        return null;
    }

    @Override
    public int updateByExampleSelective(User record, UserExample example) {
        return 0;
    }

    @Override
    public int updateByExample(User record, UserExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return 0;
    }
}
