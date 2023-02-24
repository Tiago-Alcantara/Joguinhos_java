package Empresa;

public class Conta {
	int numero;
	String titular;
	float saldo;
	float limite;
	float saque;
	float deposito;
	float dep;
	
	Conta(int numero,String titular,float saldo,float limite){
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limite = limite;
		
	};
	//void para sacar com suas regras
	 void sacar(float saque){
		 this.saque = saque;
		 float total = saldo + limite;
				 
				 
		 if(saque - total >= 0) {
			System.out.println("Voce Nao tem saldo disponivel para sacar"); 
		 }else if(saque - total  <= 0 ) {
			System.out.println("Saque concluido");
			float restante = total - saque;
				if(saque > saldo) {
					float ret_limite = saque - saldo;
					System.out.printf("O saque passou do saldo e foi usado isso do seu Limite: "+ ret_limite);
					limite  = limite - ret_limite;  
					saldo = 0;
				}else{
					float sobra_saldo = saldo - saque;
					System.out.printf("Sobrou: $%.2f de saldo na conta",sobra_saldo);
					saldo = sobra_saldo;
				};
			System.out.println("\nValor restante: " + restante);
		 };
		
		
	};
	//void de deposito
	void deposito(float deposito) {
		this.deposito = deposito;
		 dep = deposito;
		saldo = saldo + deposito; 
	};
	
			
	//void para imprimir informaçoes na tela
	void info(){
		System.out.printf("\n-------------Informaçoes gerais da conta----------------\n");
		System.out.printf("As informacoes da conta do: %s\nDo numero: %d\nTem de saldo: $%.2f\n Tem limite de: $%.2f ",titular, numero,saldo,limite);
		System.out.printf("\n----------Finalizando o Progama---------------------\n");
		
	};
	
	
};
