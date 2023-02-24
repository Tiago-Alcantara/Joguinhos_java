import java.util.Scanner;

public class Empresa {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite quantos soldados leonidas ira batalhar: ");
		
		int palp = teclado.nextInt();
		int inimigo = 10000;
		int x = 0  ;
		String msg;
		
		
		while(x == 0){
			
			//msg = palp>inimigo?"Um pouco menos...":"um pouco mais...";
			//System.out.println(msg);
			
			if (palp < inimigo) {
				System.out.println("HUmmm ... um pouquinho mais");
				
			} else if (palp >inimigo) {
				System.out.println("Quase Porém um poquinho menos");
				
				x = 1;
						
			} else if (palp == inimigo) {
				System.out.println("Acertou guerreiro Parabens");
				x = 1;
			}
			System.out.println("Digite quantos soldados leonidas ira batalhar: ");
			palp = teclado.nextInt();	
		};
	 System.out.println("Parabens vc acertou");
		

	};
}
