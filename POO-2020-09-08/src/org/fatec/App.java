package org.fatec;

public class App {

	public static void main(String[] args) {
		// tudo em java � heran�a de uma classe chamada Objeto
		// Object � fornecido por padr�o pela maquina virutal
		
//		Object c  = new Cliente("Gerson", "17-99736-0772");
		Cliente c  = new Cliente("Gerson", "17-99736-0772");
		
		// toda vez que se imprime a referencia de um objeto
		// implicitamente � chamado um m�todo de nome toString()
		
//		System.out.println(c.getNome());
//		System.out.println(c.telefone);
		
		System.out.println(c);

	}

}
