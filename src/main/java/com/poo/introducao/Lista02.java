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
    void ex02(){
        
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
    void ex03(){
        String resposta1;
        String resposta2;
        String resposta3;

        System.out.println(" Olá, bem vindo!");
        System.out.println("Vamos te direcionar para o atendimento certo, responta as perguntas:");
        System.out.println("Você tem mais que 65 anos? S ou N");
        Scanner sc = new Scanner(System.in);
        resposta1 = sc.nextLine();

        if (resposta1.equalsIgnoreCase("s")) {
            System.out.println("Siga para fila preferencial.");
        }else{
            System.out.println("Você é gestante? S ou N");
            Scanner sc1 = new Scanner(System.in);
            resposta2 = sc1.nextLine();
            if (resposta2.equalsIgnoreCase("s")) {
                System.out.println("Siga para a fila preferencial.");
            }else{
                System.out.println("Você possui alguma deficiência? S ou N");
                Scanner sc2 = new Scanner(System.in);
                resposta3 = sc2.nextLine();
                if (resposta3.equalsIgnoreCase("s")) {
                    System.out.println("Siga para a fila preferencial.");
                }else{
                    System.out.println("Siga para a fila Comum.");
                }    
            }
        }
    }
}
