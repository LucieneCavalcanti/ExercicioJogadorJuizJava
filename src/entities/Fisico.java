package entities;

import java.util.Scanner;

public final class Fisico extends Jogador{
    private String modalidade;
    private String categoria;
    public Fisico() {
    }
    public Fisico(int id, String nome, String email, String esporte, int idade, String modalidade, String categoria) {
        super(id, nome, email, esporte, idade);
        this.modalidade = modalidade;
        this.categoria = categoria;
    }
    public String getModalidade() {
        return modalidade;
    }
    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public void cadastrar(Scanner ler){
        super.cadastrar(ler);
        do {
            System.out.println("Digite a modalidade:");
            modalidade = ler.next();
        } while (modalidade.length()<5);
        do {
            System.out.println("Digite a categoria:");
            categoria = ler.next();
        } while (categoria.length()<5);
    }
    public String toString(){
        return super.toString() + 
        "\nModalidade: " + modalidade +
        "\nCategoria: " + categoria +"\n";
    }

}
