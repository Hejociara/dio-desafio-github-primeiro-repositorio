package br.com.dio;

import br.com.dio.model.Gato;

public class primeiroPrograma {

	public static void main(String[] args) {
		livros livros = new livros();
		Gato gato = new Gato();

		System.out.println(gato);
		System.out.println(livros);
	}
}

		
		//*int a =2;
		//int b = 3;
		//System.out.println("Hello world!" + (a+b));
class livros {
	private String nome;
	private String npag;
}

