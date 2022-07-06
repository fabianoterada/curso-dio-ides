package br.com.dio.model;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gato gato = new Gato(null, null, null);
		Livros livro = new Livros();
		
		System.out.println(gato);
		System.out.println(livro);
		
	}
	
	class Livro{
		private String nome;
		private String npag;
	}

}
