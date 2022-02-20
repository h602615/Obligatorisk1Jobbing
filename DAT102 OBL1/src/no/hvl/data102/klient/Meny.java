package no.hvl.data102.klient;

import no.hvl.data102.adt.FilmarkivADT;
import no.hvl.data102.Film;

public class Meny {

	private Tekstgrensesnitt tekstgr;
	private FilmarkivADT filmarkiv;

	public Meny(FilmarkivADT filmarkiv) {
		tekstgr = new Tekstgrensesnitt();
		this.filmarkiv = filmarkiv;
	}

	public void start() {
		

	
		film 1 = new Film(14, "Mr S", "Sherk ", 2002, Sjanger.ROMANCE,
				"Disney ");
		Film 2 = new Film(76, "Sherk II", "Sherk II", 2003, Sjanger.ROMANCE,
				"Disney");
		Film 3 = new Film(01, "Shrek III", "Sherk III", 2014, Sjanger.ROMANCE, "Disney");

		this.filmarkiv.leggTilFilm(1);
		this.filmarkiv.leggTilFilm(2);
		this.filmarkiv.leggTilFilm(3);

		this.filmarkiv.leggTilFilm(tekstgr.lesFilm());

		System.out.println(this.filmarkiv.toString());
	
}


}
