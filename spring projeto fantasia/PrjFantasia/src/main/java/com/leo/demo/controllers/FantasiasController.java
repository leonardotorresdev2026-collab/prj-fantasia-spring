package com.leo.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leo.demo.entities.Fantasias;
import com.leo.demo.services.FantasiasService;

@RestController
@RequestMapping("/fantasias")
public class FantasiasController {

	private final FantasiasService fantasiasservice;

	public FantasiasController(FantasiasService fantasiasservice) {

		this.fantasiasservice = fantasiasservice;
	}

	@PostMapping
	public Fantasias saveFantasias(@RequestBody Fantasias fantasias) {
		return fantasiasservice.criarFantasias(fantasias);
	}

	@GetMapping
	public List<Fantasias> ListarTodos() {
		return fantasiasservice.ListarFantasias();
	}

	@GetMapping("/{id}")
	public Fantasias ListarPorId(@PathVariable Long id) {
		return fantasiasservice.getFantasiasId(id);
	}

	@DeleteMapping("/{id}")
	public void deletarFantasias(@PathVariable Long id) {
		fantasiasservice.excluirFantasiasId(id);
	}
}
