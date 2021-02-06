package br.com.smanager.livros.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.smanager.livros.domain.Livro;

public interface LivrosRepository extends JpaRepository<Livro, Long>{
	
	
	public List<Livro> findByNome(String nome);
	
	
	
	
	

}
