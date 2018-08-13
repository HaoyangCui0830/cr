package com.zxy.cr.domain;

import javax.persistence.*;

@Entity
@Table(name = "admin", schema = "cr", catalog = "")
public class AdminEntity {
    private String adminName;
    private String adminPwd;
    private byte adminId;

    @Basic
    @Column(name = "admin_name")
    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    @Basic
    @Column(name = "admin_pwd")
    public String getAdminPwd() {
        return adminPwd;
    }

    public void setAdminPwd(String adminPwd) {
        this.adminPwd = adminPwd;
    }

    @Id
    @Column(name = "admin_id")
    public byte getAdminId() {
        return adminId;
    }

    public void setAdminId(byte adminId) {
        this.adminId = adminId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdminEntity that = (AdminEntity) o;

        if (adminId != that.adminId) return false;
        if (adminName != null ? !adminName.equals(that.adminName) : that.adminName != null) return false;
        if (adminPwd != null ? !adminPwd.equals(that.adminPwd) : that.adminPwd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = adminName != null ? adminName.hashCode() : 0;
        result = 31 * result + (adminPwd != null ? adminPwd.hashCode() : 0);
        result = 31 * result + (int) adminId;
        return result;
    }
}
