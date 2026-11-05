package com.leo.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.leo.demo.entities.Fantasias;
import com.leo.demo.repositories.FantasiasRepository;

@Service
public class FantasiasService {

	private final FantasiasRepository Fantasiasrepository;

	public FantasiasService(FantasiasRepository Fantasiasrepository) {

		this.Fantasiasrepository = Fantasiasrepository;
	}

	public Fantasias criarFantasias(Fantasias fantasias) {
		return Fantasiasrepository.save(fantasias);
	}

	public List<Fantasias> ListarFantasias() {
		return Fantasiasrepository.findAll();
	}

	public Fantasias getFantasiasId(Long id) {
		return Fantasiasrepository.findById(id).orElse(null);
	}

	public void excluirFantasiasId(Long id) {
		Fantasiasrepository.deleteById(id);

	}
}

