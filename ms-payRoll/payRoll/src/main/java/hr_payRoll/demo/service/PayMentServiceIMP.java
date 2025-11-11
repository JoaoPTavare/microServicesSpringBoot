package hr_payRoll.demo.service;

import hr_payRoll.demo.entites.Payment;
import hr_payRoll.demo.entites.Worker;
import hr_payRoll.demo.feigenClients.PaymentFeingclients;
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

    @Autowired
    private PaymentFeingclients paymentFeingclients;

    @Override
    public Payment creatPayment(Long idWorker, Integer dayOdPayment) {
        Worker worker = paymentFeingclients.findById(idWorker).getBody();
        return new Payment(worker.getName(), worker.getDaiLyIncome(), dayOdPayment);
    }

}
