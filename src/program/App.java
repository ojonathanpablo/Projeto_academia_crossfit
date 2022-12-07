package program;

import java.util.Scanner;

/*
 * como ultilizaremos varios exercicios para não precisa meche em varias classes caso seja preciso inserir novos
 * exercicios vamos ultiliza o formato abstract factory 
 * */
public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual exercicio deseja realiza? 1-Corrida - 2-Musculação?");
		Byte opc = sc.nextByte();
		
		Modelo modelo = null;
		switch(opc) {
			case 1: modelo = new FabricaCorrida(); break;
			case 2 :modelo = new FabricaMusculacao();break;	
		}
		
		Treino treino = new Treino(modelo);
		treino.gerar();

		System.out.println("Musculação: "+treino.getMusculacao().toString());
		System.out.println("Corrida: "+treino.getCorrida().toString() );
	}
}
