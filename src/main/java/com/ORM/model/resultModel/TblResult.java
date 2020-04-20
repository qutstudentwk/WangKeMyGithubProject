package com.ORM.model.resultModel;

public class TblResult {
    private Integer resultId;

    private String resultName;

    private Integer resultCost;

    private Integer resultInvest;

    private Integer resultValue;

    private String resultIntroduction;

    private Integer areaId;

    private Integer userId;

    private Integer academyId;

    public Integer getResultId() {
        return resultId;
    }

    public void setResultId(Integer resultId) {
        this.resultId = resultId;
    }

    public String getResultName() {
        return resultName;
    }

    public void setResultName(String resultName) {
        this.resultName = resultName == null ? null : resultName.trim();
    }

    public Integer getResultCost() {
        return resultCost;
    }

    public void setResultCost(Integer resultCost) {
        this.resultCost = resultCost;
    }

    public Integer getResultInvest() {
        return resultInvest;
    }

    public void setResultInvest(Integer resultInvest) {
        this.resultInvest = resultInvest;
    }

    public Integer getResultValue() {
        return resultValue;
    }

    public void setResultValue(Integer resultValue) {
        this.resultValue = resultValue;
    }

    public String getResultIntroduction() {
        return resultIntroduction;
    }

    public void setResultIntroduction(String resultIntroduction) {
        this.resultIntroduction = resultIntroduction == null ? null : resultIntroduction.trim();
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAcademyId() {
        return academyId;
    }

    public void setAcademyId(Integer academyId) {
        this.academyId = academyId;
    }
}