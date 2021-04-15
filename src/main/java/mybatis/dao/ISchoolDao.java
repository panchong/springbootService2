package mybatis.dao;

import mybatis.po.School;

public interface ISchoolDao {

    School querySchoolInfoById(Long treeId);
}
