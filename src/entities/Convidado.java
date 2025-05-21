package entities;

import java.util.Scanner;

public final class Convidado extends Juiz {
    private String indicacao;

    public Convidado() {
        super();
        indicacao = new String(); // null
    }

    public Convidado(int id, String nome, String email, String numeroRegistro, String experiencia, String indicacao) {
        super(id, nome, email, numeroRegistro, experiencia);
        this.indicacao = indicacao;
    }

    public String getIndicacao() {
        return indicacao;
    }

    public void setIndicacao(String indicacao) {
        this.indicacao = indicacao;
    }
    public void cadastrar(Scanner ler){
        super.cadastrar(ler);
        do {
            System.out.println("Digite quem indicou o juiz:");
            indicacao = ler.next();
        } while (indicacao.length()<5);
        
    }
    public String toString(){
        return super.toString() + 
        "\nIndicado por: " + indicacao +"\n";
    }
}
