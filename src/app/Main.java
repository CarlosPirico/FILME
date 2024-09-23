package app;
import models.Filme;

public class Main {
	public static void main(String[] args) {
		try {
			// Estanciando filme e seus valores
			Filme filme1 = new Filme("Ohata no mundo das maravilhas", 128, Filme.Gender.COMEDIA);
			//Filme filme1 = new Filme("Ohata no mundo das maravilhas", -128, Filme.Gender.COMEDIA);
			//Filme filme1 = new Filme("", 128, Filme.Gender.COMEDIA);
			
			// Mostrando os dados do filme
			System.out.println(filme1.toString());
		} catch (Exception e) {
			// Retornando o erro modificado
			System.out.println(e.getMessage());
		}
	}
}
