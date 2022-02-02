package no.hvl.data102;

import no.hvl.data102.adt.FilmarkivADT;

public class Filmarkiv implements FilmarkivADT {

	private Filmarkiv[] arkiv;
	private int antall;

	

	public Filmarkiv( int antall) {
		super();
		Filmarkiv[] arkiv = new Filmarkiv[antall];

		this.antall = antall;
	}

	@Override
	public void visFilm(int nr) {

	}

	@Override
	public void leggTilFilm(Film nyFilm) {

	}

	@Override
	public boolean slettFilm(int filmnr) {
		return false;
	}

	@Override
	public Film[] soekTittel(String delstreng) {
		return null;
	}

	@Override
	public int antall(Sjanger sjanger) {
		return 0;
	}

	@Override
	public int antall() {
		return 0;
	}

	private Filmarkiv[] utvid(Filmarkiv[] arkiv) {

		Filmarkiv[] utvidetTabell = new Filmarkiv[2 * arkiv.length];

		for (int i = 0; i < antall; i++) {
			utvidetTabell[i] = arkiv[i];

		}
		return utvidetTabell;
	}

	private Film[] trimTab(Film[] tab, int n) {
		// n er antall elementer
		Film[] nytab = new Film[n];
		int i = 0;
		while (i < n) {
			nytab[i] = tab[i];
			i++;

		}
		return nytab;
	}
}