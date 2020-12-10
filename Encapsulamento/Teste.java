public class Teste {

	public static void main(String[] args) {
		
		ContaCorrente c1 = new ContaCorrente("José","123");
		System.out.println(c1.toString());
		
		ContaCorrente c2 = new ContaCorrente("Maria","45678");
		System.out.println(c2.toString());
		
		c1.deposito(100);
		c1.tranferencia(100, c2);
	}
}
