package hiber.model;

import org.hibernate.annotations.Generated;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Cars")
public class Car implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "model")
    public String model;

    @Column(name = "series")
    public int series;

    @OneToOne(mappedBy = "car", cascade = CascadeType.ALL)
    private User user;

    public Car(){

    }

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public User getUser() {
        return user;
    }
}
