package com.swxc.ssm.service.impl;

import com.swxc.ssm.mapper.StudentMapper;
import com.swxc.ssm.po.Student;
import com.swxc.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

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
