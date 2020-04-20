package com.ORM.mapper.resultMapper;

import com.ORM.model.resultModel.TblResult;
import com.ORM.model.resultModel.TblResult;
import com.ORM.model.resultModel.TblResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblResultMapper {
    int countByExample(TblResultExample example);

    int deleteByExample(TblResultExample example);

    int deleteByPrimaryKey(Integer resultId);

    int insert(TblResult record);

    int insertSelective(TblResult record);

    List<TblResult> selectByExample(TblResultExample example);

    TblResult selectByPrimaryKey(Integer resultId);

    int updateByExampleSelective(@Param("record") TblResult record, @Param("example") TblResultExample example);

    int updateByExample(@Param("record") TblResult record, @Param("example") TblResultExample example);

    int updateByPrimaryKeySelective(TblResult record);

    int updateByPrimaryKey(TblResult record);

    /**
     * 根据名称查询科研成果
     * @param resultName 成果名
     * @return
     */
    TblResult selectByResultName(String resultName);

    /**
     * 根据用户id查询科研成果
     */
    List<TblResult> selectByUserId(Integer userId);

    /**
     * 根据院系id查询科研成果列表
     */
    List<TblResult> selectByAcademyId(Integer academyId);

    /**
     * 查询全部科研成果
     */
    List<TblResult> selectAllResult();

    /**
     * 查询年度科研成果总价值
     */
    Integer selectSumValue();

    /**
     * 查询院系年度科研成果总价值
     */
    Integer selectAcademySumValue(Integer academyId);
}