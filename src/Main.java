import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso de desenvolvimento em Java");
        curso1.setCargaHoraria(58);

        Curso curso2 = new Curso();
        curso2.setTitulo("Angula");
        curso2.setDescricao("Curso de desenvolvimento em Angular");
        curso2.setCargaHoraria(90);

        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria em Java");
        mentoria1.setDescricao("Mentoria sobre primeiros passos com Java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria em Angular");
        mentoria2.setDescricao("Mentoria sobre primeiros passos com Angular");
        mentoria2.setData(LocalDate.now());

        System.out.println(mentoria1);
        System.out.println(mentoria2);
    }
}
