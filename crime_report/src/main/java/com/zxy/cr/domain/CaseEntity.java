package com.zxy.cr.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "case", schema = "cr", catalog = "")
public class CaseEntity {
    private byte caseId;
    private String type;
    private String street;
    private String suburb;
    private Byte postcode;
    private String state;
    private byte status;
    private Timestamp createTime;

    @Id
    @Column(name = "case_id")
    public byte getCaseId() {
        return caseId;
    }

    public void setCaseId(byte caseId) {
        this.caseId = caseId;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "street")
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Basic
    @Column(name = "suburb")
    public String getSuburb() {
        return suburb;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    @Basic
    @Column(name = "postcode")
    public Byte getPostcode() {
        return postcode;
    }

    public void setPostcode(Byte postcode) {
        this.postcode = postcode;
    }

    @Basic
    @Column(name = "state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "status")
    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CaseEntity that = (CaseEntity) o;

        if (caseId != that.caseId) return false;
        if (status != that.status) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (street != null ? !street.equals(that.street) : that.street != null) return false;
        if (suburb != null ? !suburb.equals(that.suburb) : that.suburb != null) return false;
        if (postcode != null ? !postcode.equals(that.postcode) : that.postcode != null) return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) caseId;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (street != null ? street.hashCode() : 0);
        result = 31 * result + (suburb != null ? suburb.hashCode() : 0);
        result = 31 * result + (postcode != null ? postcode.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (int) status;
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        return result;
    }
}
