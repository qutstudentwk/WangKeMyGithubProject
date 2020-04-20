package com.Service.ResultService;

import com.ORM.mapper.resultMapper.TblResultMapper;
import com.ORM.model.resultModel.TblResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class ResultServiceImpl implements ResultService{

    @Autowired
    private TblResultMapper tblResultMapper;

    @Override
    public TblResult getResultInfo(Integer resultId) {
        TblResult tblResult = tblResultMapper.selectByPrimaryKey(resultId);
        return tblResult;
    }

    @Override
    public TblResult getResultInfoByName(String resultName) {
        TblResult tblResult = tblResultMapper.selectByResultName(resultName);
        return tblResult;
    }

    @Override
    public Integer addResult(TblResult tblResult) {
        Integer flag = tblResultMapper.insert(tblResult);
        return flag;
    }

    @Override
    public List<TblResult> getResultByUserId(Integer userId) {
        List<TblResult> tblResultList = tblResultMapper.selectByUserId(userId);
        return tblResultList;
    }

    @Override
    public List<TblResult> getResultByAcademy(Integer academyId) {
        List<TblResult> tblResultList = tblResultMapper.selectByAcademyId(academyId);
        return tblResultList;
    }

    @Override
    public List<TblResult> getResultList() {
        List<TblResult> tblResultList = tblResultMapper.selectAllResult();
        return tblResultList;
    }

    @Override
    public Integer modifyResult(TblResult tblResult) {
        Integer flag = tblResultMapper.updateByPrimaryKey(tblResult);
        return flag;
    }

    @Override
    public Integer deleteResult(Integer resultId) {
        Integer flag = tblResultMapper.deleteByPrimaryKey(resultId);
        return flag;
    }

    @Override
    public Integer queryResultNum() {
        return tblResultMapper.selectAllResult().size();
    }

    @Override
    public Integer queryResultValue() {
        return tblResultMapper.selectSumValue();
    }

    @Override
    public Integer queryAcademyResultNum(Integer academyId) {
        return tblResultMapper.selectByAcademyId(academyId).size();
    }

    @Override
    public Integer queryAcademyResultValue(Integer academyId) {
        return tblResultMapper.selectAcademySumValue(academyId);
    }
}
