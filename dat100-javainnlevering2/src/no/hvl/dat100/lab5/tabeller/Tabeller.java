package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for(int i =0;i<tabell.length;i++){
			System.out.println(tabell[i]);
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String stringen = ("[");

		for (int i = 0; i < tabell.length; i++) {
			if (i != tabell.length - 1) {
				stringen += tabell[i] + ",";
			} else {
				stringen += tabell[i];
			}
		}
		stringen += ("]");
		return stringen;
	
	}

	// c)
	public static int summer(int[] tabell) {
//
	//	int sum = 0;
	//for (int i = 0; i < tabell.length; i++) {
		//	sum += tabell[i];
		//}
		//return sum;
		
		int i = 0;
		int sum = 0;
	while(i<tabell.length) {
	sum = sum + tabell[i];
			
	i++;
	}
	return sum;	
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean finnes = false;
		
		for (int i = 0; i <= tabell.length-1; i++) {
			if (tabell[i] == tall) {
				finnes = true;
				break;
			} 
			
			else {
				finnes = false;
			}
		}
		return finnes;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
int i = 0;
	while(i!=tabell.length) 
		
		do {
		if(tall == tabell[i]) {
			return tall;
		}
		else {
			return -1;
		}
		}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] reverser = new int[tabell.length];
int k =0;
		for (int i = tabell.length-1;i>=0 ; i--) {
			
			reverser[k] = tabell[i];
		k++;	
		}
		return reverser;
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {
boolean sortet = true;
		
		for(int i = 0;i<tabell.length-1;i++) {
			if(tabell[i]>tabell[i+1]) {
				sortet = false;
			}
			else { sortet = true;}
		}	
	
		return sortet;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int z = 0;
		int[] sammensett = new int[tabell1.length + tabell2.length];
		for (int i = 0; i < tabell1.length; i++) {
			sammensett[i] = tabell1[i];
			z++;
		}
		for (int k = 0; k < tabell2.length; k++) {
			sammensett[z] = tabell2[k];
		}
		return sammensett;
	}
}
