package com.ORM.model.projectModel;

import java.util.Date;

public class TblProject {
    private Integer projId;

    private String projName;

    private Integer projCost;

    private Date projDate;

    private Integer projState;

    private Integer userId;

    private Integer areaId;

    private Integer academyId;

    public Integer getProjId() {
        return projId;
    }

    public void setProjId(Integer projId) {
        this.projId = projId;
    }

    public String getProjName() {
        return projName;
    }

    public void setProjName(String projName) {
        this.projName = projName == null ? null : projName.trim();
    }

    public Integer getProjCost() {
        return projCost;
    }

    public void setProjCost(Integer projCost) {
        this.projCost = projCost;
    }

    public Date getProjDate() {
        return projDate;
    }

    public void setProjDate(Date projDate) {
        this.projDate = projDate;
    }

    public Integer getProjState() {
        return projState;
    }

    public void setProjState(Integer projState) {
        this.projState = projState;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Integer getAcademyId() {
        return academyId;
    }

    public void setAcademyId(Integer academyId) {
        this.academyId = academyId;
    }
}