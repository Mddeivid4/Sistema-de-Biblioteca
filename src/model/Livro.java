package model;

public class Livro {
	private String titulo;
	private String autor;
	private int quantidade;
	
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

	//Adicionar Exception para caso não tenha quantidade disponivel
	public void Emprestar(String titulo) {
		if(quantidade > 0) {
			quantidade -= 1;
		}
	}
	
	public void Devolver(String titulo) {
		quantidade += 1;
	}
}
