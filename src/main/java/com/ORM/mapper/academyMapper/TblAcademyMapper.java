package com.ORM.mapper.academyMapper;

import com.ORM.model.academyModel.TblAcademy;
import com.ORM.model.academyModel.TblAcademyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblAcademyMapper {
    int countByExample(TblAcademyExample example);

    int deleteByExample(TblAcademyExample example);

    int deleteByPrimaryKey(Integer academyId);

    int insert(TblAcademy record);

    int insertSelective(TblAcademy record);

    List<TblAcademy> selectByExample(TblAcademyExample example);

    TblAcademy selectByPrimaryKey(Integer academyId);

    int updateByExampleSelective(@Param("record") TblAcademy record, @Param("example") TblAcademyExample example);

    int updateByExample(@Param("record") TblAcademy record, @Param("example") TblAcademyExample example);

    int updateByPrimaryKeySelective(TblAcademy record);

    int updateByPrimaryKey(TblAcademy record);

    List<TblAcademy> selectAll();
}