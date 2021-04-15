package com.allen.ai.mybatis.dao;

import com.allen.ai.mybatis.po.School;

public interface ISchoolDao {

    School querySchoolInfoById(Long treeId);
}
