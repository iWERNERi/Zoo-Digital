package br.edu.atitus.RICARDO_TRENTO_WERNER.animais;

import br.edu.atitus.RICARDO_TRENTO_WERNER.comportamentos.Nado;
import br.edu.atitus.RICARDO_TRENTO_WERNER.comportamentos.Voo;
import br.edu.atitus.RICARDO_TRENTO_WERNER.especies.Ave;

public class Pato extends Ave implements Nado, Voo {

    public Pato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Quack Quack");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo sementes.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando.");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está voando.");
    }
}