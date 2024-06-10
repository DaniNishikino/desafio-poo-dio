import br.com.dio.desafio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso java");
        curso.setDescricao("Descricao curso Java");
        curso.setCargaHoraria(9);
        Curso curso2 = new Curso();
        curso2.setTitulo("Curso C*");
        curso2.setDescricao("Descricao curso c*");
        curso2.setCargaHoraria(20);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao( "Mentoria em java nova");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDaniel = new Dev();
        devDaniel.setNome("Daniel");
        devDaniel.inscreverBootcampp(bootcamp);
        System.out.println("Conteudos Inscritos" + devDaniel.getConteudosIncritos());
        devDaniel.progredir();
        System.out.println("Conteudos Inscritos" + devDaniel.getConteudosIncritos());
        System.out.println(devDaniel.calcularXp());
        System.out.println();

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcampp(bootcamp);
        System.out.println("Conteudos inscritos" + devJoao.getConteudosIncritos());
        devJoao.progredir();
        System.out.println("Conteudos inscritos" + devJoao.getConteudosIncritos());
        System.out.println("COnteudos concluidos"+ devJoao.getConteudosConcluidos()) ;
        System.out.println(devJoao.calcularXp());


    }
}
