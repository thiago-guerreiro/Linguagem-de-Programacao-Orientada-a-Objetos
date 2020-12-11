import javax.swing.JOptionPane;

public class TesteCalculo extends Calcular {
	//construtor
	public TesteCalculo(){
		try {
			int x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primero valor"));
			int y = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));
			Soma(x,y);
			Imprimir();
		}
		catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro.getMessage() + "\n" + erro.getStackTrace());
		}
	}
	// main
	public static void main(String[] args) {
		new TesteCalculo();
	}
	// métodos da interface
	@Override
	public void Subtracao     (int x, int y) { }
	@Override
	public void Multiplicacao (int x, int y) { }
	@Override
	public void Divisao       (float x, float y) { }
}
