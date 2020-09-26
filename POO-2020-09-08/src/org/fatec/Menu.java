package org.fatec;

public class Menu {
	// static é um modificador de comportamento
	// todo metodo static pode ser executado diretamente pela classe,
	// sem precisar de um objeto
	public static void mostrarMenu() {
		System.out.println("#### Menu ####");
		System.out.println("1 - Cadastrar cliente");
		System.out.println("2 - Editar cliente");
		System.out.println("3 - Excluir cliente");
		System.out.println("4 - Listar clientes");
		System.out.println("5 - Salvar");
		System.out.println("6 - Recuperar clientes");
		System.out.println("0 - Sair");
	}

}
