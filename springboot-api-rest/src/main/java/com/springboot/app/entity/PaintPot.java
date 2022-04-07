package com.springboot.app.entity;

import javax.persistence.*;

@Entity
@Table(name = "PAINTPOTS")
public class PaintPot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "paintQuantity")
    private int paintQuantity;

    @Column(name = "quantity")
    private int quantity;
    @Column(name = "area")
    private int area;

    //TODO Ajouter clé étrangère de la table de conversion

    public PaintPot() {
    }

    public PaintPot(int paintQuantity, int quantity, int area) {
        this.paintQuantity = paintQuantity;
        this.quantity = quantity;
        this.area = area;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPaintQuantity() {
        return paintQuantity;
    }

    public void setPaintQuantity(int paintQuantity) {
        this.paintQuantity = paintQuantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
}
