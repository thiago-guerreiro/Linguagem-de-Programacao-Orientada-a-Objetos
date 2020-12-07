import java.time.LocalDate;

public class Supervisor extends Gerente {
	public Supervisor(String nome, String rg, LocalDate dtnascimento, String cpf, double salario, SecretariaAdministrativa secretaria) {
		super(nome, rg, dtnascimento, cpf, salario, secretaria);
	}
   
	@Override
	public String toString() {
		return "\nSupervisor [CPF=" + cpf + ", Salario=" + salario + ", Nome=" + nome + ", RG=" + rg
				+ ", Dt. Nascimento=" + dtnascimento + ""
				+ ", Bonificação="    + getBonificacao() +"]" + secretaria.toString();
	}
}
