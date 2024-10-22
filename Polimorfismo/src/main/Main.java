package main;
import models.*;

public class Main {

	public static void main(String[] args) {	
		
		//Instanciando atributos da classe MensagemProfessor e utilizando método para enviar e-mail

		MensagemProfessor mensagemProfesor = new MensagemProfessor("Ohata", "estou com dúvidas!");
		String print_professor = mensagemProfesor.enviarEmail();
		
		//Instanciando atributos da classe MensagemAluno e utilizando método para enviar e-mail
		MensagemAluno mensagemAluno = new MensagemAluno("Carlos Pirico", "parabéns, você tirou 10!");
		String print_aluno = mensagemAluno.enviarEmail();
		
		//Printando testes
		System.out.println(print_professor);
		System.out.println(print_aluno);
		
	}

}
