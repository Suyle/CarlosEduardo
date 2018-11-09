package br.edu.iftm.extensaoSTS.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import br.edu.iftm.extensaoSTS.domain.Atividade;
import br.edu.iftm.extensaoSTS.repositories.IAtividadeRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AtividadeRepositoryTest {

	@Autowired
	private IAtividadeRepository atividadeRepository;
	
	@Test
	public void verificaQuantidadeAtividadeCadastradas() {
		Page<Atividade> atividades = this.atividadeRepository.findAll(PageRequest.of(0, 10));
		assertThat(atividades.getTotalElements()).isGreaterThan(0l);
	}
	
	@Test
	public void findByNome() {
		List<Atividade> atividades = atividadeRepository.findByNomeContaining("GDG");
		assertThat(atividades.size()).isEqualTo(1);
	}
	
	@Test
	public void find() {
		List<Atividade> atividades = atividadeRepository.findByNomeContaining("Luis");
		assertThat(atividades.size()).isEqualTo(0);
	}
}
