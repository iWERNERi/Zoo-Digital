package br.edu.atitus.RICARDO_TRENTO_WERNER.animais;

import br.edu.atitus.RICARDO_TRENTO_WERNER.comportamentos.Nado;
import br.edu.atitus.RICARDO_TRENTO_WERNER.especies.Peixe;

public class Salmao extends Peixe implements Nado {

    public Salmao(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de salmão");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo pequenos organismos.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando contra a correnteza.");
    }
}