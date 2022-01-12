package xadrez;

import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaXadrez {
	
	private Tabuleiro tabuleiro;
	
	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8,8); //aqui define o tamanho do tabuleiro 8x8
		iniciarPartida();
	}
	
	public PecaXadrez[][] pegaPecas() { //retorna uma matriz de peças de xadrez correspondente a essa partida
		PecaXadrez[][] mat = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()]; //instancia uma matriz do tipo PecaXadrez, recebendo como argumento as linhas e colunas do tabuleiro
		for(int i=0; i<tabuleiro.getLinhas(); i++) { //percorre as linhas do tabuleiro
			for(int j=0; j<tabuleiro.getColunas(); j++) { //percorre as colunas do tabuleiro
				mat[i][j] = (PecaXadrez) tabuleiro.peca(i,j); //popula minhas peças de acordo com as colunas e linhas do tabuleiro
			}
		}
		
		return mat;
	}
	
	private void iniciarPartida() {
		tabuleiro.posicaoPeca(new Torre(tabuleiro, Cores.BRANCO), new Posicao(2,1));
		tabuleiro.posicaoPeca(new Rei(tabuleiro, Cores.PRETO), new Posicao(0,4));
		tabuleiro.posicaoPeca(new Rei(tabuleiro, Cores.PRETO), new Posicao(7,4));
		
	}

}
