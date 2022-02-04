package com.it.msencuesta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.it.msencuesta"})
public class MsencuestaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsencuestaApplication.class, args);
	}

}
