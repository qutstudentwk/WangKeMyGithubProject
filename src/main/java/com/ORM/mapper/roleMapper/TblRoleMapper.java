package com.ORM.mapper.roleMapper;

import com.ORM.model.roleModel.TblRole;
import com.ORM.model.roleModel.TblRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblRoleMapper {
    int countByExample(TblRoleExample example);

    int deleteByExample(TblRoleExample example);

    int deleteByPrimaryKey(Integer roleId);

    int insert(TblRole record);

    int insertSelective(TblRole record);

    List<TblRole> selectByExample(TblRoleExample example);

    TblRole selectByPrimaryKey(Integer roleId);

    int updateByExampleSelective(@Param("record") TblRole record, @Param("example") TblRoleExample example);

    int updateByExample(@Param("record") TblRole record, @Param("example") TblRoleExample example);

    int updateByPrimaryKeySelective(TblRole record);

    int updateByPrimaryKey(TblRole record);
}