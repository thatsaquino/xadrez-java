package tabuleiro;

public class TabuleiroException extends RuntimeException { //exce��o opcional de ser tratada

	private static final long serialVersionUID = 1L;
	
	public TabuleiroException(String msg) { //construtor que recebe a mensagem
		super(msg); //repassar o construtor para a super classe que � a RuntimeException
	}
	
}
