package com.biblioteca.Biblioteca.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biblioteca.Biblioteca.model.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
	
	public List<Livro> findAllByNomeLivroContainingIgnoreCase (String nomeLivro);

}
