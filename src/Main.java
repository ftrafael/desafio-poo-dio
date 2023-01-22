import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java.");
        curso1.setDescricao("Descrição curso java.");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso JS.");
        curso2.setDescricao("Descrição curso js.");
        curso2.setCargaHoraria(5);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
*/

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp JAva Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRafa = new Dev();
        devRafa.setNome("Rafa");
        devRafa.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos inscritos Rafa" + devRafa.getConteudosInscritos());
        devRafa.progredir();
        System.out.println("Conteúdos inscritos Rafa" + devRafa.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Rafa" + devRafa.getConteudosConcluidos());
        System.out.println("XP: "+ devRafa.calcularXp());

        System.out.println("-----------------");
        
        Dev devAna = new Dev();
        devAna.setNome("Ana");
        devAna.inscreverBootcamp(bootcamp);
        
        System.out.println("Conteúdos inscritos Ana" + devAna.getConteudosInscritos());
        devAna.progredir();
        devAna.progredir();
        devAna.progredir();
        System.out.println("Conteúdos inscritos Ana" + devAna.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Ana" + devAna.getConteudosConcluidos());
        System.out.println("XP: "+ devAna.calcularXp());
    }
}
