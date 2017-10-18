package lock;

public class GattoTopo2018 {

	public static void main(String[] args) {

		final Striscia s = new Striscia();
		System.out.println("Start gatto e topo v.1");
		final Gatto tom = new Gatto(s);
		final Topo jerry = new Topo(s);
		final Display LG = new Display(s);
		LG.start();
		jerry.start();
		tom.start();
		

	}

}
