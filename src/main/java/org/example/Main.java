package org.example;

interface Falante {
    String falar();
}

abstract class Animal implements Falante {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }
}

class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    public String falar() {
        return nome + " diz miau!";
    }
}

class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }

    public String falar() {
        return nome + " diz auau!";
    }
}

class Papagaio extends Animal {
    public Papagaio(String nome) {
        super(nome);
    }

    @Override
    public String falar() {
        return nome + " diz crack!";
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Animais!");
        Falante[] bichos = {
                new Gato("Felix"),
                new Gato("Garfield"),
                new Gato("Mingau"),
                new Cachorro("Pluto"),
                new Cachorro("Xuxucão"),
                new Cachorro("Monicão"),
                new Cachorro("Bidu"),
                new Papagaio("Zé Carioca")
        };

        for (Falante bicho : bichos) {
            System.out.println(bicho.falar());
        }

        System.out.println(bichos[0] instanceof Gato);
        System.out.println(bichos[0] instanceof Animal);
        System.out.println(bichos[0] instanceof Cachorro);
        System.out.println(bichos[0] instanceof Falante);
        System.out.println(bichos[0] instanceof Object);

    }
}