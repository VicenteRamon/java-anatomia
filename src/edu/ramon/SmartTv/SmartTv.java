package edu.ramon.SmartTv;

public class SmartTv {
    
    boolean ligada = false;
    int canal = 1;
    int volume = 0;

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }

    public void trocarCanal(int canal) {
        this.canal = canal;
    }
}
