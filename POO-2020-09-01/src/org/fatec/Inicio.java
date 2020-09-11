package org.fatec;

public class Inicio {

	public static void main(String[] args) {
		// tipo_da_variavel nome = valor;
		// Tipo_Classe (nome da classe) nome (referencia) = new Construtor (); esse é meu objeto
		// referencia é o mesmo que ponteiro
		// todo objeto é manipulado por uma referencia (ponteiro)
		// o ato de criar um objeto a partir de uma classe: instanciar
		
		Carro carrinho = new Carro("Chery", "Branco", 5);
		Carro carrinho3 = new Carro("Fiat", "Vermelho", 5);
		
		// criei um construtor não preciso mais declarar explicitamente
		/*
		carrinho.cor = "Branco";
		carrinho.modelo = "Chery";
		carrinho.quantidadeLugares = 5;
		
		System.out.println(carrinho.modelo + " " + carrinho.cor + " " + carrinho.quantidadeLugares);
		
		
		carrinho.imprimirDados();
		
		System.out.println(carrinho3.imprimirDados2());
		 */
		
		Carro carrinho2 = carrinho;
		
		carrinho2.cor = "Preto";
		carrinho2.quantidadeLugares = 10;
		carrinho2.imprimirDados();
		carrinho.imprimirDados();
		
		System.out.println(carrinho);
		
		Carro c = new Carro();
		
		System.out.println(c.modelo);
	}

}
