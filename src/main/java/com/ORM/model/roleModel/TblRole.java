package com.ORM.model.roleModel;

public class TblRole {
    private Integer roleId;

    private Integer authUser;

    private Integer authProject;

    private Integer authResult;

    private Integer authControl;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getAuthUser() {
        return authUser;
    }

    public void setAuthUser(Integer authUser) {
        this.authUser = authUser;
    }

    public Integer getAuthProject() {
        return authProject;
    }

    public void setAuthProject(Integer authProject) {
        this.authProject = authProject;
    }

    public Integer getAuthResult() {
        return authResult;
    }

    public void setAuthResult(Integer authResult) {
        this.authResult = authResult;
    }

    public Integer getAuthControl() {
        return authControl;
    }

    public void setAuthControl(Integer authControl) {
        this.authControl = authControl;
    }
}