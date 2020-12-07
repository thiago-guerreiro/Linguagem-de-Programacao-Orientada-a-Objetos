import java.time.LocalDate;

public class Teste {
	public static void main(String[] args) {
		SecretariaExecutiva sx01 = new SecretariaExecutiva("Ana","1",LocalDate.of(1989, 1, 15), "2", 5782.32);
		System.out.println(sx01);
		
		SecretariaAdministrativa sa01 = new SecretariaAdministrativa("Julia","2",LocalDate.of(1994, 7, 21), "3", 4982.53);
		System.out.println(sa01);

		Presidente p01 = new Presidente("João","32",LocalDate.of(1970, 10, 28),"322", 20871.78, sx01);
		System.out.println(p01);
		System.out.println("Emprestimo para Presidente: "+ Banco.valorEmprestimo(p01));

		Gerente g01 = new Gerente("Maria","123",LocalDate.of(1975, 8, 26),"871", 15989.21, sa01);
		System.out.println(g01);
		System.out.println("Emprestimo para Gerente: "+ Banco.valorEmprestimo(g01));
		
		Supervisor s01 = new Supervisor("Antonio","998",LocalDate.of(1983, 4, 13),"776", 10321.47, sa01);
		System.out.println(s01);
		System.out.println("Emprestimo para Supervisor: "+ Banco.valorEmprestimo(s01));
	}
}
