import java.time.LocalDate;

public abstract class Pessoa {
    String nome, rg;
    LocalDate dtnascimento;

    public Pessoa(String nome, String rg, LocalDate dtnascimento){
        this.nome = nome;
        this.rg = rg;
        this.dtnascimento = dtnascimento;
    }

    public abstract String toString();
}
