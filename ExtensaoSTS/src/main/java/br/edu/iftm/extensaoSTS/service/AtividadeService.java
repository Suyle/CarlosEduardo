package br.edu.iftm.extensaoSTS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.iftm.extensaoSTS.domain.Atividade;
import br.edu.iftm.extensaoSTS.repositories.IAtividadeRepository;

@Service
public class AtividadeService {
	@Autowired
	private IAtividadeRepository repo;
	
	public Atividade buscar(Integer id) {
		Atividade atividade = repo.getOne(id);
		return atividade;
	}
}
