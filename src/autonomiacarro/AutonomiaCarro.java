package autonomiacarro;

import java.util.Scanner;

/*
Escreva um programa em Java que calcula quantos km/l seu carro está fazendo.
*/
public class AutonomiaCarro {

    public static void main(String[] args) {
        double km, litros, autonomia;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Kilometros Percorridos:");
        km = leitor.nextDouble();
        System.out.println("Litros de Combustivel Abastecido:");
        litros = leitor.nextDouble();
        
        autonomia = km/litros;
        
        System.out.println("O Seu Carro tem uma Autonomia de " + autonomia + " km/l");
    }
    
}
