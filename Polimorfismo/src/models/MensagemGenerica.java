package models;

public class MensagemGenerica {
	//Declarando os atributos
	private String nome;
	private String mensagem;
	
	//Construtor da classe
	public MensagemGenerica(String nome, String mensagem) {
		this.nome = nome;
		this.mensagem = mensagem;
	}
	
	//Getters
	public String getNome(){
		return nome;
	}
	
	public String getMensagem(){
		return mensagem;
	}
	
	//Método gera uma mensagem para enviar em no e-mail
	public String enviarEmail() {
		return
			"Olá Senhor(a)  "
			+ nome
			+ "\n"
			+ mensagem
			+ "\n\n";
	}

}

