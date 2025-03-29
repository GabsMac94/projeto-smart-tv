package entities;

public class SmartTv {

    private boolean ligada = false;
    private int canal = 1;
    private int volume = 25;

    public void ligar() {
        if (!ligada) {
            ligada = true;
            System.out.println("Ligando dispositivo!");
        } else {
            System.out.println("A TV já está ligada.");
        }
    }

    public void desligar() {
        if (ligada) {
            ligada = false;
            System.out.println("Desligando dispositivo!");
        } else {
            System.out.println("A TV já está desligada.");
        }
    }

    public void aumentarVolume() {
        if (ligada && volume < 100) {
            volume++;
            System.out.println("Aumentando volume para: " + volume);
        } else {
            System.out.println("Volume no máximo ou TV desligada.");
        }
    }

    public void diminuirVolume() {
        if (ligada && volume > 0) {
            volume--;
            System.out.println("Diminuindo volume para: " + volume);
        } else {
            System.out.println("Volume no mínimo ou TV desligada.");
        }
    }

    public void aumentarCanal() {
        if (ligada) {
            canal++;
            System.out.println("Canal atual: " + canal);
        }
    }

    public void diminuirCanal() {
        if (ligada && canal > 1) {
            canal--;
            System.out.println("Canal atual: " + canal);
        }
    }

    public void mudarCanal(int novoCanal) {
        if (ligada && novoCanal > 0) {
            canal = novoCanal;
            System.out.println("Canal alterado para: " + canal);
        } else {
            System.out.println("Canal inválido ou TV desligada.");
        }
    }

    public void statusTV() {
        System.out.println("\n[ Status da TV ]");
        System.out.println("Ligada: " + ligada);
        System.out.println("Canal: " + canal);
        System.out.println("Volume: " + volume);
    }

    // Getters (caso queira acessar os valores diretamente)
    public boolean isLigada() {
        return ligada;
    }

    public int getCanal() {
        return canal;
    }

    public int getVolume() {
        return volume;
    }
}
