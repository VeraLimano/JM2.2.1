package hiber.model;

import hiber.MainApp;

import javax.persistence.*;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCar;

    private String model;

    private int series;

    @OneToOne(mappedBy = "car")
    private User user;

    public Car(){ };

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public long getIdCar() {
        return idCar;
    }

    public void setIdCar(long idCar) {
        this.idCar = idCar;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                '}';
    }
}
