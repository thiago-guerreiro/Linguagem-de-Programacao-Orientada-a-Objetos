public class Casting {
  public static void main(String[] args) {
    /* casting feito implicitamente, pois o valor possui um
       tamanho menor que o tipo da variavel que irá recebê-lo. */
    char  a = 'a';
    int   b = 'b';
    float c = 100;

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    
    /* casting feito explicitamente, pois o valor possui um tamanho
       maior que o tipo da variavel que irá recebê-lo. */
    int   d = (int) 5.1987;
    float e  = (float) 5.000000000000000000000000000;
    int   f = (char) (a + 5);
    char  g = (char) 110.5;

    System.out.println(d);
    System.out.println(e);
    System.out.println(f);
    System.out.println(g);
  }
}