package main.java.bootcamp;

public abstract class Conteudo {
    private final String titulo;
    private final String descricao;
    private final int cargaHoraria;
    protected static final double XP_PADRAO = 10d;

    public Conteudo(String titulo, String descricao, int cargaHoraria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    public abstract double calcularXP();

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }


}
