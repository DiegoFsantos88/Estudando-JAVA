package aula_1508.polimorfismo;

public class Main {

    public static void main(String[] args) {
        // classe Animal é abstrata portanto não pode ser instanciada.
        // Serve somente como modelo para suas classes filhas
//        Animal rato = new Animal("Rato", "Mus musculus", "Terrenos Baldios"); Inválido
//        System.out.println(rato.getNome());
//        System.out.println(rato.getEspecie());
//        System.out.println(rato.getHabitat());

        Gato gato0 = new Gato();
        Animal gato = new Gato();
        Animal cachorro = new Cachorro();
//        Animal animal = new Animal(); Inválido

        gato.emitirSom();
        cachorro.emitirSom();

        gato0.setCorPelo("Morrom");
        System.out.println(gato0.getCorPelo());
//        gato.setCorPelo("Pedrês"); Inválido
//        System.out.println(gato.getCorPelo()); Inválido
    }
}