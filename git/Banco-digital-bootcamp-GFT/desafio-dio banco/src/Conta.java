
public abstract class Conta implements Iconta{
	// quando a classe está como privado vc só pode ter acesso na classe em que foi criada//
	//para ter acesso na classe filha será necessário ter um modificador de acesso, seja um atributo ou um método nesse caso o protected//
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1; // é um classe que é constante e sequencial//
	

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
		// posso colocar =saldo no lugar de -=//
		
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta ContaDestino) {
		this.sacar(valor);
		ContaDestino.depositar(valor);
		
	}
	
	public int getAgencia() {
		return agencia;
}
	
	public int getNumero() {
		return numero;
}
	
	public double getSaldo() {
		return saldo;
}
	protected void imprimirInfoComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia:%d", this.agencia));
		System.out.println(String.format("numero:%d", this.numero));
		System.out.println(String.format("Saldo:%2.f", this.saldo));
	}

}

// vou deixar o meu private como procteted eu consigo encapsiular de forma mais adequada//
// private só o pai sabe//
// tudoo que for publico eu consigo acessar de qualquer lugar//
// o protected relação direta com herança( o filho pode acessar)//
// default vc só vai acessar no pacote em que foi definido enão fora dele//