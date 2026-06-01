package br.edu.atitus.RICARDO_TRENTO_WERNER.animais;

import br.edu.atitus.RICARDO_TRENTO_WERNER.comportamentos.Corrida;
import br.edu.atitus.RICARDO_TRENTO_WERNER.comportamentos.Predacao;
import br.edu.atitus.RICARDO_TRENTO_WERNER.especies.Mamifero;

public class Lobo extends Mamifero implements Corrida, Predacao {

    public Lobo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Auuuuuu");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo carne.");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo pela floresta.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando em matilha.");
    }
}