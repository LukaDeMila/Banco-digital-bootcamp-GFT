
public interface Iconta {
	 
	 void sacar( double valor);
	
	 void depositar(double valor);
	
	 void transferir(double valor, Conta ContaDestino);
	 
	 void imprimirExtrato();

}
// a interface nd mais é do que uma classe abstrata com todos os métodos abstratas//
// a interface delega para que for implementá-la e o próprio Java faz isso//
//N fazer sentindo não ter um método publico, prq todométodo que está numa interface é publico// 
// Retiro o public prq é uma redudância//
//Quer dizer que é uma classe que vai obrigar a todo mundoque estender numa interface estender tudo o q ela tema.//
//uma classe pode ser abstrata por questão de estratégia, prq não quero que ninguem a instancie//
// Poliformismo é a capacidade de um objeto poder ser referenciadode de várias formas//
//Se aproveitando disso para não cirar códigos repetitivos//
//mas ele n muda. O que faz é a forma de referenciar aquele objeto//