package br.newton.paiva.exercicio;

import java.util.Random;

public class Maior_Menor {
    public static void main(String[] args) {
        int [] vetor = new int [5];

        Random numerorandomico = new Random();
        int maxValue = Integer.MIN_VALUE; //ATRIBUI NA VARIAVEL O MENOR VALOR INTEIRO
        int minValue = Integer.MAX_VALUE; //ATRIBUI NA VARIAVEL O MAIOR VALOR INTEIRO

        for (int i = 0; i < 5; i++) {
            vetor[i] = numerorandomico.nextInt(999);
        }

        for (int i = 0; i < 5; i++) {
            if(vetor[i] > maxValue)
                maxValue=vetor[i];
            if(vetor[i] < minValue)
                minValue=vetor[i];
        }

        System.out.println("O maior valor é: " + maxValue);
        System.out.println("O menor valor é: " + minValue);

        System.out.println("Vetor randomico: ");

        for(int num:vetor)
            System.out.println(num);
    }
}
