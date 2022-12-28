package Operadores;

public class ConversaoTipos {
	public static void main(String[] args) {
		
		
		double a =  1;    //1.12345678910111213; // implicita 
		System.out.println(a);
		float b =  (float) 1.12345678999999;  //99999 é cast // explicita
		System.out.println(b);
		
		int c = 4;  
		byte d = (byte) c;  // byte é 127 
		System.out.println(d);
		
		
		
		
		
		
		
	}

}
