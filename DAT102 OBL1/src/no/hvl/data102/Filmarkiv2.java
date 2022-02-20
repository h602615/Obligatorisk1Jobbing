package no.hvl.data102;

import java.util.ArrayList;

import no.hvl.data102.adt.FilmarkivADT;

public class Filmarkiv2<T> implements FilmarkivADT {
	
	
	
	private int antall; 
    private LinearNode<Film> forste; 

    public Filmarkiv2() {
		this.antall = 0;
		this.forste = null;
	}

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
		LinearNode<Film> aktuell = forste;
		while (aktuell != null) {
			if (nr == aktuell.getElement().getFilmnr()) {
				System.out.println(aktuell.getElement().toString());
				return;
			}
			aktuell = aktuell.getNeste();
		}
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

	
	public Film[] soekTittel(String delstreng) {
		ArrayList<Film> innholder = new ArrayList<Film>();

		LinearNode<Film> curr = this.forste;
		while (curr != null) {
			if (curr.getElement().getTittel().contains(delstreng)) {
				innholder.add(curr.getElement());
			}
			curr = curr.getNeste();
		}

		Film[] svar = new Film[innholder.size()];
		svar = innholder.toArray(svar);
		return svar;
	}

	@Override
	public int antall(Sjanger sjanger) {
		int i = 0;
		LinearNode<Film> curr = this.forste;
		while (curr != null) {
			if (sjanger == curr.getElement().getSjanger()) {
				i++;
			}
		}
		return i;	}

	@Override
	public int antall() {
		return antall;
	}

	@Override
	public boolean soekFilmprodusent(String delstreng) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean finnes(int nr) {
		
		
		return false;
	}

}
