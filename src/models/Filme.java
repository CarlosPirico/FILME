package models;

public class Filme {
	// Criando atributos Privados.
	private String title;
	private Integer duration;
	private Gender gender;
	
	// Criando enum para limitar os valores de genders.
	public enum Gender {
		ROMANCE, TERROR, COMEDIA
	}
	
	// Contrutor Publico com metodos internos privados.
	public Filme(String title, Integer duration, Gender gender) throws Exception {
		setTitle(title);
		setDuration(duration);
		setGender(gender);
	}
	
	// Gravar titulo.
	private void setTitle(String title) throws Exception {
		// Validação de titulo diferente de vazio.
		if (title == "") {
			throw new Exception("titulo obrigatorio.");
		}
		this.title = title;			
	}
	
	// Gravar duração.
	private void setDuration(Integer duration) throws Exception {
		// Validação da duração maior do que 0.
		if (duration <= 0) {
			throw new Exception("Duração tem que ser mais do que zero.");
		}
		this.duration = duration;			
	}
	
	// Gravar genero.
	private void setGender(Gender gender) {
		this.gender = gender;			
	}
	
	// Alterando uma metodo ToString nativo por um personalizado.
	public String toString() {
		return 
			"Titulo: " + this.title +
			"\nDuração: " + this.duration + " Min" +
			"\nGenero: " + this.gender;	
	}
	
}
