import java.time.LocalDate;

public class SecretariaExecutiva extends Secretaria {

	public SecretariaExecutiva(String nome, String rg, LocalDate dtnascimento, String cpf, double salario) {
		super(nome, rg, dtnascimento, cpf, salario);
	}
   
	@Override
	public String toString() {
		return "\nSecretaria Executiva [CPF=" + cpf + ", Salario=" + salario + ", Nome=" + nome + ", RG=" + rg
				+ ", Dt. Nascimento=" + dtnascimento + ""
				+ ", Bonificação="    + getBonificacao() +"]";
	}
   
	@Override
	public double getBonificacao() {
		return this.salario * 2;
	}
}
