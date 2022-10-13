package Basicos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	
	public static void main(String[] args) {
		
		String a = JOptionPane.showInputDialog("DIGITE");
		String b = JOptionPane.showInputDialog("DIGITE");
		
		System.out.println(a + b);
		
		double aa = Double.parseDouble(a); // comversao de string para numero 
		double bb = Double.parseDouble(b);
		
		double soma = aa + bb;
		
	    System.out.printf("SOMA É:%s", soma); 
	    System.out.printf("MEDIA É:%s", soma / 2);
		
		
	}

}
