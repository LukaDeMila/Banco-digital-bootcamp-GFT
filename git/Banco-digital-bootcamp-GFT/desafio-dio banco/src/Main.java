
public class Main {
		public static void main(String[]args){
			Cliente Venilton =new Cliente();
			Venilton.setNome("Venilton");
			
			Conta cc= new ContaCorrente(Venilton);
			Conta poupanša= new ContaPoupanša(Venilton);
			
			cc.depositar(100);
			cc.transferir(100, poupanša);
			
			cc.imprimirExtrato();
			poupanša.imprimirExtrato();
}
}
