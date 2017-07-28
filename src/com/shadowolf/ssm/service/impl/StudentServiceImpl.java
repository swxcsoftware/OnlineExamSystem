package com.shadowolf.ssm.service.impl;

import com.shadowolf.ssm.mapper.StudentMapper;
import com.shadowolf.ssm.po.Student;
import com.shadowolf.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

/**
 * Description
 * Author shadowolf
 * Date 2017/7/28. 9:01
 * Version 1.0
 */
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student findStuByUUID(String uuid) throws Exception {
        return studentMapper.selectByUUID(uuid);
    }

}
