package O123;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class O2 {

	public static void main(String[] args) {
		for (int studenter = 1; studenter <=10; studenter++) {
		String scoreTxt = showInputDialog(" Oppgi score ");
		int score = parseInt(scoreTxt);
		String resultat = "Ugyldig score ";
		
		if (score >=0 && score <=39) {
			resultat= "F";
			showMessageDialog(null,"Resultatet er " + resultat);
			
		} else if (score >= 40 && score <= 49) {
			resultat= "E";
			showMessageDialog(null,"Resultatet er " + resultat);
			
		} else if (score >=50 && score <= 59) {
			resultat= "D";
			showMessageDialog(null,"Resultatet er " + resultat);
			
		} else if (score >= 60 && score <= 79) {
			resultat= "C";
			showMessageDialog(null,"Resultatet er " + resultat);
			
		} else if (score >= 80 && score <= 89) {
			resultat= "B";
			showMessageDialog(null,"Resultatet er " + resultat);
			
		} else if (score >= 90 && score <= 100) {
			resultat= "A";
			showMessageDialog(null,"Resultatet er " + resultat);
			
		} else {
			showMessageDialog(null, resultat);
			while (score < 0 && score > 100) {
				
			}
			
		}
		}

	}

}
