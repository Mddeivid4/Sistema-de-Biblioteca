package exception;

public class LivroIndisponivelException extends Exception{

	public String toString() {
		return "Todos os exemplares já foram emprestados!";
	}
}
