package org.fatec;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Serializacao {

	public static void main(String[] args) throws Exception {
//		List<Cliente> cadastros = new ArrayList<>();
//		Cliente c1 = new Cliente();
//		c1.nome = "Gerson"; c1.telefone = "122345";
//		
//		Cliente c2 = new Cliente();
//		c2.nome = "Regina"; c2.telefone = "124562345";
//		
//		cadastros.add(c1); cadastros.add(c2);
		
		// parte do codigo da escrita
//		FileOutputStream canal = new FileOutputStream("D:\\OneDrive - Etec Centro Paula Souza\\Área de Trabalho"
//				+ "\\3sem\\github\\POO\\POO-2020-09-15\\bin\\org\\fatec\\cadastros.ser");
//		ObjectOutputStream escritor = new ObjectOutputStream(canal);
//		escritor.writeObject(cadastros);
//		escritor.close();
		
		FileInputStream canal = new FileInputStream("D:\\OneDrive - Etec Centro Paula Souza\\Área de Trabalho"
				+ "\\3sem\\github\\POO\\POO-2020-09-15\\bin\\org\\fatec\\cadastros.ser");
		ObjectInputStream leitor = new ObjectInputStream(canal);
		// casting
		List<Cliente> cadastros = (List<Cliente>) leitor.readObject();
		
		cadastros.forEach(cliente -> System.out.println(cliente));

	}

}
