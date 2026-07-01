package main;

import exception.LimiteEmprestimosException;
import exception.LivroIndisponivelException;
import model.Livro;
import model.UsuarioComum;
import model.UsuarioPremium;
import model.Usuario;
import service.Biblioteca;

public class Main {

	public static void main(String[] args) {
		
		Biblioteca bb = new Biblioteca();
		
		Livro l1 = new Livro("Java Básico","Loiane Groner");
		Livro l2 = new Livro("Clean Code","Linus Torvalds");
		Livro l3 = new Livro("Spring Boot","Loiane Groner");
		
		bb.adicionarLivro(l1);
		bb.adicionarLivro(l2);
		bb.adicionarLivro(l3);
		
		Usuario usuario1 = new UsuarioComum("Cosmic", 456);
		Usuario usuario2 = new UsuarioComum("Jeanne", 123);
		Usuario usuario3 = new UsuarioPremium("Theoto", 654);
		Usuario usuario4 = new UsuarioPremium("Melissa", 321);
		
		bb.adicionarUsuario(usuario1);
		bb.adicionarUsuario(usuario2);
		bb.adicionarUsuario(usuario3);
		bb.adicionarUsuario(usuario4);
		
		try {
			bb.realizarEmprestimo(l1, usuario1, true);
			bb.realizarEmprestimo(l3, usuario4, true);
			bb.realizarEmprestimo(l2, usuario2, true);
			
			bb.realizarEmprestimo(l2, usuario2, false);
			bb.realizarEmprestimo(l3, usuario4, false);
		} catch (LimiteEmprestimosException e) {
			System.out.println(e.getMessage());
		} catch (LivroIndisponivelException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("===== Livros =====");
		System.out.println();
		bb.listarLivros();
		System.out.println();
		System.out.println("===== Emprestimo =====");
		System.out.println();
		bb.listarEmprestimo();
		System.out.println();
		System.out.println("===== Devolução =====");
		System.out.println();
		bb.listarDevolucoes();
		
	}

}
