package no.hvl.data102.klient;

import java.util.Scanner;

import javax.swing.JOptionPane;

import no.hvl.data102.Film;
import no.hvl.data102.Sjanger;
import no.hvl.data102.adt.FilmarkivADT;

public class Tekstgrensesnitt {

	public Film lesFilm() {

		Film K1 = new Film();
		boolean godtatt = false;
		while (!godtatt) {
			int nr = Integer.parseInt(JOptionPane.showInputDialog("Skriv filmnr: "));
			if (!filmarkiv.finnes(nr)) {
				K1.setFilmnr(nr);
				godtatt = true;
			} else {
				JOptionPane.showMessageDialog(null, "Filmnr er ugyldig.");
			}
		}
		godtatt = false;
		while (!godtatt) {
			String fs = JOptionPane.showInputDialog("Skriv Filmskaper: ");
			if (!fs.equals("")) {
				K1.setFilmskaper(fs);
				godtatt = true;
			} else {
				JOptionPane.showMessageDialog(null, "må tastes. ");
			}
		}
		godtatt = false;
		while (!godtatt) {
			String T = JOptionPane.showInputDialog("Skriv Tittel: ");
			if (!T.equals("")) {
				K1.setTittel(T);
				godtatt = true;
			} else {
				JOptionPane.showMessageDialog(null, "må tastes. ");
			}
		}
		godtatt = false;
		while (!godtatt) {
			int year = Integer.parseInt(JOptionPane.showInputDialog("Skriv år: "));
			if (year > 1900 && year < 2100) {
				K1.setAar(year);
				godtatt = true;
			} else {
				JOptionPane.showMessageDialog(null, "Året var ikke godtatt.");
			}
		}
		godtatt = false;
		Sjanger[] sjangre = Sjanger.values();
		int indeks = -1;
		while (!godtatt) {
			String sj = JOptionPane.showInputDialog("Skriv Sjanger: ");
			boolean eksisterer = false;
			for (int i = 0; i < sjangre.length; i++) {
				if (sjangre[i].toString().toUpperCase().equals(sj.toUpperCase())) {
					indeks = i;
					eksisterer = true;
				}
			}
			if (eksisterer) {
				K1.setSjanger(sjangre[indeks]);

				godtatt = true;
			} else {
				JOptionPane.showMessageDialog(null,
						"Finner ikke sjangeren " + sj + "\nHusk, sjangerene som finnes er: ");
				String s = "";
				for (int i = 0; i < sjangre.length; i++) {
					s += sjangre[i].toString() + "\n";
				}
				JOptionPane.showMessageDialog(null, s);
			}
		}
		godtatt = false;
		while (!godtatt) {
			String T = JOptionPane.showInputDialog("Skriv Filmselskap: ");
			if (!T.equals("")) {
				K1.setFilmselskap(T);
				godtatt = true;
			} else {
				JOptionPane.showMessageDialog(null, "må tastes. ");
			}
		}
		return K1;

	}

	public void visFilm(Film film, int nr) {

		int nr1 = film.getFilmnr();
		((FilmarkivADT) film).visFilm(nr1);

	}

	public void skrivUtFilmDelstrengITittel(FilmarkivADT filma, String delstreng) {

	}

	public void skrivUtFilmProdusent(FilmarkivADT filma, String delstreng) {

	}

	public void skrivUtStatistikk(FilmarkivADT filma) {

		System.out.println("Statikstik:" + filma.antall());

		for (Sjanger s : Sjanger.values()) {
			System.out.println(s.toString() + " : " + filma.antall(s));
		}
	}

}
