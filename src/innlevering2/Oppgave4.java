package innlevering2;

import static javax.swing.JOptionPane.*;
import static java.lang.Double.*;

public class Oppgave4 {

	public static void main(String[] args) {
	
		String inntektTxt = showInputDialog ("Inntekt : ");
		double inntekt = parseDouble(inntektTxt);
		
		String skatt = "En inntekt på " + inntekt + " skal betale en trinnskatt på ";
	
		if (inntekt >= 934051) skatt += "kr " + (inntekt*14.52)/100.0;
		else if (inntekt <= 934050 && inntekt >= 580651) skatt += "kr " + (inntekt*11.52)/100.0;
		else if (inntekt <= 580650 && inntekt >= 230951) skatt += "kr " + (inntekt*2.41)/100.0;
		else if (inntekt <= 230950 && inntekt >= 164101) skatt += "kr " + (inntekt*0.93)/100.0;
		else if (inntekt <= 164100) skatt += "kr " + (inntekt*0.00)/100.0;
		else skatt += "Ugyldig inntekt";
		
		
		showMessageDialog(null, skatt);
	}

}