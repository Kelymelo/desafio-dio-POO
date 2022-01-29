import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Conceitos Básicos em Java");
        curso1.setDescricao("Curso de desenvolvimento básico em Java");
        curso1.setCargaHoraria(58);

        Curso curso2 = new Curso();
        curso2.setTitulo("Lógica de Programação");
        curso2.setDescricao("Curso de desenvolvimento de lógica de programação");
        curso2.setCargaHoraria(90);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria em Java");
        mentoria1.setDescricao("Mentoria sobre primeiros passos com Java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria como resolver os desafios de código");
        mentoria2.setDescricao("Mentoria para instruir o DEV como resolver os desafios ");
        mentoria2.setData(LocalDate.now());

        /*
        System.out.println(curso2);
        System.out.println(mentoria1);
        System.out.println(mentoria2);
        System.out.println(curso1);
        */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição: Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(mentoria2);

        Dev devKely = new Dev();
        devKely.setNome("Kely");
        devKely.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Kely: " + devKely.getConteudosInscritos());
        devKely.progredir();
        System.out.println("Conteúdos Inscritos Kely: " + devKely.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Kely: " + devKely.getConteudosConcluidos());
        System.out.println("XP: "+ devKely.calcularTotalXp());

        Dev devThiego = new Dev();
        devThiego.setNome("Thiego");
        devThiego.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Thiego: " + devThiego.getConteudosInscritos());
        devThiego.progredir();
        System.out.println("Conteúdos Inscritos Thiego: " + devThiego.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Thiego: " + devThiego.getConteudosConcluidos());
        System.out.println("XP: " + devThiego.calcularTotalXp());

    }
}
