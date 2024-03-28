package com.tcn.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "receipt_details")
public class ReceiptDetails implements Serializable {
    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "price")
    private Float price;

    @Column(name = "receipt_id")
    private Integer receiptId;

    @Column(name = "product_id")
    private Integer productId;

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "created_date")
    private java.sql.Timestamp createdDate;

    @Column(name = "active")
    private Byte active;

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Float getPrice() {
        return this.price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getReceiptId() {
        return this.receiptId;
    }

    public void setReceiptId(Integer receiptId) {
        this.receiptId = receiptId;
    }

    public Integer getProductId() {
        return this.productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
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
