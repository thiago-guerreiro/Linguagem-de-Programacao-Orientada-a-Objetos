import javax.swing.JOptionPane;

public class Aluno extends Pessoa {
	String ra;
	int nrFaltas;
	Aluno() {
		ra       = JOptionPane.showInputDialog("RA: ");
		nrFaltas = Integer.parseInt(JOptionPane.showInputDialog("Nr. Faltas: "));
	}
	
	@Override 
	public String toString() {
		return super.toString() 
				+ "\nRA: "       + ra
				+ "\nNr. Faltas" + nrFaltas;
	}
}
