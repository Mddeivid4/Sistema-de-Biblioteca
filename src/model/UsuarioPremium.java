package model;

import interfaces.Notificavel;

public class UsuarioPremium extends Usuario implements Notificavel{
	
	public UsuarioPremium(String nome, int id) {
		super.nome = nome;
		super.id = id;
	}
	
	@Override
	public int getLimiteEmprestimo() {
		return 5;
	}

	@Override
	public void enviarNotificacao(String mensagem) {
		System.out.println(mensagem);
	}
	
}
