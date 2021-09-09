package oblig1_dat100_h2021;

public class Oppgave_O3_fakultet {
	public static void main(String[] args) {
		System.out.println(fakultet(6));
		}

		public static int fakultet(int n) {
			if(n==1) {
				return 1;
		}
			else {
				return n*fakultet(n-1);
		}}}

