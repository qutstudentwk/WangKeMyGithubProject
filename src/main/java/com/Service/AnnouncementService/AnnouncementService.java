package com.Service.AnnouncementService;

import com.ORM.model.announcementModel.TblAnnouncement;

import java.util.List;

public interface AnnouncementService {

    /**
     * 查询通知文件列表
     */
    List<TblAnnouncement> findAnnouncementList();

    /**
     * 添加通知文件
     */
    Integer addAnnouncement(TblAnnouncement tblAnnouncement);

    /**
     * 删除通知文件
     */
    Integer delAnnouncement(Integer announcementId);

}
