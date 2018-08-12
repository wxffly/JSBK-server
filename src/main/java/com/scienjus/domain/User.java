package com.scienjus.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 用户数据的domain类
 */
@Entity
@Table(name = "user_")
public class User {
    //用户名
    @Column(name = "username_")
    private String username;

    //密码
    @Column(name = "password_")
    private String password;

    //用户id
    @Id
    @Column(name = "id_")
    private long id;

    //昵称
    @Column(name = "nickname_")
    private String nickname;

    //性别
    @Column(name = "sex_")
    private int sex;

    //注册时间
    @Column(name = "register_date_")
    private String register_date;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getRegister_date() {
        return register_date;
    }

    public void setRegister_date(String register_date) {
        this.register_date = register_date;
    }
}
