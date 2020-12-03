import javax.swing.JOptionPane;

public class Gerente extends Funcionario {
	String departamento;
	Data dtInicioGerencia;
	
	Gerente() {
		departamento     = JOptionPane.showInputDialog("Departamento: ");
		dtInicioGerencia = new Data();
	}

	@Override
	public String toString() {
		return super.toString() +
				  "\nDepartamento: "       + departamento
				+ "\nDt Inicio Gerencia: " + dtInicioGerencia;
	}
}
