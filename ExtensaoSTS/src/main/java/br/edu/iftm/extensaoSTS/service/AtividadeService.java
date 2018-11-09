package br.edu.iftm.extensaoSTS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.iftm.extensaoSTS.domain.Atividade;
import br.edu.iftm.extensaoSTS.repositories.IAtividadeRepository;

@Service
public class AtividadeService {

	@Autowired
	private IAtividadeRepository atividadeRepositorio;
	
	public Atividade buscar(Integer id) {
		return atividadeRepositorio.findById(id).get();
	}
	
	public void salvar(Atividade atividade) {
		atividadeRepositorio.save(atividade);
	}
	
	public void deletar(Integer id) {
		atividadeRepositorio.deleteById(id);
	}
}
