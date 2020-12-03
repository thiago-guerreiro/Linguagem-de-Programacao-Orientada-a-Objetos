import javax.swing.JOptionPane;

public class Professor extends Pessoa{
	String codigo;
	
	Professor() {
		codigo = JOptionPane.showInputDialog("Codigo Professor: ");
	}
	
	@Override 
	public String toString() {
		return super.toString() + "\nCodigo Professor:" + codigo;
	}

}
