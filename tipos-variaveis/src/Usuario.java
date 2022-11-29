

public class Usuario {
    

    public static void main(String[] args) throws Exception {

        System.out.println("Olá, fui executado pelo terminal!");
        
        SmartTV smartTV = new SmartTV();

        System.out.println("A TV está ligada? " + smartTV.ligada);
        System.out.println("Qual volume da TV? " + smartTV.volume);
        System.out.println("Em que canal se encontra? " + smartTV.canal);

        smartTV.ligar();
        System.out.println("Novo status : A TV está ligada? " + smartTV.ligada);

        smartTV.desligar();
        System.out.println("Novo status : A TV está ligada? " + smartTV.ligada);

        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.diminuirVolume();
        smartTV.mudarCanal(28);

        System.out.println(smartTV.volume);
        System.out.println("Canal atual ? " + smartTV.canal);
    }
}
