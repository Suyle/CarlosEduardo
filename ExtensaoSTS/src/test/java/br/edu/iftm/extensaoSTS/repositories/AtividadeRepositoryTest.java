package br.edu.iftm.extensaoSTS.repositories;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import br.edu.iftm.extensaoSTS.domain.Atividade;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AtividadeRepositoryTest {

	@Autowired
	private IAtividadeRepository atividadeRepositorio;
	
	@Test
	public void verificaQuantidadeAtividadesCadastrada() {
		Page<Atividade> atividades = this.atividadeRepositorio.findAll(PageRequest.of(0,10));
		assertTrue(atividades.getTotalElements() > 0);
	}
	
	@Test
	public void findByNome() {
		List<Atividade> atividades = this.atividadeRepositorio.findByNomeContaining("GDG");
		assertTrue(atividades.size() == 1);
	}
	
	@Test
	public void find() {
		List<Atividade> atividades = this.atividadeRepositorio.findByNomeContaining("LUIS");
		assertTrue(atividades.size() == 0);
	}
	
}
