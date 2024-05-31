package main.java.bootcamp;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate dataInicial, dataFinal;

    public Mentoria(String titulo, String descricao, int cargaHoraria, LocalDate dataInicial, LocalDate dataFinal) {
        super(titulo, descricao, cargaHoraria);
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
    }



    public LocalDate getDataInicial() {
        return dataInicial;
    }


    public LocalDate getDataFinal() {
        return dataFinal;
    }


    @Override
    public String toString() {
        return "\nMentoria: " + getTitulo()+
                "\nDescricao: "+getDescricao()+
                "\nCarga horaria:  "+getCargaHoraria()+"h"+
                "\nData Inicial: " + dataInicial +
                "\nData Final:" + dataFinal+
                "\nXP: "+String.format("%.2f",calcularXP());
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO+20;
    }

}
