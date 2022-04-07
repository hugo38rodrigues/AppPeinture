package com.springboot.app.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "SCALEMODELS")
public class ScaleModel implements Serializable {

    public enum references {ITALERY, REVELL, HUMBROL}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "ref")
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

    public String getName() {
        return name;
    }

    public references getRef() {
        return reference;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRef(references ref) {
        this.reference = ref;
    }
}
