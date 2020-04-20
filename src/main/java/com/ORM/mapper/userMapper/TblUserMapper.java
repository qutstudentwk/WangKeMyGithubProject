package com.ORM.mapper.userMapper;

import com.ORM.model.userModel.TblUser;
import com.ORM.model.userModel.TblUserExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TblUserMapper {
    int countByExample(TblUserExample example);

    int deleteByExample(TblUserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(TblUser record);

    int insertSelective(TblUser record);

    List<TblUser> selectByExample(TblUserExample example);

    TblUser selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") TblUser record, @Param("example") TblUserExample example);

    int updateByExample(@Param("record") TblUser record, @Param("example") TblUserExample example);

    int updateByPrimaryKeySelective(TblUser record);

    int updateByPrimaryKey(TblUser record);

    /**
     * 根据账号查询用户信息
     * @param userName 账号
     * @return
     */
    TblUser selectByUserName(String userName);

    /**
     * 查询所有数据
     */
    List<TblUser> selectAll();

    /**
     * 查询院系人员信息
     */
    List<TblUser> selectByAcademyId(Integer academyId);
}