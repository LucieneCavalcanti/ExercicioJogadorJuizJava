package entities;

import java.util.Scanner;

public final class Contratado extends Juiz{
    private float valorHora;

    public Contratado() {
        super();
        valorHora = 0;
    }

    public Contratado(int id, String nome, String email, String numeroRegistro, String experiencia, float valorHora) {
        super(id, nome, email, numeroRegistro, experiencia);
        this.valorHora = valorHora;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }
    public void cadastrar(Scanner ler){
        super.cadastrar(ler);
        do {
            System.out.println("Digite o valor hora:");
            valorHora = ler.nextFloat();
        } while (valorHora<5);
        
    }
    public String toString(){
        return super.toString() + 
        "\nValor hora: " + valorHora +"\n";
    }
}
