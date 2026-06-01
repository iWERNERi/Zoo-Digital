package br.edu.atitus.RICARDO_TRENTO_WERNER.especies;

public abstract class Animal {

    private String nome;
    private int idade;

    private static int contador = 0;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        contador++;
    }

    public abstract void emitirSom();

    public void comer() {
        System.out.println(nome + " está comendo.");
    }

    public final void comer(String alimento) {
        System.out.println(nome + " está comendo " + alimento);
    }

    public static int getContador() {
        return contador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}