package Basicos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	
		System.out.print("Qual o seu nome: ");
		String nome = entrada.nextLine();
		
		
		System.out.print("Qual o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		
		System.out.print("Qual a sua idade: ");
		int idade = entrada.nextInt();
		
		
		
		System.out.printf("SEU NOME É:%s%s\nSUA IDADE É:%s", nome,sobrenome,idade);
		
		entrada.close();
	}
}