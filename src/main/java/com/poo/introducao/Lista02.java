package com.poo.introducao;

import java.util.Scanner;

public class Lista02 {
    void ex01(){
        System.out.println("Digite um número: ");
        Scanner sc = new Scanner(System.in);
        int numeroDigitado = sc.nextInt();
        
        if (numeroDigitado != 0){
            if ((numeroDigitado % 2) == 0){
                System.out.println("O número " + numeroDigitado + " é par.");
            }else{
                System.out.println("O número " + numeroDigitado + " é ímpar.");
            }
        }else{
            System.out.println("O número é zero.");
        }
    }void ex02(){
        
        System.out.println("Digite um número: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Digite outro número: ");
        Scanner sc1 = new Scanner(System.in);
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println("O número " + num1 +
             " é maior que o número " + num2);

        }else if (num1 == num2){
            System.out.println("Os números são iguais.");

        }else{
            System.out.println("O número " + num2 +
             " é maior que o número " + num1);
        }
    }
}
