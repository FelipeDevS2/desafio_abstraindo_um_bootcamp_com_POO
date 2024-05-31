package main.java.bootcamp;

public class Curso extends Conteudo{

    public Curso(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao, cargaHoraria);

    }

    @Override
    public double calcularXP() {
        return XP_PADRAO*getCargaHoraria();
    }


    @Override
    public String toString() {
        return "\nCurso: " +getTitulo()+
                "\nDescricao: "+getDescricao()+
                "\nCarga horaria:  "+getCargaHoraria()+"h"+
                "\nXP: "+String.format("%.2f",calcularXP());
    }


}
