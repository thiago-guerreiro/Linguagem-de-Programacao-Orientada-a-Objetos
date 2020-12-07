import java.time.LocalDate;

public class Presidente extends Funcionario {
	SecretariaExecutiva secretaria;
   
	public Presidente(String nome, String rg, LocalDate dtnascimento, String cpf, double salario, SecretariaExecutiva secretaria) {
		super(nome, rg, dtnascimento, cpf, salario);
		this.secretaria = 
				new SecretariaExecutiva(
						secretaria.nome,
						secretaria.rg,
						secretaria.dtnascimento,
						secretaria.cpf,
						secretaria.salario
				);
	}
   
	@Override
	public String toString() {
		return "\nPresidente [CPF=" + cpf + ", Salario=" + salario + ", Nome=" + nome + ", RG=" + rg
				+ ", Dt. Nascimento=" + dtnascimento + ""
				+ ", Bonificação="    + getBonificacao() +"]" + secretaria.toString();
	}
   
	@Override
	public double getBonificacao() {
		return this.salario * 5;
	}
}
