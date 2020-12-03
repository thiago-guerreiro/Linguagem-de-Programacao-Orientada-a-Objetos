
public class Teste {

	public static void main(String[] args) {

		Pessoa a01  = new Aluno();
		Pessoa ger1 = new Gerente();
		System.out.println(ger1.toString());

		System.out.println("Vl. Emprestimo Aluno:"   + Banco.valorEmprestimo(a01));
		System.out.println("Vl. Emprestimo Gerente:" + Banco.valorEmprestimo(ger1));
	}
}