package com.poo.introducao;

import java.io.IOException;
import java.util.Scanner;

public class Lista03 {
    public void ex01(){}

    public void ex02(){
        int numero;

        System.out.println("Digite um número para saber a tabuada: ");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();

        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
        int resultado = numero * i;
        System.out.println(numero + " x " + i + " = " + resultado);
        }
        sc.close();
    }

    public void ex03(){
        int num1;
        int num2;

        System.out.println("Digite o primeiro número: ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = sc.nextInt();

        System.out.println("Números pares entre " + num1 + " e " + num2 + ": ");
        for (int i = num1; i <= num2; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }          
        }
        sc.close();
    }
    public void ex04(){
        int numeroEscolhido;
        int palpite;

        System.out.println(" -- -- Jogo de Adivinhação -- -- ");
        System.out.println("Digite um número entre 0 e 20 e convide um amigo adivinhar.");
        Scanner sc = new Scanner(System.in);
        numeroEscolhido = sc.nextInt();
        // limparTela();

        System.out.println("Digite o seu palpite:");
        palpite = sc.nextInt();

        while (palpite != numeroEscolhido) {
            System.out.print("Digite outro número: ");
               
            if (palpite < numeroEscolhido) {
                System.out.println("Muito baixo! Tente novamente.");
                break;
            } else if (palpite > numeroEscolhido) {
                System.out.println("Muito alto! Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou!");
            }
        }
        // sc.close();
    }
    // public static void limparTela() {
    // try {
    //     if (System.getProperty("os.name").contains("Windows")) {
    //         new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    //     } else {
    //         new ProcessBuilder("clear").inheritIO().start().waitFor();
    //     }
    // } catch (IOException | InterruptedException e) {
    //     e.printStackTrace();
    // }

    public void ex05(){

    }

}