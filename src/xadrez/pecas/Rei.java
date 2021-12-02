package xadrez.pecas;

import tabuleiro.Tabuleiro;
import xadrez.Cores;
import xadrez.PecaXadrez;

public class Rei extends PecaXadrez {

	public Rei(Tabuleiro tabuleiro, Cores cores) {
		super(tabuleiro, cores);
	}
	
	@Override
	public String toString() {
		return "K";
	}

}
