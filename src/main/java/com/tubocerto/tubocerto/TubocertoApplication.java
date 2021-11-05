package com.tubocerto.tubocerto;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tubocerto.tubocerto.domain.Categoria;
import com.tubocerto.tubocerto.repositories.CategoriaRepository;

@SpringBootApplication
public class TubocertoApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(TubocertoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Trefilação");
		Categoria cat2 = new Categoria(null, "Tratamento Térmico");
		Categoria cat3 = new Categoria(null, "Tratamento Químico");
		Categoria cat4 = new Categoria(null, "Endireitamento");
		Categoria cat5 = new Categoria(null, "Formação de Pontas");
		Categoria cat6 = new Categoria(null, "Inspeção de Processos");
		Categoria cat7 = new Categoria(null, "Apontar Parada");
		Categoria cat8 = new Categoria(null, "Inventário");
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6, cat7, cat8));
		
	}

}
