package com.springboot.database.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "CONVERSIONPOTS")
@Getter
@Setter
public class ConversionPot implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

    @Override
    public String toString() {
        return String.format("<ConversionPot [id=%s, type=%s, Humbrol=%s, Revell=%s, Italeri=%s]>",
                this.id, this.potName, this.humbrol, this.revell, this.italeri);
    }
}
