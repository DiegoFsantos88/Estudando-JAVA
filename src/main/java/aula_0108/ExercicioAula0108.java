package aula_0108;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


enum EstacoesDoAno {
    VERAO,
    OUTONO,
    INVERNO,
    PRIMAVERA
}


public class Exercicio0108 {

    public static Double media(List<Double> numeros) {
        Double total = 0.0;
        for(Double n : numeros) {
            total += n;
        }
        return (total / numeros.size());
    }

    public static boolean isPrimo(int n) {
        boolean primo = true;
        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                primo = false;
            }
        }
        return primo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Crie um programa que receba 5 números do usuário e armazene-os em uma lista. Em seguida, exiba o maior
//        e o menor número da lista.
//        List<Integer> numeros = new ArrayList<Integer>();
//        for(int i = 0; i < 5; i++) {
//            System.out.println("Digite um número:");
//            numeros.add(scanner.nextInt());
//        }
//        Integer maior = Collections.max(numeros);
//        Integer menor = Collections.min(numeros);
//        System.out.println("O maior numero é " + maior);
//        System.out.println("O menor numero é " + menor);


//        Implemente um método que receba uma lista de números e retorne a média aritmética dos elementos presentes
//        na lista.
//        List<Double> numeros = new ArrayList<Double>(List.of(4.0, 5.0, 7.0, 9.0, 6.0, 2.0));
//        System.out.println("A media dos numeros é " + media(numeros));

//        Escreva um programa que calcule e exiba a data daqui a três semanas a partir da data atual.
//        LocalDate agora = LocalDate.now();
//        LocalDate futuro = agora.plusWeeks(3);
//        System.out.println(futuro);

//        Escreva um método que receba um número inteiro e retorne verdadeiro se ele for primo e falso caso contrário.
//        System.out.println("Digite um numero:");
//        int n = scanner.nextInt();
//        if(isPrimo(n)) {
//            System.out.println("É primo");
//        }
//        else {
//            System.out.println("Não é primo");
//        }

//        Crie um enum chamado EstacoesDoAno com os valores representando as estações do ano (Verão, Outono, Inverno e
//        Primavera). Escreva um programa que receba o mês atual do usuário e informe a estação do ano correspondente.
//        System.out.println("Digite o mês do ano (1-12):");
//        int mes = scanner.nextInt();
//        switch (mes) {
//            case 1:
//            case 2:
//            case 3:
//                System.out.println(EstacoesDoAno.VERAO);
//                break;
//            case 4:
//            case 5:
//            case 6:
//                System.out.println(EstacoesDoAno.OUTONO);
//                break;
//            case 7:
//            case 8:
//            case 9:
//                System.out.println(EstacoesDoAno.INVERNO);
//                break;
//            case 10:
//            case 11:
//            case 12:
//                System.out.println(EstacoesDoAno.PRIMAVERA);
//                break;
//        }
    }
}