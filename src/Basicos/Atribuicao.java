package Operadores.ModuloUm.copy;

public class Atribuicao {
	
public static void main(String[] args) {
	
	
	int a =3;
	int b = a;
	int c = a + b;
	
	c += b; // c = c + b;
	c -= a; // c = c - a;
	c *= b; // c = c * b;
	c /= a; // c = c / a;
	
	c++; // +1 --c é -1 agora c-- é c -1.
	--c; // -1 mas leva em concideração a ordem de precedencia  
	
	System.out.println(++a == b--);
	
	System.out.println(c);
	
	c %= 2; // c = c % 2; 0 ou 1 
	System.out.println(c);
	
	
	
	
	
}
}
