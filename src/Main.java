import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java2");
        curso2.setDescricao("Descrição do curso Java2");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria de Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devKaren = new Dev();
        devKaren.setNome("Karen");
        devKaren.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos da Dev Karen: " + devKaren.getConteudosInscritos());
        devKaren.progredir();
        devKaren.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluídos da Dev Karen: " + devKaren.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos não concluídos da Dev Karen: " + devKaren.getConteudosInscritos());
        System.out.println("XP: " + devKaren.calcularTotalXp());

        System.out.println("------------------------------------------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos da Dev Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluídos da Dev Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos não concluídos da Dev Camila: " + devCamila.getConteudosInscritos());
        System.out.println("XP: " + devCamila.calcularTotalXp());
    }

}
