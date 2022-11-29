public class Tipos_Variaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;
        int numero = 5;
        boolean variavel = true;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

       
        
        System.out.println(numero);

        final double VALOR_DE_PI = 3.14;
        
        variavel = !variavel;

        numero = numero + 1;

        System.out.println(++ numero);
        System.out.println(numero);
        System.out.println(!variavel);
    }
}
