package br.edu.iftm.extensaoSTS.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.iftm.extensaoSTS.domain.Atividade;
import br.edu.iftm.extensaoSTS.repositories.IAtividadeRepository;

@RestController
@RequestMapping(value = "/atividades")
public class AtividadeResource {
	
	@Autowired
	private IAtividadeRepository atividadeRepositorio;

	@GetMapping
	public List<Atividade> listar(){
		/*Atividade a1 = new Atividade(1, "visita tecnica gdg");
		Atividade a2 = new Atividade(2, "simpós");
		return Arrays.asList(a1,a2);*/
		
		return atividadeRepositorio.findAll();
	}
}
