package org.fatec;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Cliente implements Serializable {
	
	public String nome;
	public String telefone;
	
	@Override
	public String toString() {
		String delimitador = "########################";
		String info = "Nome: " + nome + "\nTelefone: " + telefone;
		return "\n" + delimitador + "\n" + info + "\n" + delimitador + "\n";
	}

}
