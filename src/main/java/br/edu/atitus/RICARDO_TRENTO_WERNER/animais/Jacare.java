package br.edu.atitus.RICARDO_TRENTO_WERNER.animais;

import br.edu.atitus.RICARDO_TRENTO_WERNER.comportamentos.Nado;
import br.edu.atitus.RICARDO_TRENTO_WERNER.comportamentos.Predacao;
import br.edu.atitus.RICARDO_TRENTO_WERNER.especies.Reptil;

public class Jacare extends Reptil implements Nado, Predacao {

    public Jacare(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Grunhido de jacaré");
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
        System.out.println(getNome() + " está caçando próximo à margem.");
    }
}