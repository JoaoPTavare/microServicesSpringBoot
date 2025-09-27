package hr_payRoll.demo.service;

import hr_payRoll.demo.entites.Payment;
import org.springframework.stereotype.Service;

@Service
public interface  PaymentService {

    public Payment creatPayment(Long idWorker, Integer dayOdPayment);

}
