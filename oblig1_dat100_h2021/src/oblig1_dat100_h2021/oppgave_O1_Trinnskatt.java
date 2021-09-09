package oblig1_dat100_h2021;
import javax.swing.JOptionPane;
public class oppgave_O1_Trinnskatt {

	public static void main(String[] args) {
		String lonn = JOptionPane.showInputDialog("skriv bruttolønn");
		double inntekt = Double.parseDouble(lonn);
		double trinnskatt = 0;
		double toppskatt = 164100;
		double toppskatt1 = 230950;
		double toppskatt2 = 580650;
		double toppskatt3 = 934051;

		if (inntekt <= toppskatt1) {
			System.out.println("Din trinnskatt er på " + trinnskatt + " kr");
		} else if (inntekt < toppskatt1 && inntekt > toppskatt) {
			trinnskatt = inntekt * 0.0093;
			System.out.println("Din trinnskatt er på " + trinnskatt + " kr");
		} else if (inntekt < toppskatt2 && inntekt > toppskatt1) {
			trinnskatt = inntekt * 0.0241;
			System.out.println("Din trinnskatt er på " + trinnskatt + " kr");
		} else if (inntekt < toppskatt3 && inntekt > toppskatt2) {
			trinnskatt = inntekt * 0.1152;
			System.out.println("Din trinnskatt er på " + trinnskatt + " kr");
		} else if (inntekt > toppskatt3) {
			trinnskatt = inntekt * 0.1452;
			System.out.println("Din trinnskatt er på " + trinnskatt + " kr");
		}
	}
}

