import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import entities.*;

public class App {
    static ArrayList<Pessoa> listaPessoas = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        System.out.println("----- INICIANDO O PROGRAMA ----");
        int opcao=0;
        Scanner ler = new Scanner(System.in);
        do {
            try {
                System.out.println("\n\n----------------- MENU -----------------");
                System.out.println("1 - Cadastrar Jogador Virtual");
                System.out.println("2 - Cadastrar Jogador Fisico");
                System.out.println("3 - Cadastrar Juiz Convidado");
                System.out.println("4 - Cadastrar Juiz Contratado");
                System.out.println("11 - Listar Jogadores Virtuais");
                System.out.println("12 - Listar Jogadores Fisicos");
                System.out.println("13 - Listar Juizes Convidados");
                System.out.println("14 - Listar Juizes Contratados");
                System.out.println("21 - Listar Jogadores de Volei");
                System.out.println("22 - Mostrar os 3 melhores jogadores do ranking");
                System.out.println("23 - Pesquisar jogador por nome");
                System.out.println("100 - Sair");
                System.out.println("----------------------------------------------");
                System.out.print("--->Digite uma opção: ");
                opcao = ler.nextInt();
                switch (opcao) {
                    case 1:
                        Virtual objVirtual = new Virtual();
                        objVirtual.cadastrar(ler);
                        listaPessoas.add(objVirtual);
                        break;
                    case 2:
                        Fisico objFisico = new Fisico();
                        objFisico.cadastrar(ler);
                        listaPessoas.add(objFisico);
                        break;
                    case 3:
                        Convidado objConvidado = new Convidado();
                        objConvidado. cadastrar(ler);
                        listaPessoas.add(objConvidado);
                        break;
                    case 4:
                        Contratado objContratado = new Contratado();
                        objContratado. cadastrar(ler);
                        listaPessoas.add(objContratado);
                        break;
                    case 11:
                        listarPessoas("Virtual");
                        // for (Pessoa pessoa : listaPessoas) {
                        //     if(pessoa instanceof Virtual)
                        //         System.out.println(pessoa);//toString()
                        // }
                        break;
                    case 12:
                        listarPessoas("Fisico");

                        // for (Pessoa pessoa : listaPessoas) {
                        //     if(pessoa instanceof Fisico)
                        //         System.out.println(pessoa);//toString()
                        // }
                        break;
                    case 13:
                        listarPessoas("Convidado");

                        // for (Pessoa pessoa : listaPessoas) {
                        //         if(pessoa instanceof Convidado)
                        //             System.out.println(pessoa);//toString()
                        //     }
                        break;
                    case 14:
                        listarPessoas("Contratado");
                        // for (Pessoa pessoa : listaPessoas) {
                        //     if(pessoa instanceof Contratado)
                        //         System.out.println(pessoa);//toString()
                        // }
                        break;
                    case 21:
                        for (Pessoa p : listaPessoas) {
                            if(p instanceof Jogador && 
                            ((Jogador)p).getEsporte().equalsIgnoreCase("VÔLEI"))
                                System.out.println(p);
                        }
                        break;
                    case 22:
                        // Mostrar os 3 melhores jogadores do ranking
                        System.out.println("\nOs 3 melhores jogadores do ranking são:");
 
                        // 1. Criar uma cópia da lista original para não alterar a ordem verdadeira
                        //ArrayList<Virtual> copiaOrdenada = new ArrayList<>(listaJogadoresVirtuais);
                        ArrayList<Virtual> copiaOrdenada = new ArrayList<>();
                        for (Pessoa pessoa : listaPessoas) {
                            if(pessoa instanceof Virtual)
                                copiaOrdenada.add((Virtual)pessoa);
                        }
                        // 2. Ordenar a lista de cópia pela posição no ranking (do menor para o maior)
                        copiaOrdenada.sort(Comparator.comparingInt(Virtual::getPosicaoRanking));
                        
                        // 3. Determinar o número de jogadores a exibir (no máximo 3 ou o total da lista, se menor)
                        // int limite = Math.min(3, copiaOrdenada.size());
                       
                        // for (int i = 0; i < limite; i++) {
                        //     Virtual jogador = copiaOrdenada.get(i);
                        //     System.out.println("\nNome: " + jogador.getNome());
                        //     System.out.println("Posição no Ranking: " + jogador.getPosicaoRanking());
                        // }
                        System.out.println(copiaOrdenada.get(0));// toString da classe Virtual
                        System.out.println(copiaOrdenada.get(1));
                        System.out.println(copiaOrdenada.get(2));

                        // int posicao1=0, posicao2=0, posicao3=0;
                        // for (Pessoa p : listaPessoas) {
                        //     // if(p instanceof Virtual && 
                        //     // ((Virtual)p).getPosicaoRanking().equals("1"))
                        //         System.out.println(p);
                        // }
                        break;
                    case 23:
                        System.out.println("Digite o nome a ser pesquisado:");
                        String nome = ler.next();
                        for (Pessoa p : listaPessoas) {
                            if(p.getNome().contains(nome))
                                System.out.println(p);
                        }
                        break;
                    case 100:
                        System.exit(0);
                    default:
                        System.out.println("OPÇÃO INVÁLIDA --------");
                        break;
                }
            } catch (Exception e) {
                System.out.println("----> Erro:"+e.getMessage());
                ler.next();
            }
        } while (opcao!=100); 
    }
    public static void listarPessoas(String tipo){
        System.out.println(" ---- LISTA DE "+ tipo.toUpperCase() + " -----");
        for (Pessoa pessoa : listaPessoas) {
            if(tipo.equals("Virtual") && pessoa instanceof Virtual)
                System.out.println(pessoa);//toString()
            if(tipo.equals("Fisico") && pessoa instanceof Fisico)
                System.out.println(pessoa);//toString()
            if(tipo.equals("Convidado") && pessoa instanceof Convidado)
                System.out.println(pessoa);//toString()
            if(tipo.equals("Contratado") && pessoa instanceof Contratado)
                System.out.println(pessoa);//toString()
        }
    }
}
