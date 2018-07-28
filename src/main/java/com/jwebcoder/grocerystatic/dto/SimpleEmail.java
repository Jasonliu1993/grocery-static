package com.jwebcoder.grocerystatic.dto;

public class SimpleEmail extends Email{

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SIMPLE_EMAIL.ID
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SIMPLE_EMAIL.VERSION
     *
     * @mbg.generated
     */
    private Integer version;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SIMPLE_EMAIL.SEND_FROM
     *
     * @mbg.generated
     */
    private String sendFrom;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SIMPLE_EMAIL.SEND_TO
     *
     * @mbg.generated
     */
    private String sendTo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SIMPLE_EMAIL.SEND_CC
     *
     * @mbg.generated
     */
    private String sendCc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SIMPLE_EMAIL.SEND_BCC
     *
     * @mbg.generated
     */
    private String sendBcc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SIMPLE_EMAIL.SUBJECT
     *
     * @mbg.generated
     */
    private String subject;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SIMPLE_EMAIL.CONTENT
     *
     * @mbg.generated
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SIMPLE_EMAIL.TEMPLATE_REF_ID
     *
     * @mbg.generated
     */
    private String templateRefId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SIMPLE_EMAIL.OWNER
     *
     * @mbg.generated
     */
    private String owner;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SIMPLE_EMAIL.CREATE_DATETIME
     *
     * @mbg.generated
     */
    private String createDatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SIMPLE_EMAIL.LAST_UPDATE_DATETIME
     *
     * @mbg.generated
     */
    private String lastUpdateDatetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SIMPLE_EMAIL.CUSTOM1
     *
     * @mbg.generated
     */
    private String custom1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SIMPLE_EMAIL.CUSTOM2
     *
     * @mbg.generated
     */
    private String custom2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SIMPLE_EMAIL.CUSTOM3
     *
     * @mbg.generated
     */
    private String custom3;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SIMPLE_EMAIL.CUSTOM4
     *
     * @mbg.generated
     */
    private Integer custom4;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SIMPLE_EMAIL.CUSTOM5
     *
     * @mbg.generated
     */
    private Integer custom5;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SIMPLE_EMAIL.ID
     *
     * @return the value of SIMPLE_EMAIL.ID
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SIMPLE_EMAIL.ID
     *
     * @param id the value for SIMPLE_EMAIL.ID
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SIMPLE_EMAIL.VERSION
     *
     * @return the value of SIMPLE_EMAIL.VERSION
     *
     * @mbg.generated
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SIMPLE_EMAIL.VERSION
     *
     * @param version the value for SIMPLE_EMAIL.VERSION
     *
     * @mbg.generated
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SIMPLE_EMAIL.SEND_FROM
     *
     * @return the value of SIMPLE_EMAIL.SEND_FROM
     *
     * @mbg.generated
     */
    public String getSendFrom() {
        return sendFrom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SIMPLE_EMAIL.SEND_FROM
     *
     * @param sendFrom the value for SIMPLE_EMAIL.SEND_FROM
     *
     * @mbg.generated
     */
    public void setSendFrom(String sendFrom) {
        this.sendFrom = sendFrom == null ? null : sendFrom.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SIMPLE_EMAIL.SEND_TO
     *
     * @return the value of SIMPLE_EMAIL.SEND_TO
     *
     * @mbg.generated
     */
    public String getSendTo() {
        return sendTo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SIMPLE_EMAIL.SEND_TO
     *
     * @param sendTo the value for SIMPLE_EMAIL.SEND_TO
     *
     * @mbg.generated
     */
    public void setSendTo(String sendTo) {
        this.sendTo = sendTo == null ? null : sendTo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SIMPLE_EMAIL.SEND_CC
     *
     * @return the value of SIMPLE_EMAIL.SEND_CC
     *
     * @mbg.generated
     */
    public String getSendCc() {
        return sendCc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SIMPLE_EMAIL.SEND_CC
     *
     * @param sendCc the value for SIMPLE_EMAIL.SEND_CC
     *
     * @mbg.generated
     */
    public void setSendCc(String sendCc) {
        this.sendCc = sendCc == null ? null : sendCc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SIMPLE_EMAIL.SEND_BCC
     *
     * @return the value of SIMPLE_EMAIL.SEND_BCC
     *
     * @mbg.generated
     */
    public String getSendBcc() {
        return sendBcc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SIMPLE_EMAIL.SEND_BCC
     *
     * @param sendBcc the value for SIMPLE_EMAIL.SEND_BCC
     *
     * @mbg.generated
     */
    public void setSendBcc(String sendBcc) {
        this.sendBcc = sendBcc == null ? null : sendBcc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SIMPLE_EMAIL.SUBJECT
     *
     * @return the value of SIMPLE_EMAIL.SUBJECT
     *
     * @mbg.generated
     */
    public String getSubject() {
        return subject;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SIMPLE_EMAIL.SUBJECT
     *
     * @param subject the value for SIMPLE_EMAIL.SUBJECT
     *
     * @mbg.generated
     */
    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SIMPLE_EMAIL.CONTENT
     *
     * @return the value of SIMPLE_EMAIL.CONTENT
     *
     * @mbg.generated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SIMPLE_EMAIL.CONTENT
     *
     * @param content the value for SIMPLE_EMAIL.CONTENT
     *
     * @mbg.generated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SIMPLE_EMAIL.TEMPLATE_REF_ID
     *
     * @return the value of SIMPLE_EMAIL.TEMPLATE_REF_ID
     *
     * @mbg.generated
     */
    public String getTemplateRefId() {
        return templateRefId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SIMPLE_EMAIL.TEMPLATE_REF_ID
     *
     * @param templateRefId the value for SIMPLE_EMAIL.TEMPLATE_REF_ID
     *
     * @mbg.generated
     */
    public void setTemplateRefId(String templateRefId) {
        this.templateRefId = templateRefId == null ? null : templateRefId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SIMPLE_EMAIL.OWNER
     *
     * @return the value of SIMPLE_EMAIL.OWNER
     *
     * @mbg.generated
     */
    public String getOwner() {
        return owner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SIMPLE_EMAIL.OWNER
     *
     * @param owner the value for SIMPLE_EMAIL.OWNER
     *
     * @mbg.generated
     */
    public void setOwner(String owner) {
        this.owner = owner == null ? null : owner.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SIMPLE_EMAIL.CREATE_DATETIME
     *
     * @return the value of SIMPLE_EMAIL.CREATE_DATETIME
     *
     * @mbg.generated
     */
    public String getCreateDatetime() {
        return createDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SIMPLE_EMAIL.CREATE_DATETIME
     *
     * @param createDatetime the value for SIMPLE_EMAIL.CREATE_DATETIME
     *
     * @mbg.generated
     */
    public void setCreateDatetime(String createDatetime) {
        this.createDatetime = createDatetime == null ? null : createDatetime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SIMPLE_EMAIL.LAST_UPDATE_DATETIME
     *
     * @return the value of SIMPLE_EMAIL.LAST_UPDATE_DATETIME
     *
     * @mbg.generated
     */
    public String getLastUpdateDatetime() {
        return lastUpdateDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SIMPLE_EMAIL.LAST_UPDATE_DATETIME
     *
     * @param lastUpdateDatetime the value for SIMPLE_EMAIL.LAST_UPDATE_DATETIME
     *
     * @mbg.generated
     */
    public void setLastUpdateDatetime(String lastUpdateDatetime) {
        this.lastUpdateDatetime = lastUpdateDatetime == null ? null : lastUpdateDatetime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SIMPLE_EMAIL.CUSTOM1
     *
     * @return the value of SIMPLE_EMAIL.CUSTOM1
     *
     * @mbg.generated
     */
    public String getCustom1() {
        return custom1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SIMPLE_EMAIL.CUSTOM1
     *
     * @param custom1 the value for SIMPLE_EMAIL.CUSTOM1
     *
     * @mbg.generated
     */
    public void setCustom1(String custom1) {
        this.custom1 = custom1 == null ? null : custom1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SIMPLE_EMAIL.CUSTOM2
     *
     * @return the value of SIMPLE_EMAIL.CUSTOM2
     *
     * @mbg.generated
     */
    public String getCustom2() {
        return custom2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SIMPLE_EMAIL.CUSTOM2
     *
     * @param custom2 the value for SIMPLE_EMAIL.CUSTOM2
     *
     * @mbg.generated
     */
    public void setCustom2(String custom2) {
        this.custom2 = custom2 == null ? null : custom2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SIMPLE_EMAIL.CUSTOM3
     *
     * @return the value of SIMPLE_EMAIL.CUSTOM3
     *
     * @mbg.generated
     */
    public String getCustom3() {
        return custom3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SIMPLE_EMAIL.CUSTOM3
     *
     * @param custom3 the value for SIMPLE_EMAIL.CUSTOM3
     *
     * @mbg.generated
     */
    public void setCustom3(String custom3) {
        this.custom3 = custom3 == null ? null : custom3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SIMPLE_EMAIL.CUSTOM4
     *
     * @return the value of SIMPLE_EMAIL.CUSTOM4
     *
     * @mbg.generated
     */
    public Integer getCustom4() {
        return custom4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SIMPLE_EMAIL.CUSTOM4
     *
     * @param custom4 the value for SIMPLE_EMAIL.CUSTOM4
     *
     * @mbg.generated
     */
    public void setCustom4(Integer custom4) {
        this.custom4 = custom4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SIMPLE_EMAIL.CUSTOM5
     *
     * @return the value of SIMPLE_EMAIL.CUSTOM5
     *
     * @mbg.generated
     */
    public Integer getCustom5() {
        return custom5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SIMPLE_EMAIL.CUSTOM5
     *
     * @param custom5 the value for SIMPLE_EMAIL.CUSTOM5
     *
     * @mbg.generated
     */
    public void setCustom5(Integer custom5) {
        this.custom5 = custom5;
    }
}