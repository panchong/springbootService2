package com.allen.ai.mybatis.dao;

import com.allen.ai.mybatis.po.User;

public interface IUserDao {

    User queryUserInfoById(Long id);
}
