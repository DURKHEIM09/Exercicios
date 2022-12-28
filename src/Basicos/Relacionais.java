package Operadores.ModuloUm.copy;

public class Relacionais {
	
	public static void main(String[] args) {
		System.out.println();
		
		int a = 97;
		int b = 'a';
		
	    System.out.println(a == b);
		System.out.println(3 > 4);
		System.out.println(3 >= 3);
		System.out.println(3 < 7);
		System.out.println(30 <= 7);
		System.out.println(30 != 7);
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >=7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("tem desconto?" + temDesconto);
		
		
		
	}

}
