public class Exercicio {
    
    public static void main(String[] args) {
        
        ifFlecha();
        ifsemFlecha();
        ifFerias();
        ifMenor();


        switchSemana();
        switchNumero();
        switchFerias();
    }

    //Não Fazer...
    public static void ifFlecha() {
        int mes = 9;

        if (mes == 1 ){
            System.out.println("Janeiro");
        } else {
            if (mes == 2 ){
                System.out.println("Fevereiro");
            } else {
                if (mes == 3 ) {
                    System.out.println("Março");
                } else {
                    if (mes == 4 ) {
                        System.out.println("Abril");
                    } else {
                        if (mes == 5 ) {
                            System.out.println("Maio");
                        } else {
                            if (mes == 6 ) {
                                System.out.println("Junho");
                            } else {
                                if (mes == 7 ) {
                                    System.out.println("Julho");
                                } else {
                                    if (mes == 8) {
                                        System.out.println("Agosto");
                                    } else {
                                        if (mes == 9 ) {
                                            System.out.println("Setembro");
                                        } else {
                                            if (mes == 10 ) {
                                                System.out.println("Outubro");
                                            } else {
                                                if (mes == 11) {
                                                    System.out.println("Novembro");
                                                } else {
                                                    if (mes == 12 ) {
                                                        System.out.println("Dezembro");
                                                    } else {
                                                        System.out.println("Mês indefinido");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void ifsemFlecha() {

        int mes = 9;

        if (mes ==1){
            System.out.println("Janeiro");
        } else if (mes == 2){
            System.out.println("Fevereiro");
        } else if (mes == 3){
            System.out.println("Março");
        } else if (mes == 4){
            System.out.println("Abril");
        } else if (mes == 5){
            System.out.println("Maio");
        } else if (mes == 6){
            System.out.println("Junho");
        } else if (mes == 7){
            System.out.println("Julho");
        } else if (mes == 8){
            System.out.println("Agosto");
        } else if (mes == 9){
            System.out.println("Setembro");
        } else if (mes == 10){
            System.out.println("Outubro");
        } else if (mes == 11){
            System.out.println("Novembro");
        } else if (mes == 12){
            System.out.println("Dezembro");
        } else {
            System.out.println("Mês indefinido");
        }
        
    }

    //Não fazer
    public static void ifFerias() {
        String mes = "julho";


        if (mes == "julho" || mes == "dezembro" || mes == "janeiro") {
            System.out.println("Ferias");
        }
    }

    public static void ifMenor() {
        
        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;


        //Não fazer...
        if ((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)) {
            System.out.println("Funcionario deve receber auxilio");
        }

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;
        

        if ((salarioBaixo) && (muitosDependentes)) {
            System.out.println("Funcionario deve receber auxilio.");
        }

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);

        if(recebeAuxilio) {
            System.out.println("Funcionario deve receber auxilio");
        } else {
            System.out.println("Funcionario não deve receber auxilio");
        }
    }

    public static void switchSemana() {
        
        String dia = "Terça";

        switch (dia){
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;    
            case "Quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            case "Sabado":
                System.out.println(7);
                break;
            case "Domingo":
                System.out.println(1);
                break;
            default :
            System.out.println();
                System.out.println("Dia invalido");
                break;
        }
    }

    public static void switchNumero() {
        int numero = 4;

        switch(numero){
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4: 
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor indefinido");
                break;
        }
    }

    public static void switchFerias() {
        String mes = "março";

        switch (mes) {
            case "dezembro":
            case "julho":
            case "janeiro":
            System.out.println("Férias");
            break;
            default:
            System.out.println("Você ainda não está de Férias");
            break;
        }
        
    }
}
