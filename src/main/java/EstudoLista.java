import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EstudoListas {

    public static void main(String[] args) {
//        vetor -> inflexivel
//        lista -> flexivel

        // generic -> <String>
        List<Integer> numeros = new ArrayList<Integer>(); // compativel
        numeros.add(9); // adiciona um elemento no final da lista
        numeros.add(4);
        numeros.add(5);
        numeros.add(8);

        System.out.println(numeros.get(2)); // obter o elemento com base no indice
        numeros.remove(2); // remover/apagar o elemento com base no inidice
        System.out.println(numeros.get(2));
        numeros.add(2, 5); // adiciona o elemento no indice especificado
        System.out.println(numeros.get(2));

        for (int i = 0; i < numeros.size(); i++) {
            System.out.print(numeros.get(i));
        }

        System.out.println(); // quebra de linha

        for (Integer numero : numeros) {
            System.out.print(numero);
        }
        System.out.println(); // quebra de linha

        Collections.sort(numeros); // ordernar os numeros

        // imprimir lista ordenada
        for (Integer numero : numeros) {
            System.out.print(numero);
        }

        System.out.println(); // quebra de linha

        List<String> nomesList = List.of("Sky", "Leonardo", "Ludmila", "Gabriel");
        List<String> nomes = new ArrayList<String>(nomesList);
        Collections.sort(nomes); // ordenar
        // imprimir lista ordenada
        for (String nome : nomes) {
            System.out.print(nome + " ");
        }

//        Wrapper -> Represatação de tipo primitivo como Objeto
//        Integer int
//        Double double
//        Boolean boolean
//        Long long
//        Float float
    }
}