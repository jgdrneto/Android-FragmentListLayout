package com.example.neto.fragmentlistlayout;

public class Alimento {

    private String nome;
    private double preco;

    public Alimento(String nNome, double nPreco){
        this.nome = nNome;
        this.preco = nPreco;
    }

    @Override
    public String toString() {
        return this.nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
