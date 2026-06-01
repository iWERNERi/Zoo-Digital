package br.edu.atitus.RICARDO_TRENTO_WERNER.animais;

import br.edu.atitus.RICARDO_TRENTO_WERNER.comportamentos.Predacao;
import br.edu.atitus.RICARDO_TRENTO_WERNER.especies.Reptil;

public class Cobra extends Reptil implements Predacao {

    public Cobra(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Sssss");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo um rato.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando sua presa.");
    }
}