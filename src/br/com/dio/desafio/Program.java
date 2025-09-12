package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
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
		
//		System.out.println(curso1);
//		System.out.println(curso2);
//		System.out.println(mentoria1);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Dev");
		bootcamp.setDescricao("Descricao do bootcamp Java Dev");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev dev1 = new Dev();
		dev1.setNome("Heitor");
		dev1.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos: " + dev1.getConteudoInscritos());
		dev1.progressao();
		System.out.println("Conteudos Inscritos: " + dev1.getConteudoInscritos());
		System.out.println("Conteudos Concluidos: " + dev1.getConteudoConcluidos());
		System.out.println("XP: " + dev1.calcularTotalXp());
		
		Dev dev2 = new Dev();
		dev2.setNome("Giovanna");
		dev2.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos: " + dev2.getConteudoInscritos());
		dev2.progressao();
		System.out.println("Conteudos Inscritos: " + dev2.getConteudoInscritos());
		System.out.println("Conteudos Concluidos: " + dev2.getConteudoConcluidos());
		System.out.println("XP: " + dev2.calcularTotalXp());
	}

}
