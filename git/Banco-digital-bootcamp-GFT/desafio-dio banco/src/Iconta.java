
public interface Iconta {
	 
	 void sacar( double valor);
	
	 void depositar(double valor);
	
	 void transferir(double valor, Conta ContaDestino);
	 
	 void imprimirExtrato();

}
// a interface nd mais � do que uma classe abstrata com todos os m�todos abstratas//
// a interface delega para que for implement�-la e o pr�prio Java faz isso//
//N fazer sentindo n�o ter um m�todo publico, prq todom�todo que est� numa interface � publico// 
// Retiro o public prq � uma redud�ncia//
//Quer dizer que � uma classe que vai obrigar a todo mundoque estender numa interface estender tudo o q ela tema.//
//uma classe pode ser abstrata por quest�o de estrat�gia, prq n�o quero que ninguem a instancie//
// Poliformismo � a capacidade de um objeto poder ser referenciadode de v�rias formas//
//Se aproveitando disso para n�o cirar c�digos repetitivos//
//mas ele n muda. O que faz � a forma de referenciar aquele objeto//