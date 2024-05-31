import main.java.bootcamp.Bootcamp;
import main.java.bootcamp.Curso;
import main.java.bootcamp.Dev;
import main.java.bootcamp.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("Java","Aprendendo a sintaxe do java", 15);
        Curso curso1 = new Curso("POO","Aprenda Progamacao Orientadda a Objetos", 20);

        Mentoria mentoria = new Mentoria("Gerenciamento de tempo","dicas para ter sucesso",2,LocalDate.now(),LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Java Santander", "Desenvolvimento backend com Java");
        bootcamp.setConteudos(curso);
        bootcamp.setConteudos(curso1);
        bootcamp.setConteudos(mentoria);

        Dev dev1 = new Dev("Felipe Nascimento");
        Dev dev2 = new Dev("Camila Cavalcante");
        dev2.inscrverBootcamp(bootcamp);
        dev1.inscrverBootcamp(bootcamp);
        dev1.inscrverBootcamp(bootcamp);
        System.out.println(dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();

        System.out.println(bootcamp);
        Dev dev3 = new Dev("Ingrid bueno");
        dev3.inscrverBootcamp(bootcamp);

        System.out.println(bootcamp);







    }
}
