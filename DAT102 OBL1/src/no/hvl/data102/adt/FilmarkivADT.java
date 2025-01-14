package no.hvl.data102.adt;

import no.hvl.data102.Film;
import no.hvl.data102.LinearNode;
import no.hvl.data102.Sjanger;

public interface FilmarkivADT {
	

	
	
	/**
	 * Viser en film
	 * @param nr nummer p� film som skal vises. Om nummeret ikke finnes, skrives en feilmelding
	 */
	
	void visFilm(int nr);
	/**
	 * Legger til en ny film.
	 * @param nyFilm
	 */
    void leggTilFilm(Film nyFilm);
    
    
    /**
     * Sletter en film med gitt nt 
     * @param filmnr nr p� film som skal slettes 
     * @return true dersom film ble slettet , false ellers
     */
    boolean slettFilm(int filmnr);
    
   /**
    * S�ker og henter Filmer med en gitt delstreng i tittelen.
    * @param delstreng som m� v�re i tittel
    * @return tabell med filmer som har delstreng i tittel
    
    */
    Film[] soekTittel(String delstreng);
   /**
    * Finner antall filmer med gitt sjanger
    * @param sjanger 
    * @return antall filmer av gitt sjanger 
    */
    int antall(Sjanger sjanger);
    /**
     * 
     * @return antall filmer i arkivet
     */
    int antall();
	boolean soekFilmprodusent(String delstreng);
	boolean finnes(int nr);
    
}
    

