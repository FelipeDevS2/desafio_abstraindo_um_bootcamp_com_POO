package main.java.bootcamp;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Bootcamp {
    private String nome, descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Dev> devsConcluintes = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public Bootcamp(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }



    public void setConteudos(Conteudo conteudo) {
        this.conteudos.add(conteudo);
    }

    public Set<Dev> getDevsConcluintes() {
        return devsConcluintes;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public String toString() {
       return  "\nBootcamp: "+ nome +
                "\nDescricao: "+ descricao +
                "\nData Inicial: " + dataInicial +
                "\nData Final: " + dataFinal +
                "\nDevs inscritos: " + devsInscritos.stream().map(Dev::toString)
                .collect(Collectors.joining("| "))+
                "\nDevs Concluintes: " + devsConcluintes.stream().map(Dev::toString)
                .collect(Collectors.joining("| "));
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos);
    }
}
