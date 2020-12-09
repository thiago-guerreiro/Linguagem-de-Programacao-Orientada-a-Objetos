public class Paralelismo extends Thread {
	String nome;
	Paralelismo(String nome) {
		super();
		this.nome = nome;
	}
   
	public void run(){
		System.out.println("Inicio: " + nome);
		for(int i = 1; i < 11; i++){
			System.out.println(i + " - " + nome );
		}
		System.out.println("Fim: " + nome);
	}
}

