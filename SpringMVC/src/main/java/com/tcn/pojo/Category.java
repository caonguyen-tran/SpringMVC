package com.tcn.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "category")
@NamedQueries({
    @NamedQuery(name="Category.findAll", query = "SELECT c FROM Category c")
})
public class Category implements Serializable {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
