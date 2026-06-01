package br.edu.atitus.RICARDO_TRENTO_WERNER.animais;

import br.edu.atitus.RICARDO_TRENTO_WERNER.comportamentos.Nado;
import br.edu.atitus.RICARDO_TRENTO_WERNER.comportamentos.Predacao;
import br.edu.atitus.RICARDO_TRENTO_WERNER.especies.Ave;

public class Pinguim extends Ave implements Nado, Predacao {

    public Pinguim(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Honk");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo peixe.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando krill no gelo.");
    }
}