public class Teste {

	public static void main(String[] args) {
   
		System.out.println("Inicio: main");
		Paralelismo[] p = new Paralelismo[10];
		for(int i=0; i < p.length; i++) {
			p[i] = new Paralelismo("T" + i);
			p[i].start();
		}
		System.out.println("Fim: main");
	}
}
