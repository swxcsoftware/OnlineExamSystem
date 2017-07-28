package com.shadowolf.ssm.mapper;

import com.shadowolf.ssm.po.Student;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByUUID(String uuid);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}