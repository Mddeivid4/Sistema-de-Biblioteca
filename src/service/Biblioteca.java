package service;

import java.util.ArrayList;
import java.util.List;

import exception.LimiteEmprestimosException;
import exception.LivroIndisponivelException;
import model.Emprestimo;
import model.Livro;
import model.Usuario;

public class Biblioteca {
	
	private List<Livro> livros;
	private List<Usuario> usuarios;
	private List<Emprestimo> emprestimos;
	private List<Emprestimo> devolucoes;
	
	public Biblioteca() {
		super();
		this.livros = new ArrayList<>();
		this.usuarios = new ArrayList<>();
		this.emprestimos = new ArrayList<>();
		this.devolucoes = new ArrayList<>();
	}

	public void adicionarLivro(Livro livro) {
		this.livros.add(livro);
	}
	
	public void adicionarUsuario(Usuario usuario) {
		this.usuarios.add(usuario);
	}
	
	public void realizarEmprestimo(Livro livro, Usuario usuario, boolean acao) throws LivroIndisponivelException, LimiteEmprestimosException  {
		Emprestimo emprestimo = new Emprestimo(livro, usuario);
		if(acao == true) {
			emprestimo.realizarEmprestimo();
			emprestimos.add(emprestimo);
		} else if (acao == false){
			emprestimo.devolverLivro();
			emprestimos.remove(emprestimo);
			emprestimos.remove(0);
			devolucoes.add(emprestimo);
		}
	}
	
	public Livro listarLivros() {
		for(Livro livro : livros) {
			System.out.println(livro);
		}
		return null;
	}
	
	public Usuario listarUsuarios() {
		for(Usuario usuario : usuarios) {
			System.out.println(usuario);
		}
		return null;
	}
	
	public Emprestimo listarEmprestimo() {
		for(Emprestimo emprestimo : emprestimos) {
			System.out.println(emprestimo);
		}
		return null;
	}
	
	public Emprestimo listarDevolucoes() {
		for (Emprestimo devolucao : devolucoes) {
			System.out.println(devolucao);
		}
		return null;
	}

	
}
