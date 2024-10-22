package models;

public class MensagemGenerica {
	private String nome;
	private String mensagem;
	
	public MensagemGenerica(String nome, String mensagem) {
		this.nome = nome;
		this.mensagem = mensagem;
	}
	
	public String getNome(){
		return nome;
	}
	
	public String getMensagem(){
		return mensagem;
	}
	
	public String enviarEmail() {
		return
			"Olá Senhor(a)  "
			+ nome
			+ "\n"
			+ mensagem
			+ "\n\n";
	}

}

