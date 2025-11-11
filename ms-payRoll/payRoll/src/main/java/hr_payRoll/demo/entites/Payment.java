package hr_payRoll.demo.entites;


import jakarta.persistence.*;

import java.util.Objects;

@Table(name = "payment")
@Entity
public class Payment {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long workId;

    @Column
    private Integer daysOfPayment;

    @Column(name="daily_income")
    private Double daiLyIncome;

    @Column
    private Double valueOfPayment;

    public Payment(String name, Double daiLyIncome, Integer dayOdPayment) {
    }

    public Payment(Long id, Long workId, Integer daysOfPayment, Double valueOfPayment, Double daiLyIncome) {
        this.id = id;
        this.workId = workId;
        this.daysOfPayment = daysOfPayment;
        this.valueOfPayment = valueOfPayment;
        this.daiLyIncome = daiLyIncome;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getWorkId() {
        return workId;
    }

    public void setWorkId(Long workId) {
        this.workId = workId;
    }

    public Integer getDaysOfPayment() {
        return daysOfPayment;
    }

    public void setDaysOfPayment(Integer daysOfPayment) {
        this.daysOfPayment = daysOfPayment;
    }

    public Double getValueOfPayment() {
        return valueOfPayment;
    }

    public void setValueOfPayment(Double valueOfPayment) {
        this.valueOfPayment = daysOfPayment * daiLyIncome;
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

        Payment payment = (Payment) o;
        return Objects.equals(id, payment.id) && Objects.equals(workId, payment.workId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }


}
