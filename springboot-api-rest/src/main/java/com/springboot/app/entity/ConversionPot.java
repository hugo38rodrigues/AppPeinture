package com.springboot.app.entity;

import javax.persistence.*;

@Entity
@Table(name = "CONVERSIONPOTS")
public class ConversionPot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "type")
    private String potName;

    @Column(name = "humbrol")
    private String humbrol;

    @Column(name = "revell")
    private String revell;

    @Column(name = "italeri")
    private String italeri;

    public ConversionPot() {
    }

    public ConversionPot(String potName, String humbrol, String revell, String italeri) {
        this.potName = potName;
        this.humbrol = humbrol;
        this.revell = revell;
        this.italeri = italeri;
    }

    public long getId() {
        return id;
    }

    public String getPotName() {
        return potName;
    }

    public String getHumbrol() {
        return humbrol;
    }

    public String getRevell() {
        return revell;
    }

    public String getItaleri() {
        return italeri;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setPotName(String potName) {
        this.potName = potName;
    }

    public void setHumbrol(String humbrol) {
        this.humbrol = humbrol;
    }

    public void setRevell(String revell) {
        this.revell = revell;
    }

    public void setItaleri(String italeri) {
        this.italeri = italeri;
    }
}
