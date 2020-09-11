package org.etec;

// public - utilizavel
// private - bloqueie o acesso direto, acessivel somente na classe
// protected - consigo manipular apenas na classe atual e como herança
// default - nao tem nada na frente, funciona somente (visibilidade) no pacote

// abstract - nao tem corpo e que precisa implementar depois, obrigatorio a classe ser abstract
// nao posso criar um objeto de classes abastratas

public abstract class Produto {
	protected String nome;
	public double preco;
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	// to get - obter
	// metodo get/set sao convencoes de nomenclatura
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract void resumo();
	
}
