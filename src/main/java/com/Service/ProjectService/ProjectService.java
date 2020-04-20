package com.Service.ProjectService;

import com.ORM.model.projectModel.TblProject;

import java.util.List;

public interface ProjectService {

    /**
     * 根据ID查询科研项目
     * @param projectId 科研项目id
     * @return 科研项目信息
     */
    TblProject getProjectInfo(Integer projectId);

    /**
     * 根据项目名查询科研项目
     * @param projectName 科研项目名
     * @return 科研项目信息
     */
    TblProject getProjectInfoByName(String projectName);

    /**
     * 申报科研项目
     * @param tblProject 科研项目对象
     * @return
     */
    Integer addProject(TblProject tblProject);

    /**
     * 通过用户id查询科研项目
     */
    List<TblProject> getProjectByUserId(Integer userId);

    /**
     * 查询院系科研项目
     */
    List<TblProject> getProjectByAcademy(Integer academyId);

    /**
     * 查询所有科研项目
     */
    List<TblProject> getProjectList();

    /**
     * 编辑科研项目
     */
    Integer modifyProject(TblProject tblProject);

    /**
     * 删除科研项目
     */
    Integer deleteProject(Integer projectId);

    /**
     * 科研项目数量查询
     */
    Integer queryProjectNum();

    /**
     * 科研项目总成本查询
     */
    Integer queryProjectCost();

    /**
     * 院系科研项目数量查询
     */
    Integer queryAcademyProjectNum(Integer academyId);

    /**
     * 院系科研项目总成本查询
     */
    Integer queryAcademyProjectCost(Integer academyId);

}
