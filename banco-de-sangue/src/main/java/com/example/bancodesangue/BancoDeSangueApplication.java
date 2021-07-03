package com.example.bancodesangue;

import com.example.bancodesangue.entity.Doador;
import com.example.bancodesangue.service.DoadorService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.paranamer.ParanamerModule;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class BancoDeSangueApplication {

	public static void main(String[] args) {
		SpringApplication.run(BancoDeSangueApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(DoadorService doadorService){
		return args -> {
			// leitura do json
			ObjectMapper mapper = new ObjectMapper();
			mapper.registerModule(new ParanamerModule());
			TypeReference<List<Doador>> typeReference = new TypeReference<List<Doador>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/data.json");
			try {
				List<Doador> doadores = mapper.readValue(inputStream,typeReference);
				doadorService.saveAll(doadores);
				System.out.printf("Doadores salvos!");
			} catch (IOException e){
				System.out.printf("Erro: " + e.getMessage());
			}
		};
	}

}
