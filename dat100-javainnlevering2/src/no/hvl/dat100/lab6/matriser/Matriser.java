package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

for (int i = 0; i < matrise.length; i++) {
	for (int j = 0; j < matrise[i].length; j++) {
		System.out.println(matrise[i][j]);
	}
}

	}
	
	// b)
	public static String tilStreng(int[][] matrise) {
		String stringen1 = " ";

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				if (i == 2 && j==1 || i==3 && j==2) {
					stringen1 += "\n" + matrise[i][j];
				}
					else {
						stringen1 += matrise[i][j] +" ";
					
				}
			}
		}
		return stringen1;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] nymatrise = new int[matrise.length][matrise.length];

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				nymatrise[i][j] = matrise[i][j]*tall;
			}
		}

		return nymatrise;
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		boolean lik = true;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (lik == true && a[i][j] == b[i][j]) {
					lik = true;
				} else {
					lik = false;
				}
			}
		}
		return lik;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
