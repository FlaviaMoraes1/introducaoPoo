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
    }
}
