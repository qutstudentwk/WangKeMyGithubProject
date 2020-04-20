package com.ORM.mapper.projectMapper;

import com.ORM.model.projectModel.TblProject;
import com.ORM.model.projectModel.TblProjectExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TblProjectMapper {
    int countByExample(TblProjectExample example);

    int deleteByExample(TblProjectExample example);

    int deleteByPrimaryKey(Integer projId);

    int insert(TblProject record);

    int insertSelective(TblProject record);

    List<TblProject> selectByExample(TblProjectExample example);

    TblProject selectByPrimaryKey(Integer projId);

    int updateByExampleSelective(@Param("record") TblProject record, @Param("example") TblProjectExample example);

    int updateByExample(@Param("record") TblProject record, @Param("example") TblProjectExample example);

    int updateByPrimaryKeySelective(TblProject record);

    int updateByPrimaryKey(TblProject record);

    /**
     * 根据名称查询科研项目
     * @param projectName 项目名
     * @return
     */
    TblProject selectByProjectName(String projectName);

    /**
     * 根据用户id查询科研项目
     */
    List<TblProject> selectByUserId(Integer userId);

    /**
     * 根据院系id查询科研项目列表
     */
    List<TblProject> selectByAcademyId(Integer academyId);

    /**
     * 查询全部科研项目
     */
    List<TblProject> selectAllProject();

    /**
     * 查询科研项目总经费
     */
    Integer selectSumCost();

    /**
     * 查询院系科研项目总经费
     */
    Integer selectAcademySumCost(Integer academyId);

}