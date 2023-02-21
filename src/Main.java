import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso C#");
        curso2.setDescricao("Descricao Curso C#");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMonica = new Dev();
        devMonica.setNome("Monica");
        devMonica.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos de Monica: " + devMonica.getConteudosInscritos());
        System.out.println("..........Progresso de Monica");
        devMonica.progredir();
        devMonica.progredir();
        System.out.println("Conteudos inscritos de Monica: " + devMonica.getConteudosInscritos());
        System.out.println("Conteudos concluidos de Monica: " + devMonica.getConteudosConcluidos());
        System.out.println("XP: " + devMonica.calcularTotalXp());

        System.out.println("**** PROXIMO DEV ******");
        Dev devMurilo = new Dev();
        devMurilo.setNome("Murilo");
        devMurilo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos de Murilo: " + devMurilo.getConteudosInscritos());
        devMurilo.progredir();
        devMurilo.progredir();
        devMurilo.progredir();
        System.out.println("..........Progresso de Murilo");
        System.out.println("Conteudos inscritos de Murilo: " + devMurilo.getConteudosInscritos());
        System.out.println("Conteudos concluidos de Murilo: " + devMurilo.getConteudosConcluidos());
        System.out.println("XP: " + devMurilo.calcularTotalXp());

    }
}