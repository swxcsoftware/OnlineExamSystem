package com.shadowolf.ssm.po;

import java.util.Date;

public class Student {
    private Integer id;

    private String uuid;

    private String username;

    private String password;

    private String stu_id;

    private String name;

    private String sex;

    private Integer age;

    private String phone;

    private String email;

    private String province_uuid;

    private String city_uuid;

    private String county_uuid;

    private String school_uuid;

    private String college_uuid;

    private Date create_date;

    private Date update_date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id == null ? null : stu_id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getProvince_uuid() {
        return province_uuid;
    }

    public void setProvince_uuid(String province_uuid) {
        this.province_uuid = province_uuid == null ? null : province_uuid.trim();
    }

    public String getCity_uuid() {
        return city_uuid;
    }

    public void setCity_uuid(String city_uuid) {
        this.city_uuid = city_uuid == null ? null : city_uuid.trim();
    }

    public String getCounty_uuid() {
        return county_uuid;
    }

    public void setCounty_uuid(String county_uuid) {
        this.county_uuid = county_uuid == null ? null : county_uuid.trim();
    }

    public String getSchool_uuid() {
        return school_uuid;
    }

    public void setSchool_uuid(String school_uuid) {
        this.school_uuid = school_uuid == null ? null : school_uuid.trim();
    }

    public String getCollege_uuid() {
        return college_uuid;
    }

    public void setCollege_uuid(String college_uuid) {
        this.college_uuid = college_uuid == null ? null : college_uuid.trim();
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Date getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(Date update_date) {
        this.update_date = update_date;
    }
}