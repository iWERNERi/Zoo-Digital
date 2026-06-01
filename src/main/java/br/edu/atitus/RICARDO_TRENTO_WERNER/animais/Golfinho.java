package br.edu.atitus.RICARDO_TRENTO_WERNER.animais;

import br.edu.atitus.RICARDO_TRENTO_WERNER.comportamentos.Nado;
import br.edu.atitus.RICARDO_TRENTO_WERNER.especies.Mamifero;

public class Golfinho extends Mamifero implements Nado {

    public Golfinho(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Cliques de golfinho");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo peixes.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando.");
    }
}