package com.shadowolf.ssm.controller;

import com.shadowolf.ssm.po.Student;
import com.shadowolf.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Description
 * Author shadowolf
 * Date 2017/7/28. 9:03
 * Version 1.0
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("findStuById")
    public ModelAndView findStuById() throws Exception {
        Student student = studentService.findStuByUUID("1");
        System.out.println(student.getUsername());
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("student", student);
        modelAndView.setViewName("studentShow");
        return modelAndView;
    }

}
