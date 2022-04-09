package database.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PAINTPOTS")
public class PaintPot {

    @ManyToMany(mappedBy = "paintPots")
    List<ScaleModel> scaleModels;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "paintQuantity", length = 3)
    private int paintQuantity;

    @Column(name = "quantity", length = 2)
    private int quantity;

    @Column(name = "area", length = 3)
    private int area;

    @ManyToOne()
    private ConversionPot conversionPot;

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

    @Override
    public String toString() {
        return String.format("<ConversionPot [id=%s, paintQuantity=%s, quantity=%s, area=%s]>",
                this.id, this.paintQuantity, this.quantity, this.area);
    }
}
