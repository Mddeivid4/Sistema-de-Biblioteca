package model;

import java.time.LocalDate;

import exception.LimiteEmprestimosException;
import exception.LivroIndisponivelException;

public class Emprestimo {
	
	private Livro livro;
	private Usuario usuario;
	private LocalDate dataEmprestimo;
	private LocalDate dataDevolucao;
	
	public Emprestimo(Livro livro, Usuario usuario) {
		super();
		this.livro = livro;
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		
		return usuario + " pegou " + livro + " no dia " + dataEmprestimo;
	}

	
	
	public void realizarEmprestimo() throws LimiteEmprestimosException {
		if(livro.getQuantidade() == 0) {
			throw new LimiteEmprestimosException();
		}
		livro.setQuantidade(livro.getQuantidade() - 1);
		dataEmprestimo = LocalDate.now();
		
	}
	
	public void devolverLivro() {
		if(dataDevolucao == null) {
			livro.setQuantidade(livro.getQuantidade() + 1);
			dataDevolucao = LocalDate.now();
		}
	}

	public LocalDate getDataEmprestimo() {
		return dataEmprestimo;
	}

	public LocalDate getDataDevolucao() {
		return dataDevolucao;
	}
	
	
}
