package application;

import java.util.Scanner;
import entities.SmartTv;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SmartTv smartTv = new SmartTv();

        int opcao;
        do {
            System.out.println("\n--- MENU SMART TV ---");
            System.out.println("1 - Ligar TV");
            System.out.println("2 - Desligar TV");
            System.out.println("3 - Aumentar Volume");
            System.out.println("4 - Diminuir Volume");
            System.out.println("5 - Aumentar Canal");
            System.out.println("6 - Diminuir Canal");
            System.out.println("7 - Mudar Canal");
            System.out.println("8 - Ver status da TV");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> smartTv.ligar();
                case 2 -> smartTv.desligar();
                case 3 -> smartTv.aumentarVolume();
                case 4 -> smartTv.diminuirVolume();
                case 5 -> smartTv.aumentarCanal();
                case 6 -> smartTv.diminuirCanal();
                case 7 -> {
                    System.out.print("Digite o número do canal: ");
                    int novoCanal = sc.nextInt();
                    smartTv.mudarCanal(novoCanal);
                }
                case 8 -> smartTv.statusTV();
                case 0 -> System.out.println("Encerrando programa.");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        sc.close();
    }
}
