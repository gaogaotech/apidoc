package com.hightech.apidoc.model.dvo;

import java.util.Date;

public class DocApp {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doc_app.id
     * 应用主键
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doc_app.name
     * 应用名称
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doc_app.release_time_version
     * release时间版本
     *
     * @mbggenerated
     */
    private String releaseTimeVersion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doc_app.snapshot_time_version
     * snapshot时间版本
     *
     * @mbggenerated
     */
    private String snapshotTimeVersion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doc_app.desc
     * 应用介绍
     *
     * @mbggenerated
     */
    private String desc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doc_app.group_id
     * pom中的group_id
     *
     * @mbggenerated
     */
    private String groupId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doc_app.artifact_id
     * pom中的artifact_id
     *
     * @mbggenerated
     */
    private String artifactId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doc_app.create_time
     * 创建时间
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doc_app.create_person
     * 创建人
     *
     * @mbggenerated
     */
    private String createPerson;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doc_app.update_time
     * 修改时间
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column doc_app.update_person
     * 更新人
     *
     * @mbggenerated
     */
    private String updatePerson;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doc_app.id
     *
     * @return the value of doc_app.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doc_app.id
     *
     * @param id the value for doc_app.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doc_app.name
     *
     * @return the value of doc_app.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doc_app.name
     *
     * @param name the value for doc_app.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doc_app.release_time_version
     *
     * @return the value of doc_app.release_time_version
     *
     * @mbggenerated
     */
    public String getReleaseTimeVersion() {
        return releaseTimeVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doc_app.release_time_version
     *
     * @param releaseTimeVersion the value for doc_app.release_time_version
     *
     * @mbggenerated
     */
    public void setReleaseTimeVersion(String releaseTimeVersion) {
        this.releaseTimeVersion = releaseTimeVersion == null ? null : releaseTimeVersion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doc_app.snapshot_time_version
     *
     * @return the value of doc_app.snapshot_time_version
     *
     * @mbggenerated
     */
    public String getSnapshotTimeVersion() {
        return snapshotTimeVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doc_app.snapshot_time_version
     *
     * @param snapshotTimeVersion the value for doc_app.snapshot_time_version
     *
     * @mbggenerated
     */
    public void setSnapshotTimeVersion(String snapshotTimeVersion) {
        this.snapshotTimeVersion = snapshotTimeVersion == null ? null : snapshotTimeVersion.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doc_app.desc
     *
     * @return the value of doc_app.desc
     *
     * @mbggenerated
     */
    public String getDesc() {
        return desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doc_app.desc
     *
     * @param desc the value for doc_app.desc
     *
     * @mbggenerated
     */
    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doc_app.group_id
     *
     * @return the value of doc_app.group_id
     *
     * @mbggenerated
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doc_app.group_id
     *
     * @param groupId the value for doc_app.group_id
     *
     * @mbggenerated
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doc_app.artifact_id
     *
     * @return the value of doc_app.artifact_id
     *
     * @mbggenerated
     */
    public String getArtifactId() {
        return artifactId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doc_app.artifact_id
     *
     * @param artifactId the value for doc_app.artifact_id
     *
     * @mbggenerated
     */
    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId == null ? null : artifactId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doc_app.create_time
     *
     * @return the value of doc_app.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doc_app.create_time
     *
     * @param createTime the value for doc_app.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doc_app.create_person
     *
     * @return the value of doc_app.create_person
     *
     * @mbggenerated
     */
    public String getCreatePerson() {
        return createPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doc_app.create_person
     *
     * @param createPerson the value for doc_app.create_person
     *
     * @mbggenerated
     */
    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson == null ? null : createPerson.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doc_app.update_time
     *
     * @return the value of doc_app.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doc_app.update_time
     *
     * @param updateTime the value for doc_app.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column doc_app.update_person
     *
     * @return the value of doc_app.update_person
     *
     * @mbggenerated
     */
    public String getUpdatePerson() {
        return updatePerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column doc_app.update_person
     *
     * @param updatePerson the value for doc_app.update_person
     *
     * @mbggenerated
     */
    public void setUpdatePerson(String updatePerson) {
        this.updatePerson = updatePerson == null ? null : updatePerson.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table doc_app
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
        sb.append(", name=").append(name);
        sb.append(", releaseTimeVersion=").append(releaseTimeVersion);
        sb.append(", snapshotTimeVersion=").append(snapshotTimeVersion);
        sb.append(", desc=").append(desc);
        sb.append(", groupId=").append(groupId);
        sb.append(", artifactId=").append(artifactId);
        sb.append(", createTime=").append(createTime);
        sb.append(", createPerson=").append(createPerson);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updatePerson=").append(updatePerson);
        sb.append("]");
        return sb.toString();
    }
}