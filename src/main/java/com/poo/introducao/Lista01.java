package com.poo.introducao;

import java.util.Scanner;

public class Lista01 {
    public void ex01(){
        int num1;
        int num2;
        int res;

        System.out.println("Digite um número: ");
        Scanner sc = new Scanner(System.in);

        num1 = sc.nextInt();

        System.out.println("Digite outro número: ");

        num2 = sc.nextInt();

        res = num1 + num2;

        System.out.println("A soma dos números é:  " + res);

    }
    public void ex02(){

        String nome;
        String sobrenome;

        System.out.println("Qual o seu nome? ");
        Scanner sc1 = new Scanner(System.in);
        nome = sc1.nextLine();
        
        System.out.println("Qual o seu sobrenome? ");
        Scanner sc2 = new Scanner(System.in);
        sobrenome = sc2.nextLine();

        System.out.println("Olá, " + nome +sobrenome);
    }
}
