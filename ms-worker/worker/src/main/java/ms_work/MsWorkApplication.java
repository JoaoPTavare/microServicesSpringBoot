package ms_work;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MsWorkApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsWorkApplication.class, args);
	}

	@Bean
	public ObjectMapper obejectMapper(){
		return new ObjectMapper();
	}


}
