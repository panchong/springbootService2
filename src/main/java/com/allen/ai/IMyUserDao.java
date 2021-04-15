package com.allen.ai;

import com.allen.ai.agent.Select;

public interface IMyUserDao {

    @Select("select userName from user where id = #{uId}")
    String queryUserInfo(String uId);
}
