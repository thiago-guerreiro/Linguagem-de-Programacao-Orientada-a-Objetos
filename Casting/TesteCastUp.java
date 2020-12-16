public class TesteCastUp {
   public static void main (String args[]){         
      Cliente c = new Cliente();
      // cast up explicito do objeto da classe Cliente para a classe Pessoa
      Pessoa p = (Pessoa) c;
      p.imprimir();
      // cast up do objeto da classe Cliente para a classe Pessoa
      Pessoa p2 = c;
      p2.imprimir();
      // cast up do objeto da classe Cliente para Pessoa
      Pessoa p3 = new Cliente();
      p3.imprimir();
      // cast up explicito do objeto da classe Cliente para a classe Object
      Object o = (Object) c;
      // cast up do objeto da classe Cliente para a classe Object
      Object o2 = c;  
   }
}