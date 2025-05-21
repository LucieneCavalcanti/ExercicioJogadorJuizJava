package entities;

import java.util.Scanner;

public final class Virtual extends Jogador{
    private String tipoJogo;
    private int posicaoRanking;
    public Virtual() {
    }
    public Virtual(int id, String nome, String email, String esporte, int idade, String tipoJogo,
            int posicaoRanking) {
        super(id, nome, email, esporte, idade);
        this.tipoJogo = tipoJogo;
        this.posicaoRanking = posicaoRanking;
    }
    public String getTipoJogo() {
        return tipoJogo;
    }
    public void setTipoJogo(String tipoJogo) {
        this.tipoJogo = tipoJogo;
    }
    public int getPosicaoRanking() {
        return posicaoRanking;
    }
    public void setPosicaoRanking(int posicaoRanking) {
        this.posicaoRanking = posicaoRanking;
    }
    public void cadastrar(Scanner ler){
        super.cadastrar(ler);
        do {
            System.out.println("Digite a posição no ranking:");
            posicaoRanking = ler.nextInt();
        } while (posicaoRanking<0);
        do {
            System.out.println("Digite o tipo de jogo:");
            tipoJogo = ler.next();
        } while (tipoJogo.length()<5);
    }
    public String toString(){
        return super.toString() + 
        "\nTipo de jogo: " + tipoJogo +
        "\nPosição no ranking: " + posicaoRanking +"\n";
    }

}
