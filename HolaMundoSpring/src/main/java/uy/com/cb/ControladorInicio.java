package uy.com.cb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;


@RestController
@Slf4j
public class ControladorInicio {

	@GetMapping("/")
	public String inicio() {
		log.info("Ejecutando el controlador rest");
		log.debug("mas detalle del controlador");
		return "HolaMundo con Spring Boot";
	}
}