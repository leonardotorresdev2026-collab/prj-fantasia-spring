package com.leo.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_fantasias")
public class Fantasias {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;

	private double preco;

	private String Faixaetaria;

	private String tamanho;

	// construtores sem parametro

	public Fantasias() {
	}

	// com parametro
	public Fantasias(Long id, String nome, double preco, String Faixaetaria, String tamanho) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.Faixaetaria = Faixaetaria;
		this.tamanho = tamanho;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getFaixaetaria() {
		return Faixaetaria;
	}

	public void setFaixaetaria(String faixaetaria) {
		Faixaetaria = faixaetaria;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

}
