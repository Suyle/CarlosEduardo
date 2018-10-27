package br.edu.iftm.extensaoSTS.repositories;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import br.edu.iftm.extensaoSTS.domain.Atividade;

public interface IAtividadeRepository extends JpaRepository<Atividade, Integer> {

	List<Atividade> findByNomeContaining(@Param("nome") String nome);
}
