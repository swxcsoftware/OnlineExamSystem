package com.swxc.ssm.service;

import com.swxc.ssm.po.Student;

/**
 * Description
 * Author shadowolf
 * Date 2017/7/28. 8:58
 * Version 1.0
 */
public interface StudentService {

    public Student findStuByUUID(String uuid) throws Exception;

}
