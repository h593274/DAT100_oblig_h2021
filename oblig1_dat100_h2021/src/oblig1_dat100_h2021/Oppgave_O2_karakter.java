package oblig1_dat100_h2021;
import static javax.swing.JOptionPane.*;

public class Oppgave_O2_karakter {
	public static void main(String[] args) {
		int k = 10;
		for (int i = 0; i <= k; i++) {

			double poeng = Double.parseDouble(showInputDialog("poengsum"));

			
			if (poeng >= 0 && poeng <= 39) {
				System.out.println("Karakter F");
			} else if (poeng >= 40 && poeng <= 49) {
				System.out.println("Karakter E");
			} else if (poeng >= 50 && poeng <= 59) {
				System.out.println("Karakter D");
			} else if (poeng >= 60 && poeng <= 79) {
				System.out.println("Karakter C");
			} else if (poeng >= 80 && poeng <= 89) {
				System.out.println("Karakter B");
			} else if (poeng >= 90 && poeng <= 100) {
				System.out.println("Karakter A");
			} else {
				showMessageDialog(null, "Poengsummen fra 0 til 100");
				k++;
			}
		}
	}
}
