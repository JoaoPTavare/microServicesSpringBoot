package hr_payRoll.demo.controller;

import hr_payRoll.demo.entites.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import hr_payRoll.demo.respository.PaymentRepository;
import hr_payRoll.demo.service.PaymentService;

@RestController
@RequestMapping(value = "payment")
public class PayMentController {

    @Autowired
    PaymentRepository paymentRepository;
    @Autowired
    PaymentService paymentService;


    @PostMapping(value = "{idWorker}/day/{days}")
    public ResponseEntity<Payment> creatPayment(@PathVariable Long idWorker, @PathVariable Integer days){
        Payment payment = paymentService.creatPayment(idWorker, days);
        return ResponseEntity.ok(payment);

    }
}
