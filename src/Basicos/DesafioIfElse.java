package EstruturaDeControle;

import java.util.Scanner;

public class DesafioIfElse {

	public static void main(String[] args) {
		
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("digite o dia da semana");
	String semana = entrada.next();
	 if(semana.equalsIgnoreCase("Domingo")) {
		 System.out.println(1);
	 } else if (semana.equalsIgnoreCase("Sabado")) {
		 System.out.println(2);
	 } else if (semana.equalsIgnoreCase("Segunda")) {
		 System.out.println(3);
	 } else if (semana.equalsIgnoreCase("terça")) {
		 System.out.println(4);
	 } else if (semana.equalsIgnoreCase("Quarta")) {
		 System.out.println(5);
	 } else if (semana.equalsIgnoreCase("Quinta")) {
		 System.out.println(6);
	 } else if (semana.equalsIgnoreCase("Sabado")) {
		 System.out.println(7);
	 }
	
	}
}
