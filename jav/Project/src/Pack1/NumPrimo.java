package Pack1;
import java.util.Scanner;

public class NumPrimo {
	
	public boolean isPrimo (int i){
		
		
		boolean primo = true;
		
		for (int i1 = 2; i1 < i; i1++){
			if (i%i1 == 0)
				primo = false;
		}
		
		return (primo);
	}
	
	int nsimoNumeroPrimo(int n){
		int cont = 0, i = 2;
		while(true){
			if (isPrimo(i))
				cont++;
			if (cont == n)
				break;
			i++;
		}
		
		return i;
	}
	
	public static void main(String[] args) {
		NumPrimo c = new NumPrimo();
		System.out.println("inserisci il numero");
		final Scanner s = new Scanner (System.in);
		int n;
		n= s.nextInt();
		
		if (c.isPrimo(n))
			System.out.println("Primo");
		else
			System.out.println("non primo");
		
		System.out.println(n+ "esimo numero primo è "+ c.nsimoNumeroPrimo(n));
		
	}

}
