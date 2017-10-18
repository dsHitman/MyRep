package lock;

public class Topo extends Thread {
	
private final Striscia striscia;
	
	public Topo (final Striscia s){
		
		striscia = s;
	}
	
	public void run(){
		
		System.out.println("Avvio del topo");
		
		while(!striscia.muoviTopo()){
			
			striscia.muoviTopo();
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}
