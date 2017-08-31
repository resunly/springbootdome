package com.hank.framework.databaseConnection.jpa.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by hank.he on 2017/8/26.
 */
@Entity
@Table(name = "user_info")
public class UserInfo {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "login_name", unique = true)
    private String LoginName;//登陆帐号

    @Column(name = "nick_name")
    private String nickName;//昵称

    @Column(name = "login_pwd")
    private String password; //登陆密码;

    private char status;//用户状态,0:创建未认证（比如没有激活，没有输入验证码等等）--等待验证的用户 , 1:正常状态,2：用户被锁定.

    @ManyToMany(fetch = FetchType.EAGER)//立即从数据库中进行加载数据;
    @JoinTable(name = "SysUserRole",
            joinColumns = {@JoinColumn(name = "userId")},
            inverseJoinColumns = {@JoinColumn(name = "roleId")})
    private List<SysRole> roleList;// 一个用户具有多个角色

    public UserInfo() {
    }

    public UserInfo(String loginName, String nickName, String password, String salt, char status) {
        LoginName = loginName;
        this.nickName = nickName;
        this.password = password;
        this.status = status;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginName() {
        return LoginName;
    }

    public void setLoginName(String loginName) {
        LoginName = loginName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }


}
