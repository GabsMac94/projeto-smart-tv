package application;

import java.util.Scanner;

import entities.SmartTv;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SmartTv smartTv = new SmartTv();
		
		System.out.println("TV ligada? " + smartTv.ligada);


		System.out.println();
		smartTv.ligar();
		System.out.println("Novo status -> TV ligada? " + smartTv.ligada);
		System.out.println("Canal atual: "+smartTv.canal);
		System.out.println("Volume atual: "+ smartTv.volume);
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.aumentarVolume();
		smartTv.diminuirVolume();
		System.out.println();
		
		System.out.println("Digitando o canal: ");
		smartTv.mudarCanal(sc.nextInt());
		
		System.out.println();
		smartTv.desligar();
		System.out.println("Novo status -> TV ligada? " + smartTv.ligada);

	}

}
