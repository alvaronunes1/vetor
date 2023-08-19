package br.newton.paiva.exercicio;

import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int [] num = new int [5];
        int aux;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número para a posição " +i);
            num[i] = ler.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (num[j] > num[j + 1]) {
                    aux = num[j];
                    num[j] = num[j+1];
                    num[j+1] = aux;
                }
            }
        }

        System.out.println("Vetor ordenado");
        for (int i = 0; i < 5; i++) {
            System.out.println(num[i]);
        }
    }
}
