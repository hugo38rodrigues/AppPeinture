package com.springboot.app.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "SCALEMODELS")
public class ScaleModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToMany(mappedBy = "scaleModels")
    List<PaintPot> paintPots;

    @Column(name = "name", unique = true, nullable = false, length = 50)
    private String name;

    @Column(name = "ref", nullable = false)
    private references reference;

    public ScaleModel() {
    }

    public ScaleModel(String name, references ref) {
        this.name = name;
        this.reference = ref;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public references getRef() {
        return reference;
    }

    public void setRef(references ref) {
        this.reference = ref;
    }

    public enum references {ITALERY, REVELL, HUMBROL}
}
