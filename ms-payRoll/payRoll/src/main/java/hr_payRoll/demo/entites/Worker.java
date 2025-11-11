package hr_payRoll.demo.entites;

import jakarta.persistence.*;

import java.io.Serializable;

@Table(name = "worker")
@Entity
public class Worker implements Serializable{

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    long id;

    @Column(name="name")
    String name;

    @Column(name="daily_income")
    Double daiLyIncome;

    public Worker() {
    }

    public Worker(long id, String name, Double daiLyIncome) {
        this.id = id;
        this.name = name;
        this.daiLyIncome = daiLyIncome;
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

    public Double getDaiLyIncome() {
        return daiLyIncome;
    }

    public void setDaiLyIncome(Double daiLyIncome) {
        this.daiLyIncome = daiLyIncome;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Worker woker = (Worker) o;
        return id == woker.id;
    }

    @Override
    public int hashCode() {
        return Long.hashCode(id);
    }
}




