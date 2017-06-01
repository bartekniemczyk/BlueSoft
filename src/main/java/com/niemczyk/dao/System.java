package com.niemczyk.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Bartek on 31.05.2017.
 */
@Entity
@Table(name = "SYSTEMY")
public class System {
    @Id
    @Column(name = "NAZWA")
    private String name;
    @Column(name = "OPIS_SYSTEMU")
    private String systemDesc;
    @Column(name = "OPIS_TECHNOLOGII")
    private String techDesc;
    @Column(name = "Wlasciciel")
    private String owner;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSystemDesc() {
        return systemDesc;
    }

    public void setSystemDesc(String systemDesc) {
        this.systemDesc = systemDesc;
    }

    public String getTechDesc() {
        return techDesc;
    }

    public void setTechDesc(String techDesc) {
        techDesc = techDesc;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
