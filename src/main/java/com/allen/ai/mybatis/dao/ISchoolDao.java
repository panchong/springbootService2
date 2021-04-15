package com.allen.ai.mybatis.dao;

import com.allen.ai.mybatis.po.School;
import org.apache.ibatis.annotations.Select;

public interface ISchoolDao {

    School querySchoolInfoById(Long treeId);
}
