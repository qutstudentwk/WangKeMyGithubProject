package com.Service.ResultService;

import com.ORM.model.resultModel.TblResult;

import java.util.List;

public interface ResultService {

    /**
     * 根据ID查询科研成果
     * @param resultId 科研成果id
     * @return 科研成果信息
     */
    TblResult getResultInfo(Integer resultId);

    /**
     * 根据成果名查询科研成果
     * @param resultName 科研成果名
     * @return 科研成果信息
     */
    TblResult getResultInfoByName(String resultName);

    /**
     * 申报科研成果
     * @param tblResult 科研成果对象
     * @return
     */
    Integer addResult(TblResult tblResult);

    /**
     * 通过用户id查询科研成果
     */
    List<TblResult> getResultByUserId(Integer userId);

    /**
     * 查询院系科研成果
     */
    List<TblResult> getResultByAcademy(Integer academyId);

    /**
     * 查询所有科研成果
     */
    List<TblResult> getResultList();

    /**
     * 编辑科研成果
     */
    Integer modifyResult(TblResult tblResult);

    /**
     * 删除科研成果
     */
    Integer deleteResult(Integer resultId);

    /**
     * 年度科研成果总数
     */
    Integer queryResultNum();

    /**
     * 年度科研成果总价值
     */
    Integer queryResultValue();

    /**
     * 院系科研成果数量
     */
    Integer queryAcademyResultNum(Integer academyId);

    /**
     * 院系科研成果总价值
     */
    Integer queryAcademyResultValue(Integer academyId);
}
