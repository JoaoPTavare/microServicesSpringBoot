package hr_payRoll.demo.service;

import hr_payRoll.demo.entites.Payment;
import hr_payRoll.demo.entites.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import hr_payRoll.demo.respository.PaymentRepository;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class PayMentServiceIMP implements PaymentService {


    @Autowired
    PaymentRepository paymentRepository;

    @Value("${hr-worker.host}")
    private String host;

    @Autowired
    private RestTemplate restTemplate;

    public Payment creatPayment(Long idWorker, Integer dayOdPayment){
        Map<String, String> uriVarieble = new HashMap<>();
        uriVarieble.put("id", ""+idWorker);
        Worker worker = restTemplate.getForObject(host + "Worker/{id}", Worker.class, uriVarieble);
        Payment payment = new Payment();
        payment.setWorkId(worker.getId());
        payment.setDaiLyIncome(worker.getDaiLyIncome());
        payment.setDaysOfPayment(dayOdPayment);
        return payment;
    }
}
