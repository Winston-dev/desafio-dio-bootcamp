import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Curso curso = new Curso();
        curso.setTitulo("java");
        curso.setDescricao("Curso de java");
        curso.setCargaHoraria(3);

        Mentoria mentoria = new Mentoria();
        mentoria.setData(LocalDate.now());
        mentoria.setDescricao("Curso de Java");
        mentoria.setTitulo("mentoria java");
        System.out.println(mentoria);





    }
}