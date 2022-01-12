package br.com.dio;

import java.util.Objects;

public class Gato {
	private String nome; //atributo
	private String cor;     //atributo
	private String idade; //atributo
	
	public Gato() {}

	// cria-se uma constructions com o comando ctrl+3
	public Gato(String nome, String cor, String idade) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getIdade() {
		return idade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cor, idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome);
	}
	

	
	
	

}
