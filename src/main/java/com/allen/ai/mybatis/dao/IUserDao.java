package com.allen.ai.mybatis.dao;

import com.allen.ai.mybatis.po.User;
import org.apache.ibatis.annotations.Select;

public interface IUserDao {

    User queryUserInfoById(Long id);

    String queryUserInfo(String s);
}
