package hr_payRoll.demo.feigenClients;

import hr_payRoll.demo.entites.Worker;
import org.apache.el.stream.Optional;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient( name = "ms-work",  path = "workes/Worker")
public interface PaymentFeingclients {
    @GetMapping( value = "Worker/{id}")
    public ResponseEntity<Worker> findById(@PathVariable Long id);
}
