package empresa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int megasena []= {10,20,30,50,55};
		ArrayList<String> listaNomes = new ArrayList<String>();
		//array
		//primitivas : int float double char 
		// ArrayList<Integer> MegaSena = new ArrayList<Integer>();
		 System.out.println("Digite a quantidade de nomes: ");
		 int qtd= teclado.nextInt();
		 String nome;
		 
		 for (int i =0 ; i<qtd; i++) {
			 nome = teclado.next();
			 listaNomes.add(nome);
		 }
		 
		 /*for(int i = listaNomes.size()-1 ; i>= 0  ; i-- ) {
			 System.out.println(listaNomes.get(i));
		}*/
		 System.out.println("ordem normal");
		 System.out.println(listaNomes);
		 


		 Collections.reverse(listaNomes);
		 
		 System.out.println("ordem reversa");
		 System.out.println(listaNomes);
	}

}
