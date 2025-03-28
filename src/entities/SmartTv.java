package entities;

public class SmartTv {
	
	public boolean ligada = false;
	public int canal = 1;
	public int volume = 25;
	
	
	public void ligar() {
		System.out.println("Ligando dispositivo!");
		ligada = true;
	}
	
	public void aumentarVolume() {
		volume++;
		System.out.println("Aumentando volume para: "+volume);
		
	}
	
	public void diminuirVolume() {
		volume--;
		System.out.println("Diminuindo volume para: "+volume);

	}
	
	public void aumentarCanal() {
		canal++;
	}
	
	public void diminuirCanal() {
		canal--;
	}
	
	public void mudarCanal(int novoCanal) {
		canal = novoCanal;
		System.out.println("Canal atual: " + canal);
	}
	
	
	public void desligar() {
		System.out.println("Desligando dispositivo!");
		ligada = false;
	}
	
	
	
}
