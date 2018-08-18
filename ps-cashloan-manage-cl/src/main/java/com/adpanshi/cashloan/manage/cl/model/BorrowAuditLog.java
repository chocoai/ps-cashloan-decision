package com.adpanshi.cashloan.manage.cl.model;

import java.io.Serializable;
import java.util.Date;

public class BorrowAuditLog implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_borrow_audit_log.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_borrow_audit_log.borrow_id
     *
     * @mbg.generated
     */
    private Long borrowId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_borrow_audit_log.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_borrow_audit_log.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cl_borrow_audit_log
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_borrow_audit_log.id
     *
     * @return the value of cl_borrow_audit_log.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_borrow_audit_log.id
     *
     * @param id the value for cl_borrow_audit_log.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_borrow_audit_log.borrow_id
     *
     * @return the value of cl_borrow_audit_log.borrow_id
     *
     * @mbg.generated
     */
    public Long getBorrowId() {
        return borrowId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_borrow_audit_log.borrow_id
     *
     * @param borrowId the value for cl_borrow_audit_log.borrow_id
     *
     * @mbg.generated
     */
    public void setBorrowId(Long borrowId) {
        this.borrowId = borrowId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_borrow_audit_log.create_time
     *
     * @return the value of cl_borrow_audit_log.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_borrow_audit_log.create_time
     *
     * @param createTime the value for cl_borrow_audit_log.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_borrow_audit_log.update_time
     *
     * @return the value of cl_borrow_audit_log.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_borrow_audit_log.update_time
     *
     * @param updateTime the value for cl_borrow_audit_log.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_borrow_audit_log
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        BorrowAuditLog other = (BorrowAuditLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBorrowId() == null ? other.getBorrowId() == null : this.getBorrowId().equals(other.getBorrowId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_borrow_audit_log
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBorrowId() == null) ? 0 : getBorrowId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}