package edu.UdeA.proyecto_ciclo_3;
import edu.UdeA.proyecto_ciclo_3.modelos.Empresa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;


@SpringBootApplication (exclude = {SecurityAutoConfiguration.class})
public class Proyc3Application {
	@GetMapping("/saludo")
	public String hello(){
		return "hola saludo inicial";
	}
	//se cra un probador llamado TEST

	@GetMapping ("/test")
	public String test(){
		Empresa emp = new Empresa("software SAS","dir de ejemplo","301230", "5825080" );
		return emp.getTelefono() ;
	}

	public static void main(String[] args) {
		SpringApplication.run(Proyc3Application.class, args);
	}

}
