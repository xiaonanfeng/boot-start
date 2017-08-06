package com.xyz.model;

import com.alibaba.fastjson.annotation.JSONField;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by dell on 2017/8/5.
 */
@Entity
@Table(name="JCB_USER")
public class User {

    @Id
    private String id;
    private String name;
    private Integer age;
    @JSONField(format = "yyyy-mm-dd HH:mm:ss")
    private Date birthDate;
    @JSONField(serialize = false)
    private String secondName;
    private String street;
    private String homeNo;

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHomeNo() {
        return homeNo;
    }

    public void setHomeNo(String homeNo) {
        this.homeNo = homeNo;
    }
}
