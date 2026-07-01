package model;

public abstract class Usuario {
	
	public String nome;
	public int id;
	
	public Usuario(String nome, int id) {
		this.nome = nome;
		this.id = id;
	}
	

	@Override
	public String toString() {
		return nome ;
	}


	public abstract int getLimiteEmprestimo();
}
