package lock;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Striscia {
	
	public final int LUNG = 40;
	private final char striscia[] = new char [LUNG];
	
	private int topo, gatto, dirGatto;
	private boolean fine;
	Lock lock = new ReentrantLock();
	private boolean ciSonoModifiche;
	
	public Striscia(){
		
		fine = false;
		dirGatto = 1;
		ciSonoModifiche = true;
		topo = (int) (LUNG * Math.random());
		gatto = (int) (LUNG * Math.random());
		
		for (int i=0; i<LUNG; i++){
			striscia[i] = ' ';
		}
		
		striscia[topo] = '.';
		striscia[gatto] = '*';
		
	}
	
	public boolean getFine(){
		
		lock.lock();
		try{
			return fine;
		}
		finally{
			
			lock.unlock();
		}
	}
	
	public boolean muoviGatto(){
			
			lock.lock();
			
			
			
			try{
				
				if (fine){
					return fine;
				}
				
				striscia[gatto] = ' ';
				gatto += dirGatto;
				
				if(gatto == LUNG || gatto <0){
					
					dirGatto = -dirGatto;
					gatto += 2*dirGatto;
				}
				
				striscia[gatto]='*';
				
				ciSonoModifiche=true;
				if (gatto == topo){
					
					striscia[gatto] = '@';
					fine = true;
					return fine;
				}
				return fine;
			}
			finally{
				lock.unlock();
			}
			
			
		}
		
		public boolean muoviTopo(){
			
			lock.lock();
			try{
				
				if (fine){
					return fine;
				}
				
				final  int salto = new Random().nextInt(3) - 1;
				
				striscia[topo] = ' ';
				
				if (topo + salto >=0 && topo + salto < LUNG){
					topo = topo + salto;
				}
				
				striscia[topo] = '.';
				ciSonoModifiche=true;
				if (gatto == topo){
					
					fine = true;
					striscia[gatto] = '@';
					return fine;
				}
				return fine;
			}
			finally{
				
				lock.unlock();
				
			}
			
		}
		
		public boolean printStriscia(){
			lock.lock();
			try{
				if (ciSonoModifiche){
					System.out.print("|");
					System.out.print(striscia);
					System.out.print("|");
					System.out.print("\r");
					ciSonoModifiche=false;
				}
				return fine;
			}
			finally{
				lock.unlock();
			}
		}
	

}
