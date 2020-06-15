package com.biblioteca.Biblioteca.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.biblioteca.Biblioteca.model.Cliente;

@Repository
public interface ClientenRepository extends JpaRepository<Cliente, Long>{
	
	
	public List<Cliente> findAllByNomeContainingIgnoreCase (String nome);
	

}
