package entities;

import java.util.Scanner;

public abstract class Jogador extends Pessoa{
    private String esporte;
    private int idade;
    public Jogador() {
    }

    public Jogador(int id, String nome, String email, String esporte, int idade) {
        super(id, nome, email);
        this.esporte = esporte;
        this.idade = idade;
    }

    public String getEsporte() {
        return esporte;
    }

    public void setEsporte(String esporte) {
        this.esporte = esporte;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void cadastrar(Scanner ler){
        super.cadastrar(ler);
        do {
            System.out.println("Digite o esporte:");
            esporte = ler.next();
        } while (esporte.length()<5);
        do {
            System.out.println("Digite a idade:");
            idade = ler.nextInt();
        } while (idade<10);
    }
    public String toString(){
        return super.toString() + 
        "\nEsporte: " + esporte +
        "\nIdade: " + idade;
    }
}
