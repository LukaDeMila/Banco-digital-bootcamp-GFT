
public class Main {
		public static void main(String[]args){
			Cliente Venilton =new Cliente();
			Venilton.setNome("Venilton");
			
			Conta cc= new ContaCorrente(Venilton);
			Conta poupança= new ContaPoupança(Venilton);
			
			cc.depositar(100);
			cc.transferir(100, poupança);
			
			cc.imprimirExtrato();
			poupança.imprimirExtrato();
}
}
