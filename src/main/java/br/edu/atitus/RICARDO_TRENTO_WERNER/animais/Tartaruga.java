package br.edu.atitus.RICARDO_TRENTO_WERNER.animais;

import br.edu.atitus.RICARDO_TRENTO_WERNER.comportamentos.Nado;
import br.edu.atitus.RICARDO_TRENTO_WERNER.especies.Reptil;

public class Tartaruga extends Reptil implements Nado {

    public Tartaruga(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de tartaruga");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo vegetais.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando.");
    }
}