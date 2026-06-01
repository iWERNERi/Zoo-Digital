package br.edu.atitus.RICARDO_TRENTO_WERNER.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.atitus.RICARDO_TRENTO_WERNER.animais.*;
import br.edu.atitus.RICARDO_TRENTO_WERNER.comportamentos.*;
import br.edu.atitus.RICARDO_TRENTO_WERNER.especies.Animal;

public class ZooDigitalApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Animal> animais = new ArrayList<>();

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("\n===== ZOO DIGITAL =====");
            System.out.println("1 - Cadastrar Animal");
            System.out.println("2 - Listar Todos");
            System.out.println("3 - Listar Corredores");
            System.out.println("4 - Listar Nadadores");
            System.out.println("5 - Listar Voadores");
            System.out.println("6 - Listar Predadores");
            System.out.println("7 - Total de Animais");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    cadastrarAnimal(sc, animais);
                    break;

                case 2:
                    listarTodos(animais);
                    break;

                case 3:
                    listarCorredores(animais);
                    break;

                case 4:
                    listarNadadores(animais);
                    break;

                case 5:
                    listarVoadores(animais);
                    break;

                case 6:
                    listarPredadores(animais);
                    break;

                case 7:
                    System.out.println("Total de animais: " + Animal.getContador());
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        sc.close();
    }

    public static void cadastrarAnimal(Scanner sc, List<Animal> animais) {

        System.out.print("Nome: ");
        String nome = sc.next();

        System.out.print("Idade: ");
        int idade = sc.nextInt();

        System.out.println("\nEscolha o animal:");
        System.out.println("1 - Cachorro");
        System.out.println("2 - Gato");
        System.out.println("3 - Golfinho");
        System.out.println("4 - Leao");
        System.out.println("5 - Lobo");
        System.out.println("6 - Pato");
        System.out.println("7 - Pinguim");
        System.out.println("8 - Aguia");
        System.out.println("9 - Papagaio");
        System.out.println("10 - PeixeMorcego");
        System.out.println("11 - Traira");
        System.out.println("12 - Tubarao");
        System.out.println("13 - Salmao");
        System.out.println("14 - Cobra");
        System.out.println("15 - Jacare");
        System.out.println("16 - Iguana");
        System.out.println("17 - Tartaruga");

        int tipo = sc.nextInt();

        Animal animal = null;

        switch (tipo) {

            case 1:
                animal = new Cachorro(nome, idade);
                break;

            case 2:
                animal = new Gato(nome, idade);
                break;

            case 3:
                animal = new Golfinho(nome, idade);
                break;

            case 4:
                animal = new Leao(nome, idade);
                break;

            case 5:
                animal = new Lobo(nome, idade);
                break;

            case 6:
                animal = new Pato(nome, idade);
                break;

            case 7:
                animal = new Pinguim(nome, idade);
                break;

            case 8:
                animal = new Aguia(nome, idade);
                break;

            case 9:
                animal = new Papagaio(nome, idade);
                break;

            case 10:
                animal = new PeixeMorcego(nome, idade);
                break;

            case 11:
                animal = new Traira(nome, idade);
                break;

            case 12:
                animal = new Tubarao(nome, idade);
                break;

            case 13:
                animal = new Salmao(nome, idade);
                break;

            case 14:
                animal = new Cobra(nome, idade);
                break;

            case 15:
                animal = new Jacare(nome, idade);
                break;

            case 16:
                animal = new Iguana(nome, idade);
                break;

            case 17:
                animal = new Tartaruga(nome, idade);
                break;

            default:
                System.out.println("Animal inválido.");
        }

        if (animal != null) {
            animais.add(animal);
            System.out.println("Animal cadastrado com sucesso!");
        }
    }

    public static void listarTodos(List<Animal> animais) {

        for (Animal animal : animais) {

            System.out.println("-------------------");
            System.out.println("Nome: " + animal.getNome());
            System.out.println("Idade: " + animal.getIdade());
            System.out.println("Espécie: " + animal.getClass().getSimpleName());

            animal.emitirSom();
            animal.comer();

        }
    }

    public static void listarCorredores(List<Animal> animais) {

        for (Animal animal : animais) {

            if (animal instanceof Corrida) {

                System.out.println(animal.getNome());

                Corrida corredor = (Corrida) animal;
                corredor.correr();
            }
        }
    }

    public static void listarNadadores(List<Animal> animais) {

        for (Animal animal : animais) {

            if (animal instanceof Nado) {

                System.out.println(animal.getNome());

                Nado nadador = (Nado) animal;
                nadador.nadar();
            }
        }
    }

    public static void listarVoadores(List<Animal> animais) {

        for (Animal animal : animais) {

            if (animal instanceof Voo) {

                System.out.println(animal.getNome());

                Voo voador = (Voo) animal;
                voador.voar();
            }
        }
    }

    public static void listarPredadores(List<Animal> animais) {

        for (Animal animal : animais) {

            if (animal instanceof Predacao) {

                System.out.println(animal.getNome());

                Predacao predador = (Predacao) animal;
                predador.cacar();
            }
        }
    }
}