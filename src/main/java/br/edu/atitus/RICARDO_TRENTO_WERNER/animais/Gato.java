package br.edu.atitus.RICARDO_TRENTO_WERNER.animais;

import br.edu.atitus.RICARDO_TRENTO_WERNER.comportamentos.Corrida;
import br.edu.atitus.RICARDO_TRENTO_WERNER.comportamentos.Predacao;
import br.edu.atitus.RICARDO_TRENTO_WERNER.especies.Mamifero;

public class Gato extends Mamifero implements Corrida, Predacao {

    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo ração de gato.");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando um rato.");
    }
}