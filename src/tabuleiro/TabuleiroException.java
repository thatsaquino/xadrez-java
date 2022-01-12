package tabuleiro;

public class TabuleiroException extends RuntimeException { //exceção opcional de ser tratada

	private static final long serialVersionUID = 1L;
	
	public TabuleiroException(String msg) { //construtor que recebe a mensagem
		super(msg); //repassar o construtor para a super classe que é a RuntimeException
	}
	
}
