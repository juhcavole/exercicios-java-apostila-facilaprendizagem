package com.company;

public class Main {

    public static void main(String[] args) {

        int d = 4;
        System.out.println(d++); // = 4 imprimir d e então incrementar 1

        d = 4;
        System.out.println(++d); //5 incrementar 1 e imprimir d

        d = 4;
        System.out.println(d--); //4 imprimir d e depois diminuir 1

        d = 4;
        System.out.println(--d);//3 diminuir 1 e depois imprimir d

        int result = 10;
        result = result + 1;
        System.out.println(result);//11

        result = 10;
        result++;
        System.out.println(result); //11

        result = 10;
        result += 1;
        System.out.println(result);// = 11
    }
}
