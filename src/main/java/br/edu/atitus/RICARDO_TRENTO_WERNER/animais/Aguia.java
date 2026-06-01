package br.edu.atitus.RICARDO_TRENTO_WERNER.animais;

import br.edu.atitus.RICARDO_TRENTO_WERNER.comportamentos.Voo;
import br.edu.atitus.RICARDO_TRENTO_WERNER.comportamentos.Predacao;
import br.edu.atitus.RICARDO_TRENTO_WERNER.especies.Ave;

public class Aguia extends Ave implements Voo, Predacao {

    public Aguia(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Kreeee");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo carne.");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está voando.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando um coelho.");
    }
}