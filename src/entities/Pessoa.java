package entities;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Pessoa {
    private int id;
    private String nome;
    private String email;
    public Pessoa() {
        id=0;
        nome= new String();
        email = new String();
    }
    public Pessoa(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void cadastrar(Scanner ler){
        do{
            try{
                System.out.println("Digite o id: ");
                setId(ler.nextInt());
                if(getId()<=0)
                    throw new Exception("Digite um número maior que zero!");
            }catch(InputMismatchException e){
                System.out.println("Digite apenas números");
                ler.next();
            }
            catch(Exception e){
                System.out.println("--ERRO: "+ e.getMessage());
                ler.next();
            }
        }while(getId()<=0);

        do {
            System.out.println("Digite o nome: ");
            setNome(ler.next());
            if(getNome().length()<3)
                System.out.println("Digite pelo menos 3 caracteres.");
        } while (getNome().length()<3);
        do{
            System.out.println("Digite o email: ");
            setEmail(ler.next());
        }while(getEmail().length()<10 || !getEmail().contains("@")
        || !getEmail().contains("."));
    }
    public String toString(){
        return "----Nome:" + nome.toUpperCase() +
         "\nEmail:"+ email.toLowerCase();
    }
}
