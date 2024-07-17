import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        Mentoria mentoria = new Mentoria();
//        System.out.println(curso);
        curso.setTitulo("java");
        curso.setDescricao("Curso de java");
        curso.setCargaHoraria(3);

        mentoria.setData(LocalDate.now());
        mentoria.setDescricao("Curso de Java");
        mentoria.setTitulo("mentoria java");
        System.out.println(mentoria);





    }
}