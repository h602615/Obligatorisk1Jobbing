package no.hvl.data102;

import java.util.Objects;

public class Film {

	
	
	private int filmnr;
	private String filmskaper;
	private String Tittel;
	private int Aar;
	private String Filmselskap;

	public Film(int filmnr, String filmskaper, String Tittel, int Aar, String Filmselskap) {
		this.filmnr = filmnr;
		this.filmskaper = filmskaper;
		this.Tittel = Tittel;
		this.Aar = Aar;
		this.Filmselskap = Filmselskap;

	}

	public int getFilmnr() {
		return filmnr;
	}

	@Override
	public String toString() {
		return "Film [filmnr=" + filmnr + ", filmskaper=" + filmskaper + ", Tittel=" + Tittel + ", Aar=" + Aar
				+ ", Filmselskap=" + Filmselskap + "]";
	}

	public void setFilmnr(int filmnr) {
		this.filmnr = filmnr;
	}

	public String getFilmskaper() {
		return filmskaper;
	}

	public void setFilmskaper(String filmskaper) {
		this.filmskaper = filmskaper;
	}

	public String getTittel() {
		return Tittel;
	}

	public void setTittel(String tittel) {
		Tittel = tittel;
	}

	public int getAar() {
		return Aar;
	}

	public void setAar(int aar) {
		Aar = aar;
	}

	public String getFilmselskap() {
		return Filmselskap;
	}

	public void setFilmselskap(String filmselskap) {
		Filmselskap = filmselskap;
	}

	@Override
	public int hashCode() {
		return Objects.hash(filmnr);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Film other = (Film) obj;
		return filmnr == other.filmnr;
	}
	
	
	
	
	
	
	
	
	
	
}
