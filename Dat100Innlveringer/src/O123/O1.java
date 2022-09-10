package O123;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class O1 {

	public static void main(String[] args) {
		for (int trinn = 1; trinn <= 5; trinn++) {
		String inntektTxt = showInputDialog("Skriv inn inntekt ");
		int inntekt = parseInt(inntektTxt);
		String skatt = "Ugyldig beløp ";
			
		if (inntekt >= 0 && inntekt <= 190349) {
			skatt= "0%";
			showMessageDialog(null,"Skatten er " + skatt);
			
		} else if (inntekt >= 190350 && inntekt <= 267899) {
			skatt= "1,7%";
			showMessageDialog(null,"Skatten er " + skatt);
			
		} else if (inntekt >= 267900 && inntekt <= 643799) {
			skatt= "4%";
			showMessageDialog(null,"Skatten er " + skatt);
			
		} else if (inntekt >= 643800 && inntekt <= 969199) {
			skatt= "13,4%";
			showMessageDialog(null,"Skatten er " + skatt);
			
		} else if (inntekt >= 969200 && inntekt <= 1999999) {
			skatt= "16,4%";
			showMessageDialog(null,"Skatten er " + skatt);
			
		} else if (inntekt >= 2000000) {
			skatt= "17,4%";
			showMessageDialog(null,"Skatten er " + skatt);
			
		} else {
			showMessageDialog(null, skatt);
			while (inntekt <0 && inntekt > 2000000) {
				
			}
			
		
		}
		
	}
		
	}
	
}
			
		
		

	

