package main.java.bootcamp;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Bootcamp bootcamp;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public Dev(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void inscrverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        this.bootcamp = bootcamp;
        if (!bootcamp.getDevsInscritos().contains(this)) {
            System.out.println(this.nome + " bem vindo ao bootcamp " + bootcamp.getNome() + ", seu XP inicial eh: "+String.format("%.2f",Conteudo.XP_PADRAO)+"!");
            bootcamp.getDevsInscritos().add(this);
        } else {
            System.out.println(this.nome+", você ja esta incrito no bootcamp!");
        }
    }



    public void progredir(){
        Optional<Conteudo> conteudo  = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()){
            conteudosConcluidos.add(conteudo.get());
            conteudosInscritos.remove(conteudo.get());
            System.out.println(this.nome+" parabens por concluir o conteudo "+conteudo.get().getTitulo()+", seu XP subiu para "+String.format("%.2f",calcularTotalXP()));
            if(conteudosInscritos.isEmpty()){
                System.out.println("Parabens! Voce concluiu todo o conteudo desse bootcamp!");
                adicionarAosConcluintes(this);
            }
        }else if(conteudosConcluidos.isEmpty()){
            System.out.println("Nenhum conteudo encontrado, por favor, inscreva-se em um bootcamp!");
        }  else
            System.out.println(this.nome+" voce ja concluiu todo o conteudo desse bootcamp!");
    }

    public double calcularTotalXP(){
        return conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXP)
                                  .sum();
    }

    public void adicionarAosConcluintes(Dev dev){
        this.bootcamp.getDevsConcluintes().add(dev);
    }


    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(getNome(), dev.getNome());
    }

    @Override
    public String toString() {
        return  nome;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getNome());
    }
}
