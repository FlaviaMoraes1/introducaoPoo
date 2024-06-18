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

        System.out.println("Olá, " + nome + " " + sobrenome);
    }
    public void ex03(){
        
       double valorAConverter;
       double valorConvertido;

       System.out.println("Digite um valor para converter em dólar: ");
       Scanner sc3 = new Scanner(System.in);
       valorAConverter = sc3.nextDouble();
       
       valorConvertido = valorAConverter / (5.25);

       System.out.println("O valor convertido é de: " + valorConvertido + " dólar(es)");
    }
    public void ex04(){
        int numeroDigitado;
        int antecessor;
        int sucessor;

        System.out.println("Digite um número inteiro para saber o antecessor e o sucessor: ");
        Scanner sc4 = new Scanner(System.in);

        numeroDigitado = sc4.nextInt();

        antecessor = numeroDigitado - 1;
        sucessor = numeroDigitado + 1;
        System.out.println("O antecessor é " + antecessor + " e o seucessor é " + sucessor);
    }
    public void ex05(){
        float larguraTerreno;
        float comprimentoTerreno;
        float area;
        double valorM2;

        System.out.println("Qual a largura do terreno em metros? ");
        Scanner sc5 = new Scanner(System.in);
        larguraTerreno = sc5.nextFloat();

        System.out.println("Qual o comprimento do terreno em metros? ");
        Scanner sc6 = new Scanner(System.in);
        comprimentoTerreno = sc6.nextFloat();

        area = larguraTerreno * comprimentoTerreno;

        System.out.println("Qual o valor do m2 na região em R$? ");
        Scanner sc7 = new Scanner(System.in);
        valorM2 = sc7.nextDouble();

        System.out.println("O valor total do terreno é: R$ " + valorM2 * area);
    }
    public void ex06(){
        int distanciaPercorrida;
        double totalCombustivel;
        double custoCombustivel = 6.39;

        System.out.println("Qual a distancia percorrida? ");
        Scanner sc8 = new Scanner(System.in);
        distanciaPercorrida = sc8.nextInt();

        System.out.println("Qual o valor total do combustível? ");
        Scanner sc9 = new Scanner(System.in);
        totalCombustivel = sc9.nextDouble();

        System.out.println("Sua autonomia foi de " + (distanciaPercorrida/(totalCombustivel/custoCombustivel)) + " KM/L.");
    }
    public void ex07(){
        float nota1;
        float nota2;
        float nota3;
        float nota4;
        float mediaNotas;

        System.out.println("Digite a nota do primeiro bimeste: ");
        Scanner sc10 = new Scanner(System.in);
        nota1 = sc10.nextFloat();
        System.out.println("Digite a nota do segundo bimeste: ");
        Scanner sc11 = new Scanner(System.in);
        nota2 = sc11.nextFloat();
        System.out.println("Digite a nota do terceiro bimeste: ");
        Scanner sc12 = new Scanner(System.in);
        nota3 = sc12.nextFloat();
        System.out.println("Digite a nota do quarto bimeste: ");
        Scanner sc13 = new Scanner(System.in);
        nota4 = sc13.nextFloat();

        mediaNotas = (nota1+nota2+nota3+nota4)/4;

        System.out.println("Sua média é: " + mediaNotas);
    }
    public void ex08(){
        double temperaturaFahrenheit;
        double temperaturaCelsius;

        System.out.println("Digite a temperatura em Fahrenheit que deseja converter: ");
        Scanner sc14 = new Scanner(System.in);
        temperaturaFahrenheit = sc14.nextDouble();

        temperaturaCelsius = (temperaturaFahrenheit - 32) / 1.8;
        
        System.out.println(temperaturaFahrenheit + " oF corresponde a " + temperaturaCelsius + " oC");
    }
}