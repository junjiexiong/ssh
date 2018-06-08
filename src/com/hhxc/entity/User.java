package com.hhxc.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class User {
    private int userid;
    private String username;
    private Integer age;

    @Id
    @Column(name = "userid", nullable = false)
    public int getUserid () {
        return userid;
    }

    public void setUserid (int userid) {
        this.userid = userid;
    }

    @Basic
    @Column(name = "username", nullable = true, length = 20)
    public String getUsername () {
        return username;
    }

    public void setUsername (String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "age", nullable = true)
    public Integer getAge () {
        return age;
    }

    public void setAge (Integer age) {
        this.age = age;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (userid != user.userid) return false;
        if (username != null ? ! username.equals(user.username) : user.username != null) return false;
        if (age != null ? ! age.equals(user.age) : user.age != null) return false;

        return true;
    }

    @Override
    public int hashCode () {
        int result = userid;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        return result;
    }
}
