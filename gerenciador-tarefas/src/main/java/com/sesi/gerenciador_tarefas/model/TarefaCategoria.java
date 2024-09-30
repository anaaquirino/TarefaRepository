package com.sesi.gerenciador_tarefas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TarefaCategoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nome;
	
		
	
public TarefaCategoria(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}


	public TarefaCategoria() {
	// TODO Auto-generated constructor stub
}


	public int getIt() {
		return id;
	}

	public void setIt(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
