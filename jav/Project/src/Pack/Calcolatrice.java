package Pack;
import java.util.Scanner;

public class Calcolatrice {
	final Scanner s = new Scanner (System.in);
	
	public void somma(){
		System.out.println("Java first calculator");
		
		while(true){
			int l, r;
			
			System.out.println("Primo operando: ");
			l = s.nextInt();
			
			System.out.println("Secondo operando: ");
			r = s.nextInt();
			
			int ans = l+r;
			
			System.out.println(ans);
		}
	}
	
	public static void main(String[] args) {
		Calcolatrice c = new Calcolatrice();
		c.somma();
	}
	
}
