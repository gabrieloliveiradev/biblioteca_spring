package com.biblioteca.Biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.Biblioteca.Repository.LivroRepository;
import com.biblioteca.Biblioteca.model.Livro;

@RestController
@RequestMapping("/livro") 
@CrossOrigin("*")
public class LivrosController {
	
	@Autowired //todos os serviços da interface seja acessado a partir do controller
	private LivroRepository repository;	
	
	@GetMapping
	public ResponseEntity<List<Livro>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Livro> GetById(@PathVariable long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/nomeLivro/{nomeLivro}")
	public ResponseEntity<List<Livro>> GetByTitulo(@PathVariable String nomeLivro){
		return ResponseEntity.ok(repository.findAllByNomeLivroContainingIgnoreCase(nomeLivro));
	}
	
	@PostMapping
	public ResponseEntity<Livro> post(@RequestBody Livro livro){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(livro));
	}
	
	@PutMapping
	public ResponseEntity<Livro> put(@RequestBody Livro livro){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(livro));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
	

}
