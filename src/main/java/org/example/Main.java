package org.example;

import java.util.Arrays;
import java.util.Iterator;


interface Falante {
    String falar();
}

abstract class Animal implements Falante, java.lang.Comparable<Animal> {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Animal animal) {
        if (this.nome == null) {
            return "".compareTo(animal.nome);
        } else {
            return this.nome.compareTo(animal.nome);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (!(obj instanceof Animal))
            return false;
        return this.compareTo((Animal)obj) == 0;
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

class Veterinaria implements Iterable<Animal> {
//class Veterinaria {
        private Animal[] animais = {new Gato("Mimi"), new Cachorro("Lulu")};

    @Override
    public Iterator<Animal> iterator() {
        return Arrays.stream(animais).iterator();
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

        int[] numeros = {20, 10, 5, 4};
        System.out.println(Arrays.toString(numeros));
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));

        Arrays.sort(bichos);

        Veterinaria vet = new Veterinaria();
        for (Animal a : vet) {
            System.out.println(a);
        }


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