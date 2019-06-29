package integratingdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("/integration.xml")
public class IntegratingDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegratingDataApplication.class, args);
	}

}

