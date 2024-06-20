package com.poo.introducao;

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
    }
}