public class Banco {

	public static double valorEmprestimo(Funcionario func) {
		if (func instanceof Presidente) {
			return func.salario * 10;
		} else if (func instanceof Gerente) {
			return func.salario * 7;
		} else if (func instanceof Supervisor) {
			return func.salario * 5;
		}
		else {
			return func.salario * 2;
		}
	}
}
