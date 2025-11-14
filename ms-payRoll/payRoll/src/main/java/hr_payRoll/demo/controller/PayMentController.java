package hr_payRoll.demo.controller;

import com.netflix.ribbon.proxy.annotation.Hystrix;
import hr_payRoll.demo.entites.Payment;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import hr_payRoll.demo.respository.PaymentRepository;
import hr_payRoll.demo.service.PaymentService;

@RestController
@RequestMapping(value = "payment")
public class PayMentController {

    @Autowired
    PaymentRepository paymentRepository;
    @Autowired
    PaymentService paymentService;

    //fallbackMethod Chama o metodo alternativo no momento estou sem metodo alternativo
    @CircuitBreaker(name = "getPayment", fallbackMethod = "")
    @PostMapping(value = "{idWorker}/day/{days}")
    public ResponseEntity<Payment> creatPayment(@PathVariable Long idWorker, @PathVariable Integer days) {
        Payment payment = paymentService.creatPayment(idWorker, days);
        return ResponseEntity.ok(payment);
    }


    // o metodo get, sera evoluido com avanços na estrutura
    @GetMapping
    public ResponseEntity<Payment> getPayment(@PathVariable Long idWorker, @PathVariable Integer days) {
        Payment payment = paymentService.getPayment(idWorker, days);
        return ResponseEntity.ok(payment);
    }


}
