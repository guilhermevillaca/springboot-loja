package br.com.guilhermevillaca.projeto_loja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProjetoLojaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoLojaApplication.class, args);
	}
        
        
        @GetMapping("ola")
        public String ola(){
            return "ola mundo";
        }

}
