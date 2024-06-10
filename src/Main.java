import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso java");
        curso.setDescricao("Descricao curso Java");
        curso.setCargaHoraria(9);

        System.out.println(curso);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao( "Mentoria em java nova");
        mentoria.setData(LocalDate.now());
    }
}
