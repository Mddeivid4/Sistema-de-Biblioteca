package service;

import java.util.List;

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
	public void realizarEmprestimo(Emprestimo emprestimo) {
		this.emprestimos.add(emprestimo);
	}
	public void listarLivros() {
		
	}
}
