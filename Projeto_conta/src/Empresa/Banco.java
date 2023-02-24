package Empresa;

public class Banco {

	public static void main(String[] args) {
		//contas adicionadas 
		Conta c1 = new Conta(123,"Tiao",1000,5000);
		Conta c2 = new Conta(321,"Ze",2000,3000);
		
		c2.sacar(2010);
		c2.deposito(10);
		c1.deposito(20);

		
		c2.info();
		c1.info();
	}

}
