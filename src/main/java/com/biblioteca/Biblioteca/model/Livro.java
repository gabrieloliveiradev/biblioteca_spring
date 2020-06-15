package com.biblioteca.Biblioteca.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
@Table(name="livro")
public class Livro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idLivro;


	@NotNull
	@Size(min=2,max=100)
	private String genero;
	
	

	private long qtdLivros;
	
	@NotNull
	@Size(min=2,max=80)
	private String nomeLivro;

	public long getIdLivro() {
		return idLivro;
	}

	public void setIdLivro(long idLivro) {
		this.idLivro = idLivro;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public long getQtdLivros() {
		return qtdLivros;
	}

	public void setQtdLivros(long qtdLivros) {
		this.qtdLivros = qtdLivros;
	}

	public String getNomeLivro() {
		return nomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}

		

}
