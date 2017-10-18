package lock;

public class Gatto extends Thread {
	
	private final Striscia striscia;
	
	public Gatto (final Striscia s){
		
		striscia = s;
	}
	
	public void run(){
		
		System.out.println("Avvio del gatto");
		
		while(!striscia.muoviGatto()){
			
			striscia.muoviGatto();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}
