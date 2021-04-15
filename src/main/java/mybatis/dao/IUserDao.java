package mybatis.dao;

import mybatis.po.User;

public interface IUserDao {

    User queryUserInfoById(Long id);
}
