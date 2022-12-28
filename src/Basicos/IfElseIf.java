package EstruturaDeControle;

import java.util.Scanner;

public class IfElseIf {
	
	public static void main(String[] args) {
		
	 Scanner entrada = new Scanner(System.in);
		
	   System.out.println("digite o valor:");
	   double nota = entrada.nextDouble();
	   
	   if(nota > 10 || nota < 0) {
		   System.out.println("nota ok");
	   } else if (nota >= 8.1) {
		   System.out.println("a");}
	     else if (nota >= 7.1) {
		   System.out.println("b");}
	     else if (nota >= 6.1) {
			   System.out.println("c");}
		
		
		
		entrada.close();
	}

}
