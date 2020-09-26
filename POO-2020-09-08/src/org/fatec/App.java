package org.fatec;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class App {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		// tudo em java � heran�a de uma classe chamada Objeto
		// Object � fornecido por padr�o pela maquina virutal

//		Object c  = new Cliente("Gerson", "17-99736-0772");
//		Cliente c  = new Cliente("Gerson", "17-99736-0772");

		// toda vez que se imprime a referencia de um objeto
		// implicitamente � chamado um m�todo de nome toString()

//		System.out.println(c.getNome());
//		System.out.println(c.telefone);

//		System.out.println(c);

//		Cliente c = new Cliente("Diego", "12-12233-4667");
//		System.out.println(c);
//		c = null;
//		System.gc();

		// caminho para onde eu vou salvar o cadastros de clientes
		String caminho = "D:\\OneDrive - Etec Centro Paula Souza\\�rea de Trabalho"
				+ "\\3sem\\github\\POO\\POO-2020-09-15\\bin\\org\\fatec\\cadastros.ser";
		
		// iniciando o controle para receber as informa��es pelo teclado
		Controle controle = new Controle();
		
		// lista para armazenar todos os cadastros de cada cliente
		List<Cliente> cadastros = new ArrayList<>();
		
		// vari�vel de controle para sair do sistema quando escolhido
		int escolha = 0;
		
		// estrutura de repeti��o que ir� manter o sistema ativo,
		// enquanto for desejado
		while (escolha != 7) {
			Menu.mostrarMenu();
			escolha = controle.opcao();
			
			// se a op��o digitada for 1, o usu�rio escolheu
			// cadastrar um cliente
			if (escolha == 1) {
				Cliente c = new Cliente();
				System.out.printf("Por favor insira o nome do cliente:\n");
				c.nome = controle.texto();
				System.out.printf("Por favor insira o telefone:\n");
				c.telefone = controle.texto();
				cadastros.add(c);
			}
			
			// se a op��o for 4, a escolha foi listar a lista com todos os
			// clientes
			if (escolha == 4) {
				// expressao lambda
				cadastros.forEach(pessoa -> System.out.println(pessoa));
				if (cadastros.isEmpty()) {
					System.out.println("N�o h� cadastros :(");
				}
			}
			
			// serializar um objeto � transformalo numa representa��o
			// bin�ria, dai � poss�vel salvar/escrever este objeto
			// em disco rigido (HD).
			if (escolha == 5) {
				FileOutputStream canal = new FileOutputStream(caminho);
				ObjectOutputStream escritor = new ObjectOutputStream(canal);
				escritor.writeObject(cadastros);
				escritor.close();
				System.out.println("Cadastros de clientes salvo com sucesso!");
			}

			if (escolha == 6) {
				FileInputStream canal = new FileInputStream(caminho);
				ObjectInputStream leitor = new ObjectInputStream(canal);
				// casting / cast -> casca
				cadastros = (List<Cliente>) leitor.readObject();
				leitor.close();
				System.out.println("Cadastros lidos com sucesso!");
			}
			
		}
		System.out.println("Obrigado e at� a pr�xima!!!");
	}
}
