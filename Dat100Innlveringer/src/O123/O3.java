package O123;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O3 {

	public static void main(String[] args) {
		int n = parseInt(showInputDialog("Insert tall"));
		int tall = n;
		if (n<=0) {
			
		showMessageDialog(null,"Tallet er ikke gyldig ");
	} else {
		
		for(int i = n; i > 1; i--)
{
			tall = tall*(i - 1);
		}
showMessageDialog(null, n + "Fakultet: " + tall);

	}

}
}
