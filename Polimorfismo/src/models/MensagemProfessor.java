package models;

public class MensagemProfessor extends MensagemGenerica {
	
	//Construtor que puxa atributos da superclasse
	public MensagemProfessor(String nome, String mensagem){
		super(nome, mensagem);
	}
	
	//Sobrescrição do método superclasse
	@Override
	public String enviarEmail() {
		return
			"Olá Prof.  "
			+ getNome()
			+ "\n"
			+ getMensagem()
			+ "\n\n";

	}
}
