package aula_1608.interfaces;

public class Main {

    public static void mostrarAreaForma(Forma forma) {
        System.out.println("Area " + forma.calculaArea());
        System.out.println("Perimetro " + forma.calculaPerm());
    }

    public static void main(String[] args) {

        Forma quadrado = new Quadrado(6);
        Forma triangulo = new Triangulo(8, 6);
        Forma circulo = new Circulo(4);

        mostrarAreaForma(quadrado);
        mostrarAreaForma(triangulo);
        mostrarAreaForma(circulo);
    }
}

// Encapsulamento -> Uso de moficidores para "esconder" os propriedades e métodos (Método Get e Set)
// Herança -> Capacidade de uma classe de herdar os atributos e métodos de outra classe
// Polimorfismo -> Classes que podem assumir diversas formas
// Abstração -> Classes Abstratas e Interfaces (Polimorfismo)