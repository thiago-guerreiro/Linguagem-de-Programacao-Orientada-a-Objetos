public class TesteCastDown {
	public static void main (String args[]){
		Cliente c = new Cliente();
		// cast up de Cliente para Pessoa
		Pessoa p = c; 
		p.imprimir();
		// cast down de Pessoa para Cliente
		Cliente c2 = (Cliente) p; 
		c2.imprimir();
		// criacao de uma instancia da classe Pessoa
		Pessoa p2 = new Pessoa();
		p2.imprimir();
		// cast down inválido de Pessoa para Cliente
		Cliente c3 = (Cliente) p2; 
	}
} 