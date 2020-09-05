package innlevering2;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave4 {

	public static void main(String[] args) {
		String inntektTxt = showInputDialog ("Inntekt : ");
		int inntekt = parseInt(inntektTxt);
		String skatt = "En inntekt på " + inntekt + " ligger på skattetrinn ";
		
		if (inntekt <= 934051) skatt += "4, som tilsvarer 14,52%";
		else if (inntekt <= 934050 && inntekt >= 580651) skatt += "3, som tilsvarer 11,52%";
		else if (inntekt <= 580650 && inntekt >= 230951) skatt += "2, som tilsvarer 2,41%";
		else if (inntekt <= 230950 && inntekt >= 164101) skatt += "1, som tilsvarer 0,93%";
		else if (inntekt <= 164100) skatt += "0, som tilsvarer 0,00%";
		else skatt += "Ugyldig inntekt";

		showMessageDialog(null, skatt);
	}

}