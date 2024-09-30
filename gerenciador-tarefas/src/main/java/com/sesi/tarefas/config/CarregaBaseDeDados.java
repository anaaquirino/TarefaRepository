package com.sesi.tarefas.config;

import org.springframework.boot.CommandLineRunner;

import com.sesi.gerenciador_tarefas.model.TarefaCategoria;

public class CarregaBaseDeDados {
	CommandLineRunner executar() {
		
		return args ->{
			TarefaCategoria categoria = new TarefaCategoria();
			categoria.setNome("Estudos");
			
			TarefaCategoria categoria1 = new TarefaCategoria();
			categoria1.setNome("Pesquisa");
		};
	}

}
