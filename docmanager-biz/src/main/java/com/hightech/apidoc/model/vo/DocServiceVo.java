package com.hightech.apidoc.model.vo;

import java.util.Date;
import java.util.List;

public class DocServiceVo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doc_service.id
     * 服务主键
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doc_service.app_version_id
     * 应用版本主键
     *
     * @mbggenerated
     */
    private Integer appVersionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doc_service.is_deprecated
     * 是否废弃(0：否；1：是；默认：否)
     *
     * @mbggenerated
     */
    private Integer isDeprecated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doc_service.author
     * 作者
     *
     * @mbggenerated
     */
    private String author;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doc_service.clz_version
     * 注释版本
     *
     * @mbggenerated
     */
    private String clzVersion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doc_service.full_name
     * 服务全限定名
     *
     * @mbggenerated
     */
    private String fullName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doc_service.desc
     * 服务介绍
     *
     * @mbggenerated
     */
    private String desc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doc_service.create_time
     * 创建时间
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doc_service.create_person
     * 创建人
     *
     * @mbggenerated
     */
    private String createPerson;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doc_service.update_time
     * 修改时间
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doc_service.update_person
     * 更新人
     *
     * @mbggenerated
     */
    private String updatePerson;

    /**  api列表*/
    private List<DocApiVo> docApiVos;

    public List<DocApiVo> getDocApiVos() {
        return docApiVos;
    }

    public void setDocApiVos(List<DocApiVo> docApiVos) {
        this.docApiVos = docApiVos;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doc_service.id
     *
     * @return the value of doc_service.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doc_service.id
     *
     * @param id the value for doc_service.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doc_service.app_version_id
     *
     * @return the value of doc_service.app_version_id
     *
     * @mbggenerated
     */
    public Integer getAppVersionId() {
        return appVersionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doc_service.app_version_id
     *
     * @param appVersionId the value for doc_service.app_version_id
     *
     * @mbggenerated
     */
    public void setAppVersionId(Integer appVersionId) {
        this.appVersionId = appVersionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doc_service.is_deprecated
     *
     * @return the value of doc_service.is_deprecated
     *
     * @mbggenerated
     */
    public Integer getIsDeprecated() {
        return isDeprecated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doc_service.is_deprecated
     *
     * @param isDeprecated the value for doc_service.is_deprecated
     *
     * @mbggenerated
     */
    public void setIsDeprecated(Integer isDeprecated) {
        this.isDeprecated = isDeprecated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doc_service.author
     *
     * @return the value of doc_service.author
     *
     * @mbggenerated
     */
    public String getAuthor() {
        return author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doc_service.author
     *
     * @param author the value for doc_service.author
     *
     * @mbggenerated
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doc_service.clz_version
     *
     * @return the value of doc_service.clz_version
     *
     * @mbggenerated
     */
    public String getClzVersion() {
        return clzVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doc_service.clz_version
     *
     * @param clzVersion the value for doc_service.clz_version
     *
     * @mbggenerated
     */
    public void setClzVersion(String clzVersion) {
        this.clzVersion = clzVersion == null ? null : clzVersion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doc_service.full_name
     *
     * @return the value of doc_service.full_name
     *
     * @mbggenerated
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doc_service.full_name
     *
     * @param fullName the value for doc_service.full_name
     *
     * @mbggenerated
     */
    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doc_service.desc
     *
     * @return the value of doc_service.desc
     *
     * @mbggenerated
     */
    public String getDesc() {
        return desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doc_service.desc
     *
     * @param desc the value for doc_service.desc
     *
     * @mbggenerated
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doc_service.create_time
     *
     * @return the value of doc_service.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doc_service.create_time
     *
     * @param createTime the value for doc_service.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doc_service.create_person
     *
     * @return the value of doc_service.create_person
     *
     * @mbggenerated
     */
    public String getCreatePerson() {
        return createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doc_service.create_person
     *
     * @param createPerson the value for doc_service.create_person
     *
     * @mbggenerated
     */
    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson == null ? null : createPerson.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doc_service.update_time
     *
     * @return the value of doc_service.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doc_service.update_time
     *
     * @param updateTime the value for doc_service.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doc_service.update_person
     *
     * @return the value of doc_service.update_person
     *
     * @mbggenerated
     */
    public String getUpdatePerson() {
        return updatePerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doc_service.update_person
     *
     * @param updatePerson the value for doc_service.update_person
     *
     * @mbggenerated
     */
    public void setUpdatePerson(String updatePerson) {
        this.updatePerson = updatePerson == null ? null : updatePerson.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doc_service
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
        sb.append(", appVersionId=").append(appVersionId);
        sb.append(", isDeprecated=").append(isDeprecated);
        sb.append(", author=").append(author);
        sb.append(", clzVersion=").append(clzVersion);
        sb.append(", fullName=").append(fullName);
        sb.append(", desc=").append(desc);
        sb.append(", createTime=").append(createTime);
        sb.append(", createPerson=").append(createPerson);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updatePerson=").append(updatePerson);
        sb.append("]");
        return sb.toString();
    }

    /**  
     * service名
     * @return
     * @date: 2016年8月17日 上午11:19:54
     */
    public String getName() {
        return fullName.substring(fullName.lastIndexOf(".") + 1, fullName.length());
    }

    /**  
     * api数
     * @return
     * @date: 2016年8月30日 上午10:57:06
     */
    public Integer getApiCount() {
        if (docApiVos == null) {
            return 0;
        }
        return docApiVos.size();
    }
}