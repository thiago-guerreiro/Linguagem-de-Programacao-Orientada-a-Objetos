import javax.swing.JOptionPane;

public abstract class Pessoa {
	String nome, identidade;
	Data dtNascimento;
	
	Pessoa() {
		nome         = JOptionPane.showInputDialog("Nome:");
		identidade   = JOptionPane.showInputDialog("Identidade:");
		dtNascimento = new Data();
	}
	@Override 
	public String toString() {
		return "Nome = "        + nome +
				"\nIdentidade = " + identidade +
				"\nDt. Nasc.  = " + dtNascimento;
	}
}
