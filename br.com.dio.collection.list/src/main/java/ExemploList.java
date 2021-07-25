import java.sql.SQLOutput;
import java.util.*;

public class ExemploList {
    public static void main(String[] args) {
//Dada uma lista com 7 notas de um aluno [7,8.5,9.3,5,7,0,3.6], faca:

//    List notas = new ArrayList(); //antes do java 5
//    List<Double> notas = new ArrayList<>();//Generics (jdk5) - Diamont Operator
//    ArrayList<Double> notas = new ArrayList<>(); //não é muito recomendável
//    List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 8d, 3.6));
//      List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 8d, 3.6);
//      notas.add(10d); //não pode ser modificada
//      System.out.println(notas);
//
        System.out.println("Crie uma lista e adicione sete notas:");


        List<Double> notas = new ArrayList<>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(8.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5.0));

        System.out.println("Adicione na Lista a nota 8.0 na posicao 4: ");
        notas.add(4, 8d);

        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        System.out.println("confira se a nota 5.0 está na lista:" + notas.contains(5d));

        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        for(Double nota: notas) System.out.println(nota);

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator1 = notas.iterator();
        Iterator<Double> iterator = iterator1;
        Double soma = 0d;
        while(iterator.hasNext()){
            double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 3.6: ");
        notas.remove(3.6);
        System.out.println(notas);

        System.out.println("Remova a nota na posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator2 = notas.iterator();
        while(iterator2.hasNext()){
            Double next = iterator2.next();
            if(next < 7) iterator2.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista");
        notas.clear();

        System.out.println(notas);

        System.out.println("Confira se a Lista está vazia: " + notas.isEmpty());

        List <Double> notas2 = new LinkedList<>();
        notas2.add(7.0);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5.0);
        notas2.add(7.0);
        notas2.add(8.0);
        notas2.add(3.6);

        System.out.println("Mostre a primeira nota da nova Lista sem removê-la: " + notas2.get(0));

        System.out.println("Mostre a primeira nota da nova lista removendo-a: " + notas2.remove(0));
        System.out.println(notas2);







    }
}
