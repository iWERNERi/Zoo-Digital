package br.edu.atitus.RICARDO_TRENTO_WERNER.animais;

import br.edu.atitus.RICARDO_TRENTO_WERNER.comportamentos.Corrida;
import br.edu.atitus.RICARDO_TRENTO_WERNER.comportamentos.Predacao;
import br.edu.atitus.RICARDO_TRENTO_WERNER.especies.Mamifero;

public class Cachorro extends Mamifero
        implements Corrida, Predacao {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au Au");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo ração.");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " está correndo.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome()
                + " está caçando a meia que roubou.");
    }
}