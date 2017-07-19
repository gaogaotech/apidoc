package com.hightech.apidoc.model.dvo;

import java.util.Date;

public class DocApi {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doc_api.id
     * api主键
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doc_api.service_id
     * 服务主键
     *
     * @mbggenerated
     */
    private Integer serviceId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doc_api.is_deprecated
     * 是否废弃(0：否；1：是；默认：否)
     *
     * @mbggenerated
     */
    private Integer isDeprecated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doc_api.name
     * api名称
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doc_api.sign
     * api签名
     *
     * @mbggenerated
     */
    private String sign;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doc_api.full_name
     * api全限定名
     *
     * @mbggenerated
     */
    private String fullName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doc_api.desc
     * api介绍
     *
     * @mbggenerated
     */
    private String desc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doc_api.ch_name
     * 注释@name
     *
     * @mbggenerated
     */
    private String chName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doc_api.author
     * @author
     *
     * @mbggenerated
     */
    private String author;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doc_api.date
     * @date
     *
     * @mbggenerated
     */
    private String date;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doc_api.full_comment
     * 全部注释
     *
     * @mbggenerated
     */
    private String fullComment;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doc_api.create_time
     * 创建时间
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doc_api.create_person
     * 创建人
     *
     * @mbggenerated
     */
    private String createPerson;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doc_api.update_time
     * 修改时间
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doc_api.update_person
     * 更新人
     *
     * @mbggenerated
     */
    private String updatePerson;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doc_api.param_in
     * api入参
     *
     * @mbggenerated
     */
    private String paramIn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doc_api.param_out
     * api出参
     *
     * @mbggenerated
     */
    private String paramOut;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doc_api.id
     *
     * @return the value of doc_api.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doc_api.id
     *
     * @param id the value for doc_api.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doc_api.service_id
     *
     * @return the value of doc_api.service_id
     *
     * @mbggenerated
     */
    public Integer getServiceId() {
        return serviceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doc_api.service_id
     *
     * @param serviceId the value for doc_api.service_id
     *
     * @mbggenerated
     */
    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doc_api.is_deprecated
     *
     * @return the value of doc_api.is_deprecated
     *
     * @mbggenerated
     */
    public Integer getIsDeprecated() {
        return isDeprecated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doc_api.is_deprecated
     *
     * @param isDeprecated the value for doc_api.is_deprecated
     *
     * @mbggenerated
     */
    public void setIsDeprecated(Integer isDeprecated) {
        this.isDeprecated = isDeprecated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doc_api.name
     *
     * @return the value of doc_api.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doc_api.name
     *
     * @param name the value for doc_api.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doc_api.sign
     *
     * @return the value of doc_api.sign
     *
     * @mbggenerated
     */
    public String getSign() {
        return sign;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doc_api.sign
     *
     * @param sign the value for doc_api.sign
     *
     * @mbggenerated
     */
    public void setSign(String sign) {
        this.sign = sign == null ? null : sign.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doc_api.full_name
     *
     * @return the value of doc_api.full_name
     *
     * @mbggenerated
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doc_api.full_name
     *
     * @param fullName the value for doc_api.full_name
     *
     * @mbggenerated
     */
    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doc_api.desc
     *
     * @return the value of doc_api.desc
     *
     * @mbggenerated
     */
    public String getDesc() {
        return desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doc_api.desc
     *
     * @param desc the value for doc_api.desc
     *
     * @mbggenerated
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doc_api.ch_name
     *
     * @return the value of doc_api.ch_name
     *
     * @mbggenerated
     */
    public String getChName() {
        return chName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doc_api.ch_name
     *
     * @param chName the value for doc_api.ch_name
     *
     * @mbggenerated
     */
    public void setChName(String chName) {
        this.chName = chName == null ? null : chName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doc_api.author
     *
     * @return the value of doc_api.author
     *
     * @mbggenerated
     */
    public String getAuthor() {
        return author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doc_api.author
     *
     * @param author the value for doc_api.author
     *
     * @mbggenerated
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doc_api.date
     *
     * @return the value of doc_api.date
     *
     * @mbggenerated
     */
    public String getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doc_api.date
     *
     * @param date the value for doc_api.date
     *
     * @mbggenerated
     */
    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doc_api.full_comment
     *
     * @return the value of doc_api.full_comment
     *
     * @mbggenerated
     */
    public String getFullComment() {
        return fullComment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doc_api.full_comment
     *
     * @param fullComment the value for doc_api.full_comment
     *
     * @mbggenerated
     */
    public void setFullComment(String fullComment) {
        this.fullComment = fullComment == null ? null : fullComment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doc_api.create_time
     *
     * @return the value of doc_api.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doc_api.create_time
     *
     * @param createTime the value for doc_api.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doc_api.create_person
     *
     * @return the value of doc_api.create_person
     *
     * @mbggenerated
     */
    public String getCreatePerson() {
        return createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doc_api.create_person
     *
     * @param createPerson the value for doc_api.create_person
     *
     * @mbggenerated
     */
    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson == null ? null : createPerson.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doc_api.update_time
     *
     * @return the value of doc_api.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doc_api.update_time
     *
     * @param updateTime the value for doc_api.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doc_api.update_person
     *
     * @return the value of doc_api.update_person
     *
     * @mbggenerated
     */
    public String getUpdatePerson() {
        return updatePerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doc_api.update_person
     *
     * @param updatePerson the value for doc_api.update_person
     *
     * @mbggenerated
     */
    public void setUpdatePerson(String updatePerson) {
        this.updatePerson = updatePerson == null ? null : updatePerson.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doc_api.param_in
     *
     * @return the value of doc_api.param_in
     *
     * @mbggenerated
     */
    public String getParamIn() {
        return paramIn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doc_api.param_in
     *
     * @param paramIn the value for doc_api.param_in
     *
     * @mbggenerated
     */
    public void setParamIn(String paramIn) {
        this.paramIn = paramIn == null ? null : paramIn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doc_api.param_out
     *
     * @return the value of doc_api.param_out
     *
     * @mbggenerated
     */
    public String getParamOut() {
        return paramOut;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doc_api.param_out
     *
     * @param paramOut the value for doc_api.param_out
     *
     * @mbggenerated
     */
    public void setParamOut(String paramOut) {
        this.paramOut = paramOut == null ? null : paramOut.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doc_api
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", serviceId=").append(serviceId);
        sb.append(", isDeprecated=").append(isDeprecated);
        sb.append(", name=").append(name);
        sb.append(", sign=").append(sign);
        sb.append(", fullName=").append(fullName);
        sb.append(", desc=").append(desc);
        sb.append(", chName=").append(chName);
        sb.append(", author=").append(author);
        sb.append(", date=").append(date);
        sb.append(", fullComment=").append(fullComment);
        sb.append(", createTime=").append(createTime);
        sb.append(", createPerson=").append(createPerson);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updatePerson=").append(updatePerson);
        sb.append(", paramIn=").append(paramIn);
        sb.append(", paramOut=").append(paramOut);
        sb.append("]");
        return sb.toString();
    }
}