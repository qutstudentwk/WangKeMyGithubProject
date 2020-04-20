package com.Service.ProjectService;

import com.ORM.mapper.projectMapper.TblProjectMapper;
import com.ORM.model.projectModel.TblProject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional
@Service
public class ProjectServiceImpl implements ProjectService{

    @Autowired
    private TblProjectMapper tblProjectMapper;

    @Override
    public TblProject getProjectInfo(Integer projectId) {
        TblProject tblProject = tblProjectMapper.selectByPrimaryKey(projectId);
        return tblProject;
    }

    @Override
    public TblProject getProjectInfoByName(String projectName) {
        TblProject tblProject = tblProjectMapper.selectByProjectName(projectName);
        return tblProject;
    }

    @Override
    public Integer addProject(TblProject tblProject) {
        Integer flag = tblProjectMapper.insert(tblProject);
        return flag;
    }

    @Override
    public List<TblProject> getProjectByUserId(Integer userId) {
        List<TblProject> tblProjectList = tblProjectMapper.selectByUserId(userId);
        return tblProjectList;
    }

    @Override
    public List<TblProject> getProjectByAcademy(Integer academyId) {
        List<TblProject> tblProjectList = tblProjectMapper.selectByAcademyId(academyId);
        return tblProjectList;
    }

    @Override
    public List<TblProject> getProjectList() {
        List<TblProject> tblProjectList = tblProjectMapper.selectAllProject();
        return tblProjectList;
    }

    @Override
    public Integer modifyProject(TblProject tblProject) {
        Integer flag = tblProjectMapper.updateByPrimaryKey(tblProject);
        return flag;
    }

    @Override
    public Integer deleteProject(Integer projectId) {
        Integer flag = tblProjectMapper.deleteByPrimaryKey(projectId);
        return flag;
    }

    @Override
    public Integer queryProjectNum() {
        Integer num = tblProjectMapper.selectAllProject().size();
        return num;
    }

    @Override
    public Integer queryProjectCost() {
        Integer cost = tblProjectMapper.selectSumCost();
        return cost;
    }

    @Override
    public Integer queryAcademyProjectNum(Integer academyId) {
        Integer num = tblProjectMapper.selectByAcademyId(academyId).size();
        return num;
    }

    @Override
    public Integer queryAcademyProjectCost(Integer academyId) {
        Integer cost = tblProjectMapper.selectAcademySumCost(academyId);
        return cost;
    }
}
