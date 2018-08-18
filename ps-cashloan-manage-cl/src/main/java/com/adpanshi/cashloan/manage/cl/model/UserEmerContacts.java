package com.adpanshi.cashloan.manage.cl.model;

import java.io.Serializable;

public class UserEmerContacts implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_user_emer_contacts.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_user_emer_contacts.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_user_emer_contacts.phone
     *
     * @mbg.generated
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_user_emer_contacts.user_id
     *
     * @mbg.generated
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_user_emer_contacts.relation
     *
     * @mbg.generated
     */
    private String relation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cl_user_emer_contacts.type
     *
     * @mbg.generated
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cl_user_emer_contacts
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_user_emer_contacts.id
     *
     * @return the value of cl_user_emer_contacts.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_user_emer_contacts.id
     *
     * @param id the value for cl_user_emer_contacts.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_user_emer_contacts.name
     *
     * @return the value of cl_user_emer_contacts.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_user_emer_contacts.name
     *
     * @param name the value for cl_user_emer_contacts.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_user_emer_contacts.phone
     *
     * @return the value of cl_user_emer_contacts.phone
     *
     * @mbg.generated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_user_emer_contacts.phone
     *
     * @param phone the value for cl_user_emer_contacts.phone
     *
     * @mbg.generated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_user_emer_contacts.user_id
     *
     * @return the value of cl_user_emer_contacts.user_id
     *
     * @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_user_emer_contacts.user_id
     *
     * @param userId the value for cl_user_emer_contacts.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_user_emer_contacts.relation
     *
     * @return the value of cl_user_emer_contacts.relation
     *
     * @mbg.generated
     */
    public String getRelation() {
        return relation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_user_emer_contacts.relation
     *
     * @param relation the value for cl_user_emer_contacts.relation
     *
     * @mbg.generated
     */
    public void setRelation(String relation) {
        this.relation = relation == null ? null : relation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cl_user_emer_contacts.type
     *
     * @return the value of cl_user_emer_contacts.type
     *
     * @mbg.generated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cl_user_emer_contacts.type
     *
     * @param type the value for cl_user_emer_contacts.type
     *
     * @mbg.generated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_user_emer_contacts
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
        UserEmerContacts other = (UserEmerContacts) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getRelation() == null ? other.getRelation() == null : this.getRelation().equals(other.getRelation()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cl_user_emer_contacts
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getRelation() == null) ? 0 : getRelation().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        return result;
    }
}