package hr_payRoll.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.cloud.openfeign.EnableFeignClients;


@RibbonClient(name = "ms-worker")
@EnableFeignClients
@SpringBootApplication
public class HrPayRollApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrPayRollApplication.class, args);
	}

}
