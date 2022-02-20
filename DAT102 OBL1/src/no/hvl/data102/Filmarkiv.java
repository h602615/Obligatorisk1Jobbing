package no.hvl.data102;

import java.util.ArrayList;

import no.hvl.data102.adt.FilmarkivADT;

public class Filmarkiv implements FilmarkivADT {

	private Film[] arkiv;
	private int antall;

	public Filmarkiv(int antall) {
		this.arkiv = new Film[antall];

		this.antall = 0;
	}

	@Override
	public void visFilm(int nr) {

		for (int i = 0; i < this.antall; i++) {
			if (nr == this.arkiv[i].getFilmnr()) {

				Film random = this.arkiv[nr];
				System.out.print(random.toString());

			}
		}
	}

	@Override
	public void leggTilFilm(Film nyFilm) {
		if (antall == arkiv.length) {
			utvid(arkiv);
		}

		for (int i = 0; i < antall; i++) {
			arkiv[antall] = nyFilm;
			i++;
		}

	}

	@Override
	public boolean slettFilm(int filmnr) {

		for (int i = 0; i > antall; i++) {
			if (filmnr == arkiv[i].getFilmnr()) {
				antall--;
				arkiv[i] = arkiv[antall];
				arkiv[antall] = null;
				return true;
			}

		}
		return false;
	}

	@Override
	public Film[] soekTittel(String delstreng) {

		ArrayList<Film> svar = new ArrayList<Film>();

		for (int i = 0; i < this.antall; i++) {
			if (this.arkiv[i].getTittel().contains(delstreng)) {
				svar.add(this.arkiv[i]);
			}
		}

		Film[] tabell = new Film[svar.size()];
		tabell = svar.toArray(tabell);
		return tabell;
	
	}

	@Override
	public int antall(Sjanger sjanger) {
		int atallSjanger = 0;
		for (int i = 0; i < this.antall; i++) {
			if (sjanger == this.arkiv[i].getSjanger()) {
				atallSjanger++;
			}
		}

		return atallSjanger;	}

	@Override
	public int antall() {
		return antall;
	}

	private Film[] utvid(Film[] arkiv) {

		Film[] utvidetTabell = new Film[2 * arkiv.length];

		for (int i = 0; i < antall; i++) {
			utvidetTabell[i] = arkiv[i];

		}
		return arkiv = utvidetTabell;
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
	@Override
	public String toString() {
		String s = "";
		for (int i = 0; i < this.antall; i++) {
			s += this.arkiv[i].toString() + "\n";
		}
		return s;
	}

	@Override
	public boolean soekFilmprodusent(String delstreng) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean finnes(int nr) {
		boolean finnes= false;
		for (int i = 0; i < antall; i++) {
			if (nr == arkiv[i].getFilmnr()) {
				return finnes = true;
			}
		}
		return finnes;
	}

}