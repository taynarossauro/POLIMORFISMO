package main;
import models.*;

public class Main {

	public static void main(String[] args) {	

		MensagemProfessor mensagemProfesor = new MensagemProfessor("Ohata", "estou com dúvidas!");
		String print_professor = mensagemProfesor.enviarEmail();
		
		MensagemAluno mensagemAluno = new MensagemAluno("Carlos Pirico", "parabéns, você tirou 10!");
		String print_aluno = mensagemAluno.enviarEmail();
		
		
		System.out.println(print_professor);
		System.out.println(print_aluno);

		
		
	}

}
