package hr_payRoll.demo.service;

import hr_payRoll.demo.entites.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hr_payRoll.demo.respository.PaymentRepository;

@Service
public class PayMentServiceIMP implements PaymentService {


    @Autowired
    PaymentRepository paymentRepository;

    public Payment creatPayment(Long idWorker, Integer dayOdPayment){
        Payment payment = new Payment();
        payment.setWorkId(idWorker);
        payment.setDaysOfPayment(dayOdPayment);

        return payment;
    }
}
