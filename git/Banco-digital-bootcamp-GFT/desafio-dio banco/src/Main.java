
public class Main {
		public static void main(String[]args){
			Cliente Venilton =new Cliente();
			Venilton.setNome("Venilton");
			
			Conta cc= new ContaCorrente(Venilton);
			Conta poupan�a= new ContaPoupan�a(Venilton);
			
			cc.depositar(100);
			cc.transferir(100, poupan�a);
			
			cc.imprimirExtrato();
			poupan�a.imprimirExtrato();
}
}
