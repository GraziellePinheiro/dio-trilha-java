

public class SmartTV {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal = canal + 1;
    }

    public void diminuirCanal(){
        canal = canal - 1;
    }

    public void aumentarVolume(){
        volume = volume + 1;
        System.out.println("Aumentando o volume para : " + volume);
        //volume++;
    }

    public void diminuirVolume(){
        volume = volume - 1;
        //volume--;
        System.out.println("Diminuindo o volume para : " + volume);
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }
}