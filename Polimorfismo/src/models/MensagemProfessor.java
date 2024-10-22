package models;

public class MensagemProfessor extends MensagemGenerica {
	
	public MensagemProfessor(String nome, String mensagem){
		super(nome, mensagem);
	}
	
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
