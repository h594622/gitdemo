package innlevering2;


import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave5 {

	public static void main(String[] args) {
	
		
		final int ANTALL = 10;
		String melding = "Student";
		for (int i = 1; i<=ANTALL; i++)  {
		
			
			int tallKarakter = parseInt(showInputDialog(melding + " " + i + " Tallkarakter : "));
			String karakter = tallKarakter + " tilsvarer: ";
		
			
			if (tallKarakter >= 90 && tallKarakter <= 100) karakter += "A";
			else if (tallKarakter >= 80 && tallKarakter <= 89) karakter += "B";
			else if (tallKarakter >= 60 && tallKarakter <= 79) karakter += "C";
			else if (tallKarakter >= 50 && tallKarakter <= 59) karakter += "D";
			else if (tallKarakter >= 40 && tallKarakter <= 49) karakter += "E";
			else if (tallKarakter >= 0 && tallKarakter <= 39) karakter += "E";
			else karakter += "Ugyldig karakter!";
		
		showMessageDialog(null, karakter);
		
		}
	
	}

}
