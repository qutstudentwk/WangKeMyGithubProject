package com.ORM.model.announcementModel;

public class TblAnnouncement {
    private Integer annoId;

    private String annoTitle;

    private String annoContent;

    public Integer getAnnoId() {
        return annoId;
    }

    public void setAnnoId(Integer annoId) {
        this.annoId = annoId;
    }

    public String getAnnoTitle() {
        return annoTitle;
    }

    public void setAnnoTitle(String annoTitle) {
        this.annoTitle = annoTitle == null ? null : annoTitle.trim();
    }

    public String getAnnoContent() {
        return annoContent;
    }

    public void setAnnoContent(String annoContent) {
        this.annoContent = annoContent == null ? null : annoContent.trim();
    }
}