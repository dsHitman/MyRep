package lock;

public class Display extends Thread{
	
	private final Striscia striscia;
	
	public Display(final Striscia s){
		
		striscia = s;
	}
	
	public void run(){
		
		System.out.println("Avvio del display");
		
		while(!striscia.printStriscia()){
			
			try {
				striscia.printStriscia();
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
