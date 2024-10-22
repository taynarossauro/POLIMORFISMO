package models;

public class MensagemAluno extends MensagemGenerica {
	
	public MensagemAluno(String nome, String mensagem){
		super(nome, mensagem);
	}
	
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
