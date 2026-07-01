package model;

import interfaces.Notificavel;

public class UsuarioComum extends Usuario implements Notificavel{
	
	public UsuarioComum(String nome, int id) {
		super(nome, id);
	}
	
	@Override
	public int getLimiteEmprestimo() {
		return 3;
	}

	@Override
	public void enviarNotificacao(String mensagem) {
		System.out.println(mensagem);
		
	}
}
