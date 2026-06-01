package br.edu.atitus.RICARDO_TRENTO_WERNER.animais;

import br.edu.atitus.RICARDO_TRENTO_WERNER.comportamentos.Corrida;
import br.edu.atitus.RICARDO_TRENTO_WERNER.comportamentos.Predacao;
import br.edu.atitus.RICARDO_TRENTO_WERNER.especies.Mamifero;

public class Leao extends Mamifero implements Corrida, Predacao {

    public Leao(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Roooar");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo carne.");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando uma zebra.");
    }
}
