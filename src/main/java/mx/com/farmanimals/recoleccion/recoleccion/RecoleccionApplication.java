package mx.com.farmanimals.recoleccion.recoleccion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "mx.com.farmanimals.recoleccion.recoleccion.repository")
public class RecoleccionApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecoleccionApplication.class, args);
	}

}
