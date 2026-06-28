package exception;

public class LimiteEmprestimosException extends Exception {
	
	public String toString() {
		return "Usuario já pegou o numero maximo de livros!";
	}
}
