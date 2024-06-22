package com.poo.introducao;

import java.io.IOException;
import java.util.Scanner;

public class Lista03 {
    public static void limparTela(){
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } 
        catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void ex01(){

        int num;
        boolean respostaErrada = true;

        do{
            System.out.println("Defina o tempo do cronômetro em segundos: ");
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();

            if(num >= 1 && num <= 59){
                respostaErrada = false;
            }else{
                System.out.println("valor inválido");
            }
            sc.close();

        }while (respostaErrada);

        for(int i = num; i >= 0 ; i--){
            System.out.println(i);
            
            try{
                Thread.sleep(1000);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
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
        limparTela();
  
        do{
            System.out.println("Digite o seu palpite:");
            palpite = sc.nextInt();

            if (palpite == numeroEscolhido) {
                System.out.println("Parabéns! Você acertou!");
            }
            else{
                if (palpite < numeroEscolhido) {
                System.out.println("Muito baixo! Tente novamente.");
                }
                else {
                    System.out.println("Muito alto! Tente novamente.");
                }
            }
        } 
        while(palpite != numeroEscolhido);
        sc.close();
    }
    public void ex05(){
       
        String login = "Flavia";
        String senha = "1234";
        String loginDigitado;
        String senhaDigitada;
        int tentativas = 3;
        boolean respostaErrada= false;

        do{
            System.out.println("Preencha seu Login");
            System.out.println("Login: ");
            Scanner sc = new Scanner(System.in);
            loginDigitado = sc.nextLine();

            System.out.println("Senha: ");
            senhaDigitada = sc.nextLine();

            if ((login.equals(loginDigitado)) && (senha.equals(senhaDigitada))) {
                System.out.println("Bem vindo!");
                respostaErrada = true;
            }else{
                tentativas--;
                if (!(login.equals(loginDigitado)) && !(senha.equals(senhaDigitada))) {
                    System.out.println("Login e senha incorretos!");
                }else if (!login.equals(loginDigitado)) {
                    System.out.println("Login incorreto!");
                }else{
                    System.out.println("Senha incorreta!");
                }
            }
            sc.close();
        }while(tentativas > 0 && respostaErrada);
    }
    public void ex06(){
        
        int andares;

        System.out.println("Quantos andares? ");
        Scanner sc = new Scanner(System.in);
        andares = sc.nextInt();

        for(int i = 1; i<=andares; i++){
            for(int k=1; k<=(andares-i); k++){
                System.out.print(" ");
            }
            for(int j = 1; j<=i*2-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
    public void ex07(){

        int largura;
        int altura;

        System.out.println("Qual largura do retangulo?");
        Scanner sc = new Scanner(System.in);
        largura = sc.nextInt();

        System.out.println("Qual altura do retangulo?");
        altura = sc.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                System.out.print("*");
            }
            System.out.println();
        }  
        sc.close();
    }
    
}