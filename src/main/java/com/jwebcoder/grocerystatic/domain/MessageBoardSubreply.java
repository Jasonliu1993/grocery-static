package com.jwebcoder.grocerystatic.domain;

public class MessageBoardSubreply {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MESSAGE_BOARD_SUBREPLY.ID
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MESSAGE_BOARD_SUBREPLY.VERSION
     *
     * @mbggenerated
     */
    private Integer version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MESSAGE_BOARD_SUBREPLY.USERID
     *
     * @mbggenerated
     */
    private Integer userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MESSAGE_BOARD_SUBREPLY.USER_NAME
     *
     * @mbggenerated
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MESSAGE_BOARD_SUBREPLY.EMAIL
     *
     * @mbggenerated
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MESSAGE_BOARD_SUBREPLY.CONTENT
     *
     * @mbggenerated
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MESSAGE_BOARD_SUBREPLY.PHOTO_REF_ID
     *
     * @mbggenerated
     */
    private Integer photoRefId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MESSAGE_BOARD_SUBREPLY.REPLY_USER_ID
     *
     * @mbggenerated
     */
    private Integer replyUserId;

    private String replyUserName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MESSAGE_BOARD_SUBREPLY.PARENT_REF_ID
     *
     * @mbggenerated
     */
    private Integer parentRefId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MESSAGE_BOARD_SUBREPLY.CREATE_DATETIME
     *
     * @mbggenerated
     */
    private String createDatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MESSAGE_BOARD_SUBREPLY.CUSTOM1
     *
     * @mbggenerated
     */
    private String custom1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MESSAGE_BOARD_SUBREPLY.CUSTOM2
     *
     * @mbggenerated
     */
    private String custom2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MESSAGE_BOARD_SUBREPLY.CUSTOM3
     *
     * @mbggenerated
     */
    private String custom3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MESSAGE_BOARD_SUBREPLY.CUSTOM4
     *
     * @mbggenerated
     */
    private String custom4;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MESSAGE_BOARD_SUBREPLY.CUSTOM5
     *
     * @mbggenerated
     */
    private String custom5;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MESSAGE_BOARD_SUBREPLY.ID
     *
     * @return the value of MESSAGE_BOARD_SUBREPLY.ID
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MESSAGE_BOARD_SUBREPLY.ID
     *
     * @param id the value for MESSAGE_BOARD_SUBREPLY.ID
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MESSAGE_BOARD_SUBREPLY.VERSION
     *
     * @return the value of MESSAGE_BOARD_SUBREPLY.VERSION
     *
     * @mbggenerated
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MESSAGE_BOARD_SUBREPLY.VERSION
     *
     * @param version the value for MESSAGE_BOARD_SUBREPLY.VERSION
     *
     * @mbggenerated
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MESSAGE_BOARD_SUBREPLY.USERID
     *
     * @return the value of MESSAGE_BOARD_SUBREPLY.USERID
     *
     * @mbggenerated
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MESSAGE_BOARD_SUBREPLY.USERID
     *
     * @param userid the value for MESSAGE_BOARD_SUBREPLY.USERID
     *
     * @mbggenerated
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MESSAGE_BOARD_SUBREPLY.USER_NAME
     *
     * @return the value of MESSAGE_BOARD_SUBREPLY.USER_NAME
     *
     * @mbggenerated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MESSAGE_BOARD_SUBREPLY.USER_NAME
     *
     * @param userName the value for MESSAGE_BOARD_SUBREPLY.USER_NAME
     *
     * @mbggenerated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MESSAGE_BOARD_SUBREPLY.EMAIL
     *
     * @return the value of MESSAGE_BOARD_SUBREPLY.EMAIL
     *
     * @mbggenerated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MESSAGE_BOARD_SUBREPLY.EMAIL
     *
     * @param email the value for MESSAGE_BOARD_SUBREPLY.EMAIL
     *
     * @mbggenerated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MESSAGE_BOARD_SUBREPLY.CONTENT
     *
     * @return the value of MESSAGE_BOARD_SUBREPLY.CONTENT
     *
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MESSAGE_BOARD_SUBREPLY.CONTENT
     *
     * @param content the value for MESSAGE_BOARD_SUBREPLY.CONTENT
     *
     * @mbggenerated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MESSAGE_BOARD_SUBREPLY.PHOTO_REF_ID
     *
     * @return the value of MESSAGE_BOARD_SUBREPLY.PHOTO_REF_ID
     *
     * @mbggenerated
     */
    public Integer getPhotoRefId() {
        return photoRefId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MESSAGE_BOARD_SUBREPLY.PHOTO_REF_ID
     *
     * @param photoRefId the value for MESSAGE_BOARD_SUBREPLY.PHOTO_REF_ID
     *
     * @mbggenerated
     */
    public void setPhotoRefId(Integer photoRefId) {
        this.photoRefId = photoRefId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MESSAGE_BOARD_SUBREPLY.REPLY_USER_ID
     *
     * @return the value of MESSAGE_BOARD_SUBREPLY.REPLY_USER_ID
     *
     * @mbggenerated
     */
    public Integer getReplyUserId() {
        return replyUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MESSAGE_BOARD_SUBREPLY.REPLY_USER_ID
     *
     * @param replyUserId the value for MESSAGE_BOARD_SUBREPLY.REPLY_USER_ID
     *
     * @mbggenerated
     */
    public void setReplyUserId(Integer replyUserId) {
        this.replyUserId = replyUserId;
    }

    public String getReplyUserName() {
        return replyUserName;
    }

    public void setReplyUserName(String replyUserName) {
        this.replyUserName = replyUserName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MESSAGE_BOARD_SUBREPLY.PARENT_REF_ID
     *
     * @return the value of MESSAGE_BOARD_SUBREPLY.PARENT_REF_ID
     *
     * @mbggenerated
     */
    public Integer getParentRefId() {
        return parentRefId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MESSAGE_BOARD_SUBREPLY.PARENT_REF_ID
     *
     * @param parentRefId the value for MESSAGE_BOARD_SUBREPLY.PARENT_REF_ID
     *
     * @mbggenerated
     */
    public void setParentRefId(Integer parentRefId) {
        this.parentRefId = parentRefId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MESSAGE_BOARD_SUBREPLY.CREATE_DATETIME
     *
     * @return the value of MESSAGE_BOARD_SUBREPLY.CREATE_DATETIME
     *
     * @mbggenerated
     */
    public String getCreateDatetime() {
        return createDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MESSAGE_BOARD_SUBREPLY.CREATE_DATETIME
     *
     * @param createDatetime the value for MESSAGE_BOARD_SUBREPLY.CREATE_DATETIME
     *
     * @mbggenerated
     */
    public void setCreateDatetime(String createDatetime) {
        this.createDatetime = createDatetime == null ? null : createDatetime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MESSAGE_BOARD_SUBREPLY.CUSTOM1
     *
     * @return the value of MESSAGE_BOARD_SUBREPLY.CUSTOM1
     *
     * @mbggenerated
     */
    public String getCustom1() {
        return custom1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MESSAGE_BOARD_SUBREPLY.CUSTOM1
     *
     * @param custom1 the value for MESSAGE_BOARD_SUBREPLY.CUSTOM1
     *
     * @mbggenerated
     */
    public void setCustom1(String custom1) {
        this.custom1 = custom1 == null ? null : custom1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MESSAGE_BOARD_SUBREPLY.CUSTOM2
     *
     * @return the value of MESSAGE_BOARD_SUBREPLY.CUSTOM2
     *
     * @mbggenerated
     */
    public String getCustom2() {
        return custom2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MESSAGE_BOARD_SUBREPLY.CUSTOM2
     *
     * @param custom2 the value for MESSAGE_BOARD_SUBREPLY.CUSTOM2
     *
     * @mbggenerated
     */
    public void setCustom2(String custom2) {
        this.custom2 = custom2 == null ? null : custom2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MESSAGE_BOARD_SUBREPLY.CUSTOM3
     *
     * @return the value of MESSAGE_BOARD_SUBREPLY.CUSTOM3
     *
     * @mbggenerated
     */
    public String getCustom3() {
        return custom3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MESSAGE_BOARD_SUBREPLY.CUSTOM3
     *
     * @param custom3 the value for MESSAGE_BOARD_SUBREPLY.CUSTOM3
     *
     * @mbggenerated
     */
    public void setCustom3(String custom3) {
        this.custom3 = custom3 == null ? null : custom3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MESSAGE_BOARD_SUBREPLY.CUSTOM4
     *
     * @return the value of MESSAGE_BOARD_SUBREPLY.CUSTOM4
     *
     * @mbggenerated
     */
    public String getCustom4() {
        return custom4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MESSAGE_BOARD_SUBREPLY.CUSTOM4
     *
     * @param custom4 the value for MESSAGE_BOARD_SUBREPLY.CUSTOM4
     *
     * @mbggenerated
     */
    public void setCustom4(String custom4) {
        this.custom4 = custom4 == null ? null : custom4.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MESSAGE_BOARD_SUBREPLY.CUSTOM5
     *
     * @return the value of MESSAGE_BOARD_SUBREPLY.CUSTOM5
     *
     * @mbggenerated
     */
    public String getCustom5() {
        return custom5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MESSAGE_BOARD_SUBREPLY.CUSTOM5
     *
     * @param custom5 the value for MESSAGE_BOARD_SUBREPLY.CUSTOM5
     *
     * @mbggenerated
     */
    public void setCustom5(String custom5) {
        this.custom5 = custom5 == null ? null : custom5.trim();
    }
}