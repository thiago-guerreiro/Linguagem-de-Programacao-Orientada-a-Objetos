import javax.swing.JOptionPane;

public class Funcionario extends Pessoa {
	Data dtAdmissao;
	double salario;

	Funcionario() {
		dtAdmissao = new Data();
		salario = Double.parseDouble(JOptionPane.showInputDialog("Sal�rio: "));
	}
	@Override
	public String toString() {
		return super.toString() + 
				 "\nDt. Admissao= " + dtAdmissao + ""
				+ "\nSal�rio= "     + salario ;
	}

}
