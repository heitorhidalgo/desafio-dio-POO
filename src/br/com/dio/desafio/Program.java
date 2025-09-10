package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Program {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso de Java");
		curso1.setDescricao("Descricao do curso de Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso de JavaScript");
		curso2.setDescricao("Descricao do curso de JavaScript");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria de Java");
		mentoria1.setDescricao("Descricao da mentoria de Java");
		mentoria1.setData(LocalDate.now());
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);
	}

}
