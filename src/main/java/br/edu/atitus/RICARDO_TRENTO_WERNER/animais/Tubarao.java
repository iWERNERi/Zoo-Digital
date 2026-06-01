package br.edu.atitus.RICARDO_TRENTO_WERNER.animais;

import br.edu.atitus.RICARDO_TRENTO_WERNER.comportamentos.Nado;
import br.edu.atitus.RICARDO_TRENTO_WERNER.comportamentos.Predacao;
import br.edu.atitus.RICARDO_TRENTO_WERNER.especies.Peixe;

public class Tubarao extends Peixe implements Nado, Predacao {

    public Tubarao(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de tubarão");
    }

    @Override
    public void comer() {
        System.out.println(getNome() + " está comendo carne.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando rapidamente.");
    }

    @Override
    public void cacar() {
        System.out.println(getNome() + " está caçando focas.");
    }
}