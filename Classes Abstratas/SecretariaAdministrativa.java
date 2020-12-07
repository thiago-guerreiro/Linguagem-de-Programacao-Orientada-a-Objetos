import java.time.LocalDate;

public class SecretariaAdministrativa extends Secretaria {

	public SecretariaAdministrativa(String nome, String rg, LocalDate dtnascimento, String cpf, double salario) {
		super(nome, rg, dtnascimento, cpf, salario);
	}
   
	@Override
	public String toString() {
		return "\nSecretaria Administrativa [CPF=" + cpf + ", Salario=" + salario + ", Nome=" + nome + ", RG=" + rg
				+ ", Dt. Nascimento=" + dtnascimento + ""
				+ ", Bonificação="    + getBonificacao() +"]";
	}
   
	@Override
	public double getBonificacao() {
		return this.salario * 1.5;
	}
}
