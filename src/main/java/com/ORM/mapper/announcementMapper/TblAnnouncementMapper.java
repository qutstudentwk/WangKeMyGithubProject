package com.ORM.mapper.announcementMapper;

import com.ORM.model.announcementModel.TblAnnouncement;
import com.ORM.model.announcementModel.TblAnnouncementExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TblAnnouncementMapper {
    int countByExample(TblAnnouncementExample example);

    int deleteByExample(TblAnnouncementExample example);

    int deleteByPrimaryKey(Integer annoId);

    int insert(TblAnnouncement record);

    int insertSelective(TblAnnouncement record);

    List<TblAnnouncement> selectByExample(TblAnnouncementExample example);

    TblAnnouncement selectByPrimaryKey(Integer annoId);

    int updateByExampleSelective(@Param("record") TblAnnouncement record, @Param("example") TblAnnouncementExample example);

    int updateByExample(@Param("record") TblAnnouncement record, @Param("example") TblAnnouncementExample example);

    int updateByPrimaryKeySelective(TblAnnouncement record);

    int updateByPrimaryKey(TblAnnouncement record);

    /**
     * 查询所有数据
     */
    List<TblAnnouncement> selectAll();
}