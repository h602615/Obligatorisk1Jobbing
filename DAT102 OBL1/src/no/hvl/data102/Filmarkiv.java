package no.hvl.data102;

import no.hvl.data102.adt.FilmarkivADT;

public class Filmarkiv implements FilmarkivADT {

	private Film[] arkiv;
	private int antall;

	


	public Filmarkiv( int antall) {
		 this.arkiv = new Film[antall];

		this.antall = 0;
	}

	@Override
	public void visFilm(int nr) {

		int n = finn(nr);
		if(n<0) {
			return;
		}
		
	
		Film random = this.arkiv[n];
		System.out.print(random.toString());
		
	}

	@Override
	public void leggTilFilm(Film nyFilm) {
		if(antall==arkiv.length) {
			utvid();
		}
		
		for(int i =0;i<antall;i++) {
			arkiv[antall]=nyFilm;
			i++;
		}
		
		
	}

	@Override
	public boolean slettFilm(int filmnr) {
			
		for(int i =0;i>antall;i++) {
			if(filmnr==arkiv[i].getFilmnr()) {
				antall--;
				arkiv[i]=arkiv[antall];
				arkiv[antall]=null;
				return true;
			}

		}
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