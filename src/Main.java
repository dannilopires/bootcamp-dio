import br.com.bootcamp.Bootcamp;
import br.com.bootcamp.Curso;
import br.com.bootcamp.Dev;
import br.com.bootcamp.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("bootcamp java");
        bootcamp.setDescricao("descrição java");

        Dev d1 = new Dev();
        d1.setNome("Dannilo");

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("mentoria descrição java");
        mentoria.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("descomplicando SOLID");
        mentoria2.setDescricao("princípios de programação orientada a objetos");
        mentoria.setData(LocalDate.now().plusDays(1));

        Curso curso = new Curso();
        curso.setTitulo("curso sql");
        curso.setDescricao("curso java");
        curso.setCargaHoraria(2);

        Curso curso2 = new Curso();
        curso2.setTitulo("spring boot");
        curso2.setDescricao("descomplicando framework java");
        curso2.setCargaHoraria(1);


        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria2);

        d1.inscreverBootcamp(bootcamp);

        System.out.println(d1.getConteudosInscritos());

        System.out.println(bootcamp.getDevsInscritos());




    }
}
