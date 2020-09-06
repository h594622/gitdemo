package innlevering2;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class Oppgave6 {

	public static void main(String[] args) {
		
		
		int sum = 1;
		int n = parseInt(showInputDialog ("Gi et tall : "));
		int antall = 1;
		while (antall <= n) {
			sum *= antall;
			antall++;
		}
		
		showMessageDialog(null, n + "! " + " = " + sum);
		
	}
	
}