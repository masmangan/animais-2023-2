package org.example;


interface Falante {
    public String falar();
}

class Gato extends java.lang.Object implements Falante{

    private String nome;

    public Gato(String nome) {
        super();
        this.nome = nome;
    }

    public String falar() {
        return nome + " diz miau!";
    }

}

class Cachorro extends java.lang.Object implements Falante {

    private String nome;

    public Cachorro(String nome) {
        super();
        this.nome = nome;
    }

    public String falar() {
        return nome + " diz auau!";
    }
}

class Papagaio implements Falante {


        @Override
    public String falar() {
        return "Olá";
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Animais!");
        Falante bichos[] = {
                new Gato("Felix"),
                new Gato("Garfield"),
                new Gato("Mingau"),
                new Cachorro("Pluto"),
                new Cachorro("Xuxucão"),
                new Cachorro("Monicão"),
                new Cachorro("Bidu")
        };

        for (int i = 0; i < bichos.length; i++) {
            System.out.println(bichos[i].falar());
        }

        System.out.println(bichos[0] instanceof Gato);
        System.out.println(bichos[0] instanceof Cachorro);
        System.out.println(bichos[0] instanceof Falante);
        System.out.println(bichos[0] instanceof Object);

    }
}