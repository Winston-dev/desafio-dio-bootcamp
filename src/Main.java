import br.com.dio.desafio.dominio.*;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Curso curso = new Curso();
        curso.setTitulo("java");
        curso.setDescricao("Curso de java");
        curso.setCargaHoraria(5);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Curso de js");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setData(LocalDate.now());
        mentoria.setDescricao("Curso de Java");
        mentoria.setTitulo("mentoria java");
        System.out.println(mentoria);

        System.out.println("-----------------------------------");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getCaonteudos().add(curso);
        bootcamp.getCaonteudos().add(curso2);
        bootcamp.getCaonteudos().add(mentoria);

        Dev winston = new Dev();
        winston.setNome("Winston");
        winston.increverBootcapm(bootcamp);
        System.out.println("Conteudos inscritos por Winston");
        winston.progredir();
        winston.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos" + winston.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + winston.getConteudoConcluidos());
        System.out.println("Xp: " + winston.calcularTotalXp());

        System.out.println("----------------------");

        Dev joao = new Dev();
        winston.setNome("João");
        joao.increverBootcapm(bootcamp);
        System.out.println("Conteudos inscritos por João");
        joao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos" + joao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + winston.getConteudoConcluidos());
        System.out.println("Xp: " + joao.calcularTotalXp());






    }
}