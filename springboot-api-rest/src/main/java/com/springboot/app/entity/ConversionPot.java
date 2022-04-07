package com.springboot.app.entity;

import javax.persistence.*;

@Entity
@Table(name = "CONVERSIONPOTS")
public class ConversionPot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "type", nullable = false, length = 30)
    private String potName;

    @Column(name = "humbrol", nullable = false, length = 4)
    private String humbrol;

    @Column(name = "revell", nullable = false, length = 15)
    private String revell;

    @Column(name = "italeri", nullable = false, length = 4)
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
