package com.Controller.announcementController;

import com.Controller.entity.Result;
import com.ORM.model.announcementModel.TblAnnouncement;
import com.Service.AnnouncementService.AnnouncementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * author
 * description announcement(通知公告) info controller
 * time 2020.04.11
 */
@RestController
@RequestMapping("/announcement")
public class announcementController {

    @Autowired
    private AnnouncementService announcementService;

    /**
     * 查询通知公告(query)
     */
    @RequestMapping(value = "/findAnnouncementList", method = RequestMethod.GET)
    public @ResponseBody
    ResponseEntity<Result> findAnnouncementList()
    {
        List<TblAnnouncement> announcementList = announcementService.findAnnouncementList();
        Result result = new Result("查询通知公告成功",0,announcementList,announcementList.size());
        return ResponseEntity.ok(result);
    }

    /**
     * 添加通知公告(add)
     */
    @RequestMapping(value = "/addAnnouncement", method = RequestMethod.POST)
    public @ResponseBody
    ResponseEntity<Result> addAnnouncement(@RequestBody TblAnnouncement tblAnnouncement)
    {
        Integer flag = announcementService.addAnnouncement(tblAnnouncement);
        if (0 != flag)
        {
            Result result = new Result("添加通知公告成功",200,null,0);
            return ResponseEntity.ok(result);
        }else
        {
            Result result = new Result("添加通知公告失败",201,null,0);
            return ResponseEntity.ok(result);
        }
    }


    /**
     * 删除通知公告(delete)
     */
    @RequestMapping(value = "/delAnnouncement", method = RequestMethod.POST)
    public @ResponseBody
    ResponseEntity<Result> delAnnouncement(@RequestParam Integer announcementId)
    {
        Integer flag = announcementService.delAnnouncement(announcementId);
        if (0 != flag)
        {
            Result result = new Result("删除通知公告成功",200,null,0);
            return ResponseEntity.ok(result);
        }else
        {
            Result result = new Result("删除通知公告失败",201,null,0);
            return ResponseEntity.ok(result);
        }
    }



}
