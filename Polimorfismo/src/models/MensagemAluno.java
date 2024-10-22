package models;

public class MensagemAluno extends MensagemGenerica {
	
	//Construtor que puxa atributos da superclasse
	public MensagemAluno(String nome, String mensagem){
		super(nome, mensagem);
	}
	
	//Sobrescrição do método superclasse
	@Override
	public String enviarEmail() {
		return
			"Olá Aluno  "
			+ getNome()
			+ "\n"
			+ getMensagem()
			+ "\n\n";
	}
}
