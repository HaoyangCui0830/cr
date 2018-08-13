package com.zxy.cr.domain;

import javax.persistence.*;

@Entity
@Table(name = "LEA", schema = "cr", catalog = "")
public class LeaEntity {
    private String leaName;
    private String leaPwd;
    private byte leaId;

    @Basic
    @Column(name = "LEA_name")
    public String getLeaName() {
        return leaName;
    }

    public void setLeaName(String leaName) {
        this.leaName = leaName;
    }

    @Basic
    @Column(name = "LEA_pwd")
    public String getLeaPwd() {
        return leaPwd;
    }

    public void setLeaPwd(String leaPwd) {
        this.leaPwd = leaPwd;
    }

    @Id
    @Column(name = "LEA_id")
    public byte getLeaId() {
        return leaId;
    }

    public void setLeaId(byte leaId) {
        this.leaId = leaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LeaEntity leaEntity = (LeaEntity) o;

        if (leaId != leaEntity.leaId) return false;
        if (leaName != null ? !leaName.equals(leaEntity.leaName) : leaEntity.leaName != null) return false;
        if (leaPwd != null ? !leaPwd.equals(leaEntity.leaPwd) : leaEntity.leaPwd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = leaName != null ? leaName.hashCode() : 0;
        result = 31 * result + (leaPwd != null ? leaPwd.hashCode() : 0);
        result = 31 * result + (int) leaId;
        return result;
    }
}
