package br.edu.atitus.RICARDO_TRENTO_WERNER.animais;

import br.edu.atitus.RICARDO_TRENTO_WERNER.comportamentos.Voo;
import br.edu.atitus.RICARDO_TRENTO_WERNER.especies.Ave;

public class Papagaio extends Ave implements Voo {

    public Papagaio(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Curupaco!");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo frutas.");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está voando.");
    }
}