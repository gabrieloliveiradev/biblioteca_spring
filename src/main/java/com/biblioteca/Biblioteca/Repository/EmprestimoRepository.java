package com.biblioteca.Biblioteca.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biblioteca.Biblioteca.model.Emprestimo;

@Repository
public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long>{
	

	

}
