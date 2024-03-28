package com.tcn.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "receipt")
public class Receipt implements Serializable {
    @Column(name = "user_id")
    private Integer userId;

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "created_date")
    private java.sql.Timestamp createdDate;

    @Column(name = "active")
    private Byte active;

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public java.sql.Timestamp getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(java.sql.Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public Byte getActive() {
        return this.active;
    }

    public void setActive(Byte active) {
        this.active = active;
    }
}
