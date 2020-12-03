public class Banco {
	
	public static double valorEmprestimo(Pessoa p) {
		double valor=0;
		if (p instanceof Gerente) {
			valor = ((Gerente) p).salario * 5;
		} else if (p instanceof Funcionario) {
			valor = ((Funcionario) p).salario * 2.5;
		} else if (p instanceof Professor) {
			valor = 5000;
		} else if (p instanceof Aluno){
			valor = 2500;
		} 
		return valor;
	}

}
