package com.shadowolf.ssm.service;

import com.shadowolf.ssm.po.Student;

import java.util.List;

/**
 * Description
 * Author shadowolf
 * Date 2017/7/28. 8:58
 * Version 1.0
 */
public interface StudentService {

    public Student findStuByUUID(String uuid) throws Exception;

}
