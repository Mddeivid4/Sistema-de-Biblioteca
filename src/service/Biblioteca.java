package service;

import java.util.List;

import exception.LimiteEmprestimosException;
import model.Emprestimo;
import model.Livro;
import model.Usuario;

public class Biblioteca {
	
	private List<Livro> livros;
	private List<Usuario> usuarios;
	private List<Emprestimo> emprestimos;
	
	public void adicionarLivro(Livro livro) {
		this.livros.add(livro);
	}
	
	public void adicionarUsuario(Usuario usuario) {
		this.usuarios.add(usuario);
	}
	
	public void realizarEmprestimo(Emprestimo emprestimo) throws LimiteEmprestimosException  {
		this.emprestimos.add(emprestimo);
	}
	
	public Livro listarLivros() {
		for(Livro livro : livros) {
			return livro;
		}
		return null;
	}
	
	public Usuario listarUsuarios() {
		for(Usuario usuario : usuarios) {
			return usuario;
		}
		return null;
	}
}
