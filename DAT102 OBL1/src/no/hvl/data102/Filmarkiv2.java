package no.hvl.data102;

import no.hvl.data102.adt.FilmarkivADT;

public class Filmarkiv2<T> implements FilmarkivADT {
	
	
	
	private int antall; 
    private LinearNode<Film> forste; 

		

	public int getAntall() {
		return antall;
	}

	public void setAntall(int antall) {
		this.antall = antall;
	}

	public LinearNode<Film> getStart() {
		return forste;
	}

	public void setStart(LinearNode<Film> start) {
		this.forste = start;
	}

	public Filmarkiv2(int antall, LinearNode<Film> start) {
		super();
		this.antall = antall;
		this.forste = start;
	}

	@Override
	public void visFilm(int nr) {
		
	}

	@Override
	public void leggTilFilm(Film nyFilm) {
		
		
		LinearNode<Film> nynode = new LinearNode<Film>(nyFilm);
		nynode.setNeste(forste);
		forste = nynode;
		antall++;

	}

	@Override
	public boolean slettFilm(int filmnr) {
		boolean funnet = false;
		LinearNode<Film> node = null;
		LinearNode<Film> aktuell = forste;
		for (int soek = 0; soek < antall && !funnet; soek++) {
			if (aktuell.getElement().equals(filmnr)) {
				funnet = true;
				node = aktuell;
			} else {
				aktuell = aktuell.getNeste();
			}
		}
		return funnet;
	}

	
	public LinearNode<Film> soekTittel(String delstreng) {
		LinearNode<Film> funnet = null;
		LinearNode<Film> aktuell = forste;
		for (int soek = 0; soek < antall ; soek++) {
			if (aktuell.getElement().equals(delstreng)) {
				funnet =aktuell; ;
				 
			} else {
				aktuell = aktuell.getNeste();
			}
		}
		return funnet;
	}

	@Override
	public int antall(Sjanger sjanger) {
		return antall;
	}

	@Override
	public int antall() {
		return antall;
	}

}
