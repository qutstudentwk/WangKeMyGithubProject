package com.Service.AnnouncementService;

import com.ORM.mapper.announcementMapper.TblAnnouncementMapper;
import com.ORM.model.announcementModel.TblAnnouncement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Transactional
@Service
public class AnnouncementServiceImpl implements AnnouncementService{

    @Autowired
    TblAnnouncementMapper tblAnnouncementMapper;

    @Override
    public List<TblAnnouncement> findAnnouncementList() {
        List<TblAnnouncement> tblAnnouncementList = tblAnnouncementMapper.selectAll();
        return tblAnnouncementList;
    }

    @Override
    public Integer addAnnouncement(TblAnnouncement tblAnnouncement) {
        Integer flag = tblAnnouncementMapper.insert(tblAnnouncement);
        return flag;
    }

    @Override
    public Integer delAnnouncement(Integer announcementId) {
        Integer flag = tblAnnouncementMapper.deleteByPrimaryKey(announcementId);
        return flag;
    }

}
