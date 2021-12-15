package br.com.bootcamp;

abstract class Conteudo {
    static final double XP_PADRAO = 10d;
    private String titulo;
    private String descricao;

    public abstract double calcularXP();
}
