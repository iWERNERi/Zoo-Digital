package br.edu.atitus.RICARDO_TRENTO_WERNER.animais;

import br.edu.atitus.RICARDO_TRENTO_WERNER.comportamentos.Corrida;
import br.edu.atitus.RICARDO_TRENTO_WERNER.especies.Reptil;

public class Iguana extends Reptil implements Corrida {

    public Iguana(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de iguana");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo vegetais.");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo.");
    }
}