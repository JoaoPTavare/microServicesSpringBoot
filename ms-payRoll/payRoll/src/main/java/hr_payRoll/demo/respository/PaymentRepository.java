package hr_payRoll.demo.respository;

import hr_payRoll.demo.entites.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface   PaymentRepository  extends JpaRepository<Payment, Long> {
}
