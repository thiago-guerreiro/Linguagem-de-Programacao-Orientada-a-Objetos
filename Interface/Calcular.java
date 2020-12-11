public abstract class Calcular implements CalculoMatematico{
	private int resultado;
   
	public void Soma (int x, int y){
		resultado = x + y;
	}
   
	@Override
	public void Imprimir(){
		System.out.println("O resultado da soma é: " + resultado);
	}
}