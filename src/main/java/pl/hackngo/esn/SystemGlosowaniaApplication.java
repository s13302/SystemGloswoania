package pl.hackngo.esn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "pl.hackngo.esn")
public class SystemGlosowaniaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SystemGlosowaniaApplication.class, args);
	}
}
