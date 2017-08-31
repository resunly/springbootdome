package com.hank.framework.databaseConnection.jpa.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by hank.he on 2017/8/26.
 */
@Entity
@Table(name = "system_menu")
public class SystemMenu implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;//主键.
    private String name;//名称.
    @Column(columnDefinition = "enum('menu','button')")
    private String menuType;//资源类型，[menu|button]
    private String url;//资源路径.
    private String permission; //权限字符串,menu例子：role:*，button例子：role:create,role:update,role:delete,role:view
    private Long parentId; //父编号
    private Boolean available = Boolean.TRUE;
    @ManyToMany
    @JoinTable(name = "SysRolePermission",
            joinColumns = {@JoinColumn(name = "menuId")},
            inverseJoinColumns = {@JoinColumn(name = "roleId")})
    private List<SysRole> roles;

    public SystemMenu() {
    }

    public SystemMenu(String name, String menuType, String url, String permission, Long parentId, Boolean available) {
        this.name = name;
        this.menuType = menuType;
        this.url = url;
        this.permission = permission;
        this.parentId = parentId;
        this.available = available;
    }

    public SystemMenu(String name, String menuType, String url, String permission, Long parentId, Boolean available, List<SysRole> roles) {
        this.name = name;
        this.menuType = menuType;
        this.url = url;
        this.permission = permission;
        this.parentId = parentId;
        this.available = available;
        this.roles = roles;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public List<SysRole> getRoles() {
        return roles;
    }

    public void setRoles(List<SysRole> roles) {
        this.roles = roles;
    }
}
