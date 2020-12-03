import javax.swing.JOptionPane;

public class Funcionario extends Pessoa {
	Data dtAdmissao;
	double salario;

	Funcionario() {
		dtAdmissao = new Data();
		salario = Double.parseDouble(JOptionPane.showInputDialog("Salário: "));
	}
	@Override
	public String toString() {
		return super.toString() + 
				 "\nDt. Admissao= " + dtAdmissao + ""
				+ "\nSalário= "     + salario ;
	}

}
