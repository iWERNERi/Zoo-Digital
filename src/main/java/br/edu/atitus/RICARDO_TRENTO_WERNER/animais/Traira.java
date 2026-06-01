package br.edu.atitus.RICARDO_TRENTO_WERNER.animais;

import br.edu.atitus.RICARDO_TRENTO_WERNER.comportamentos.Nado;
import br.edu.atitus.RICARDO_TRENTO_WERNER.comportamentos.Predacao;
import br.edu.atitus.RICARDO_TRENTO_WERNER.especies.Peixe;

public class Traira extends Peixe implements Nado, Predacao {

    public Traira(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de traíra");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo peixes menores.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando peixes menores.");
    }
}