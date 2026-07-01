package model;

import exception.LivroIndisponivelException;

public class Livro {
	private String titulo;
	private String autor;
	private int quantidade;
	
	public Livro(String titulo, String autor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.quantidade = 10;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		return titulo ;
	}
	
	
	
}
