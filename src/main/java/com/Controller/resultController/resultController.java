package com.Controller.resultController;

import com.Controller.entity.ReportBean;
import com.Controller.entity.Result;
import com.ORM.mapper.academyMapper.TblAcademyMapper;
import com.ORM.model.academyModel.TblAcademy;
import com.ORM.model.resultModel.TblResult;
import com.Service.ResultService.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * author
 * description result(科研成果) info controller
 * time 2020.03.15
 */
@RestController
@RequestMapping("/result")
public class resultController {

    @Autowired
    private ResultService resultService;

    @Autowired
    private TblAcademyMapper academyMapper;

    /**
     * 科研成果登记(add)
     */

    @RequestMapping(value = "/addResult", method = RequestMethod.POST)
    public @ResponseBody
    ResponseEntity<Result> addResult(@RequestBody TblResult tblResult)
    {
        TblResult tblResultTmp = resultService.getResultInfoByName(tblResult.getResultName());
        if(null != tblResultTmp)
        {
            //不相等则已存在此成果
            Result result = new Result("已存在此科研成果！",201,null,0);
            return ResponseEntity.ok(result);
        }
        else{
            Integer flag = resultService.addResult(tblResult);
            if (0 != flag)
            {
                Result result = new Result("科研成果添加成功！",200,null,0);
                return ResponseEntity.ok(result);
            }else
            {
                Result result = new Result("科研成果添加失败,请检查格式！",201,null,0);
                return ResponseEntity.ok(result);
            }
        }
    }


    /**
     * 通过成果id查询科研成果
     */

    @RequestMapping(value = "/findResult", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<Result> getResult(Integer resultId)
    {
        TblResult tblResult = resultService.getResultInfo(resultId);
        if (null != tblResult)
        {
            Result result = new Result("查询科研成果成功！",200,tblResult,1);
            return ResponseEntity.ok(result);
        }else
        {
            Result result = new Result("查询科研成果失败！",201,null,0);
            return ResponseEntity.ok(result);
        }
    }


    /**
     * 通过成果名查询科研成果
     */

    @RequestMapping(value = "/findResultByName", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<Result> getResultByName(@RequestParam String resultName)
    {
        TblResult tblResult = resultService.getResultInfoByName(resultName);
        if (null != tblResult)
        {
            Result result = new Result("查询科研成果成功！",200,tblResult,1);
            return ResponseEntity.ok(result);
        }else
        {
            Result result = new Result("查询科研成果失败！",200,null,0);
            return ResponseEntity.ok(result);
        }
    }


    /**
     * 通过研究员id查询科研成果
     */

    @RequestMapping(value = "/findResultByUserId", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<Result> getResultByUserId(@RequestParam Integer userId) {
        List<TblResult> tblResultList = resultService.getResultByUserId(userId);
        Result result = new Result("查询科研成果成功！", 0, tblResultList, tblResultList.size());
        return ResponseEntity.ok(result);
    }


    /**
     * 查询院系科研成果
     */

    @RequestMapping(value = "/findResultByAcademy", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<Result> getResultByAcademy(@RequestParam Integer academyId)
    {
        List<TblResult> tblResultList = resultService.getResultByAcademy(academyId);
        Result result = new Result("查询科研成果成功！",0,tblResultList,tblResultList.size());
        return ResponseEntity.ok(result);
    }


    /**
     * 查询所有科研成果
     */

    @RequestMapping(value = "/findResultList", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<Result> getResultList()
    {
        List<TblResult> resultList = resultService.getResultList();
        Result result = new Result("查询科研成果成功！",0,resultList,resultList.size());
        return ResponseEntity.ok(result);
    }


    /**
     * 编辑科研成果
     */
    @RequestMapping(value = "/modifyResult", method = RequestMethod.POST)
    public @ResponseBody ResponseEntity<Result> modifyResult(TblResult tblResult)
    {
        Integer flag = resultService.modifyResult(tblResult);
        if (0 != flag)
        {
            Result result = new Result("科研成果修改成功！",200,null,0);
            return ResponseEntity.ok(result);
        }else
        {
            Result result = new Result("科研成果修改失败,请检查格式！",201,null,0);
            return ResponseEntity.ok(result);
        }
    }


    /**
     * 删除科研成果
     */
    @RequestMapping(value = "/deleteResult", method = RequestMethod.DELETE)
    public @ResponseBody ResponseEntity<Result> deleteResult(Integer resultId)
    {
        Integer flag = resultService.deleteResult(resultId);
        if (0 != flag)
        {
            Result result = new Result("科研成果删除成功！",200,null,0);
            return ResponseEntity.ok(result);
        }else
        {
            Result result = new Result("科研成果删除失败,请检查格式！",201,null,0);
            return ResponseEntity.ok(result);
        }
    }

    /**
     * 年度科研成果数量查询
     */
    @RequestMapping(value = "/queryResultNum", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<Result> queryResultNum()
    {
        List<ReportBean> reportBeans = new ArrayList<>(8);
        Integer num = 0;
        //所有院系集合
        List<TblAcademy> academyList = academyMapper.selectAll();
        for (int i = 0; i < academyList.size(); i++)
        {
            ReportBean reportBean = new ReportBean();
            num = resultService.queryAcademyResultNum(academyList.get(i).getAcademyId());
            reportBean.setName(academyList.get(i).getAcademyName());
            reportBean.setValue(num);
            reportBeans.add(reportBean);
        }
        Result result = new Result("各院系科研成果总数",200,reportBeans,reportBeans.size());
        return ResponseEntity.ok(result);
    }

    /**
     * 科研成果总价值
     */
    @RequestMapping(value = "/queryResultValue", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<Result> queryResultValue()
    {
        List<ReportBean> reportBeans = new ArrayList<>(8);
        Integer value = 0;
        //所有院系集合
        List<TblAcademy> academyList = academyMapper.selectAll();
        for (int i = 0; i < academyList.size(); i++)
        {
            ReportBean reportBean = new ReportBean();
            value = resultService.queryAcademyResultValue(academyList.get(i).getAcademyId());
            reportBean.setName(academyList.get(i).getAcademyName());
            reportBean.setValue(value);
            reportBeans.add(reportBean);
        }
        Result result = new Result("各院系科研成果总价值",200,reportBeans,reportBeans.size());
        return ResponseEntity.ok(result);
    }

    /**
     * 院系科研成果数量
     */
    @RequestMapping(value = "/queryAcademyResultNum", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<Result> queryAcademyResultNum(@RequestParam Integer academyId)
    {
        Integer num = resultService.queryAcademyResultNum(academyId);
        Result result = new Result("院系科研成果总数量",200,num,0);
        return ResponseEntity.ok(result);
    }

    /**
     * 院系科研成果总价值
     */
    @RequestMapping(value = "/queryAcademyResultValue", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<Result> queryAcademyResultValue(@RequestParam Integer academyId)
    {
        Integer value = resultService.queryAcademyResultValue(academyId);
        Result result = new Result("科研成果总价值",200,value,0);
        return ResponseEntity.ok(result);
    }

}
