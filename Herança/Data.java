import javax.swing.JOptionPane;

public class Data {
	public int dia, mes, ano;
	
	public Data() {
		dia = Integer.parseInt(JOptionPane.showInputDialog("Dia: "));
		mes = Integer.parseInt(JOptionPane.showInputDialog("Mês: "));
		ano = Integer.parseInt(JOptionPane.showInputDialog("Ano: "));
	}
	
	public String toString() {
		return dia +"/" + mes +"/" +ano;
	}
}
