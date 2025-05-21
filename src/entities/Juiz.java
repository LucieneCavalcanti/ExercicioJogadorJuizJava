package entities;

import java.util.Scanner;

public abstract class Juiz extends Pessoa {
    private String numeroRegistro;
    private String experiencia;
    public Juiz() {
        super();
        numeroRegistro = new String();
        experiencia = new String();
    }
    public Juiz(int id, String nome, String email, String numeroRegistro, String experiencia) {
        super(id, nome, email);
        this.numeroRegistro = numeroRegistro;
        this.experiencia = experiencia;
    }
    public String getNumeroRegistro() {
        return numeroRegistro;
    }
    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }
    public String getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }
    public void cadastrar(Scanner ler){
        super.cadastrar(ler);
        do {
            System.out.println("Digite o número de registro:");
            numeroRegistro = ler.next();
        } while (numeroRegistro.length()<5);
        do {
            System.out.println("Digite o tempo de experiência");
            experiencia = ler.next();
        } while (experiencia.length()<5);
    }
    public String toString(){
        return super.toString() + 
        "\nRegistro: " + numeroRegistro +
        "\nTempo de experiência: " + experiencia;
    }
}
