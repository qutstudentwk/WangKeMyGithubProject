package com.Controller.projectController;

import com.Controller.entity.ReportBean;
import com.Controller.entity.Result;
import com.ORM.mapper.academyMapper.TblAcademyMapper;
import com.ORM.model.academyModel.TblAcademy;
import com.ORM.model.projectModel.TblProject;
import com.Service.ProjectService.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * author
 * description project(科研项目) info controller
 * time 2020.03.14
 */
@RestController
@RequestMapping("/project")
public class projectController {

    @Autowired
    private ProjectService projectService;

    @Autowired
    private TblAcademyMapper academyMapper;

    /**
     * 科研项目申报(add)
     */

    @RequestMapping(value = "/addProject", method = RequestMethod.POST)
    public @ResponseBody
    ResponseEntity<Result> addProject(@RequestBody TblProject tblProject) {
        TblProject tblProjectTmp = projectService.getProjectInfoByName(tblProject.getProjName());
        if (null != tblProjectTmp) {
            //不相等则已存在此项目
            Result result = new Result("已存在此科研项目！", 201, null,0);
            return ResponseEntity.ok(result);
        } else {
            Integer flag = projectService.addProject(tblProject);
            if (0 != flag) {
                Result result = new Result("科研项目添加成功！", 200, null,0);
                return ResponseEntity.ok(result);
            } else {
                Result result = new Result("科研项目添加失败,请检查格式！", 201, null,0);
                return ResponseEntity.ok(result);
            }
        }
    }


    /**
     * 通过项目id查询科研项目
     */

    @RequestMapping(value = "/findProject", method = RequestMethod.GET)
    public @ResponseBody
    ResponseEntity<Result> getProject(Integer projectId) {
        TblProject tblProject = projectService.getProjectInfo(projectId);
        if (null != tblProject) {
            Result result = new Result("查询科研项目成功！", 200, tblProject,1);
            return ResponseEntity.ok(result);
        } else {
            Result result = new Result("查询科研项目失败！", 201, null,0);
            return ResponseEntity.ok(result);
        }
    }


    /**
     * 通过项目名查询科研项目
     */

    @RequestMapping(value = "/findProjectByName", method = RequestMethod.GET)
    public @ResponseBody
    ResponseEntity<Result> getProjectByName(@RequestParam String projectName) {
        TblProject tblProject = projectService.getProjectInfoByName(projectName);
        if (null != tblProject) {
            Result result = new Result("查询科研项目成功！", 200, tblProject,1);
            return ResponseEntity.ok(result);
        } else {
            Result result = new Result("查询科研项目失败！", 200, null,0);
            return ResponseEntity.ok(result);
        }
    }


    /**
     * 通过研究员id查询科研项目
     */

    @RequestMapping(value = "/findProjectByUserId", method = RequestMethod.GET)
    public @ResponseBody
    ResponseEntity<Result> getProjectByUserId(@RequestParam Integer userId) {
        List<TblProject> tblProjectList = projectService.getProjectByUserId(userId);
        Result result = new Result("查询科研项目成功！", 0, tblProjectList,tblProjectList.size());
        return ResponseEntity.ok(result);

    }


    /**
     * 查询院系科研项目
     */

    @RequestMapping(value = "/findProjectByAcademy", method = RequestMethod.GET)
    public @ResponseBody
    ResponseEntity<Result> getProjectByAcademy(@RequestParam Integer academyId) {
        List<TblProject> tblProjectList = projectService.getProjectByAcademy(academyId);
        Result result = new Result("查询科研项目成功！", 0, tblProjectList,tblProjectList.size());
        return ResponseEntity.ok(result);
    }


    /**
     * 查询所有科研项目
     */

    @RequestMapping(value = "/findProjectList", method = RequestMethod.GET)
    public @ResponseBody
    ResponseEntity<Result> getProjectList() {
        List<TblProject> projectList = projectService.getProjectList();
        Result result = new Result("查询科研项目成功！", 0, projectList,projectList.size());
        return ResponseEntity.ok(result);
    }


    /**
     * 编辑科研项目
     */
    @RequestMapping(value = "/modifyProject", method = RequestMethod.POST)
    public @ResponseBody
    ResponseEntity<Result> modifyProject(@RequestBody TblProject tblProject) {
        Integer flag = projectService.modifyProject(tblProject);
        if (0 != flag) {
            Result result = new Result("科研项目修改成功！", 200, null,0);
            return ResponseEntity.ok(result);
        } else {
            Result result = new Result("科研项目修改失败,请检查格式！", 201, null,0);
            return ResponseEntity.ok(result);
        }
    }


    /**
     * 删除科研项目
     */
    @RequestMapping(value = "/deleteProject", method = RequestMethod.DELETE)
    public @ResponseBody
    ResponseEntity<Result> deleteProject(Integer projectId) {
        Integer flag = projectService.deleteProject(projectId);
        if (0 != flag) {
            Result result = new Result("科研项目删除成功！", 200, null,0);
            return ResponseEntity.ok(result);
        } else {
            Result result = new Result("科研项目删除失败,请检查格式！", 201, null,0);
            return ResponseEntity.ok(result);
        }
    }
    /**
     * 年度科研项目数量查询
     */
    @RequestMapping(value = "/queryProjectNum", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<Result> queryProjectNum()
    {
        List<ReportBean> reportBeans = new ArrayList<>(8);
        Integer num = 0;
        //所有院系集合
        List<TblAcademy> academyList = academyMapper.selectAll();
        for (int i = 0; i < academyList.size(); i++)
        {
            ReportBean reportBean = new ReportBean();
            num = projectService.queryAcademyProjectNum(academyList.get(i).getAcademyId());
            reportBean.setName(academyList.get(i).getAcademyName());
            reportBean.setValue(num);
            reportBeans.add(reportBean);
        }
        Result result = new Result("各院系科研项目总数",200,reportBeans,reportBeans.size());
        return ResponseEntity.ok(result);
    }

    /**
     * 年度科研项目总经费
     */
    @RequestMapping(value = "/queryProjectCost", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<Result> queryProjectCost()
    {
        List<ReportBean> reportBeans = new ArrayList<>(8);
        Integer cost = 0;
        //所有院系集合
        List<TblAcademy> academyList = academyMapper.selectAll();
        for (int i = 0; i < academyList.size(); i++)
        {
            ReportBean reportBean = new ReportBean();
            cost = projectService.queryAcademyProjectCost(academyList.get(i).getAcademyId());
            reportBean.setName(academyList.get(i).getAcademyName());
            reportBean.setValue(cost);
            reportBeans.add(reportBean);
        }
        Result result = new Result("各院系科研项目总成本",200,reportBeans,reportBeans.size());
        return ResponseEntity.ok(result);
    }

    /**
     * 院系年度科研项目数量查询
     */
    @RequestMapping(value = "/queryAcademyProjectNum", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<Result> queryAcademyProjectNum(@RequestParam Integer academyId)
    {
        Integer num = projectService.queryAcademyProjectNum(academyId);
        Result result = new Result("院系科研项目总数",200,num,0);
        return ResponseEntity.ok(result);
    }

    /**
     * 院系科研项目总经费
     */
    @RequestMapping(value = "/queryAcademyProjectCost", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<Result> queryAcademyProjectCost(@RequestParam Integer academyId)
    {
        Integer cost = projectService.queryAcademyProjectCost(academyId);
        Result result = new Result("院系科研项目总成本",200,cost,0);
        return ResponseEntity.ok(result);
    }


}
