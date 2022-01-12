package tabuleiro;

public class Tabuleiro {
	
	private int linhas;
	private int colunas;
	private Peca[][] pecas;
	
	public Tabuleiro(int linhas, int colunas) {
		if(linhas < 1 || colunas < 1 ) {
			throw new TabuleiroException("Erro criando tabuleiro: � necess�rio que haja pelo menos 1 linha e 1 coluna");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas];
	}

	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public Peca peca(int linhas, int colunas) {
		if(!posicaoExiste(linhas, colunas)) {
			throw new TabuleiroException("Posi��o n�o est� no tabuleiro");
		}
		return pecas[linhas][colunas];
	}
	
	public Peca peca(Posicao posicao) {
		if(!posicaoExiste(posicao)) {
			throw new TabuleiroException("Posi��o n�o est� no tabuleiro");
		}
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void posicaoPeca(Peca peca, Posicao posicao) {
		if(pecaExiste(posicao)) {
			throw new TabuleiroException("J� existe uma pe�a nessa posi��o: " + posicao);
		}
		pecas[posicao.getLinha()][posicao.getColuna()] = peca; //pegar a matriz na posi��o dada e atribuir a pe�a que eu informei
		peca.posicao = posicao;
	}
	
	private boolean posicaoExiste(int linha, int coluna) {
		return linha >= 0 && linha < linhas && coluna >= 0 && coluna  < colunas;
	}
	
	public boolean posicaoExiste(Posicao posicao) {
		return posicaoExiste(posicao.getLinha(), posicao.getColuna());
	}
	
	public boolean pecaExiste(Posicao posicao) {
		if(!posicaoExiste(posicao)) {
			throw new TabuleiroException("Posi��o n�o est� no tabuleiro");
		}
		return peca(posicao) != null;
	}

}
