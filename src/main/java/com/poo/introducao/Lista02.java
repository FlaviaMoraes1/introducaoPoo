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
        sc.close();
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
        sc.close();
        sc1.close();
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
                sc2.close();
            }
            sc1.close();
        }
        sc.close();
    }
    void ex04(){
        int idade;
        System.out.println("Digite a sua idade: ");
        Scanner leia = new Scanner(System.in);
        idade = leia.nextInt();

        if (idade >= 18){
            System.out.println("Pode entrar!");
        }else if (idade < 18 && idade >= 16) {
            System.out.println("Somente acompanhado.");
        }else{
            System.out.println("Não pode entrar!");
        }
        leia.close();
    }
    void ex05(){
        String senha = "1234";
        String login = "flavia";
        String loginDigitado;
        String senhaDigitada;

        System.out.println("Digite credenciais:");
        System.out.println("Login:");
        Scanner sc = new Scanner(System.in);
        loginDigitado = sc.nextLine();

        System.out.println("Senha:");
        senhaDigitada = sc.nextLine();

        if ((login.equals(loginDigitado)) && (senha.equals(senhaDigitada))){
            System.out.println("Bem vindo!");
        } else {
            if (!(login.equals(loginDigitado)) && !(senha.equals(senhaDigitada))) {
                System.out.println("Login e senha incorretos!");
            } else if (!senha.equals(senhaDigitada)){
                System.out.println("Senha incorreta!");
            }else{
                System.out.println("Login incorreto!");
            }
        }    
    }
    void ex06(){
        double nota1;
        double nota2;
        double recuperacao;
        double media;
        double menorNota;
        double maiorNota;

        System.out.println("Digite a primeira nota: " );
        Scanner sc = new Scanner(System.in);
        nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: " );
        Scanner sc1 = new Scanner(System.in);
        nota2 = sc1.nextDouble();

        media = (nota1 + nota2)/2;

        if(media >= 6){
            System.out.println("Parabéns, você foi aprovado! " );
        }else{
            System.out.println("Recuperação! " );
            System.out.println("Digite a nota da recuperação: " );
            recuperacao = sc.nextDouble();

            if (nota1 > nota2) {
                maiorNota = nota1;
                menorNota = nota2;
            }else{
                maiorNota = nota2;
                menorNota = nota1;
            }
            if (recuperacao > menorNota) {
                media = (maiorNota + recuperacao) / 2;
            }
            if (media>=6) {
                System.out.println("Aprovado! Média:" + media );
            }else{
                System.out.println("Reprovado! Média:" + media );
            }            
        }
        sc.close();
        sc1.close();
    }
    void ex07(){
        int dividendo;
        int divisor;

        System.out.println("Digite um dividendo: ");
        Scanner sc = new Scanner(System.in);
        dividendo = sc.nextInt();

        System.out.println("Digite o divisor: ");
        divisor = sc.nextInt();

        if ((dividendo % divisor) == 0) {
            System.out.println(dividendo + " é divisivel por " + divisor);
        }
        sc.close();
    }
    void ex08(){
        String resposta1;
        String resposta2;
        String resposta3;
        String resposta4;
        String resposta5;
        int tentativas = 3;

        System.out.println(" -- Quiz sobre a Cidade de Petrópolis --");
        System.out.println("1) Qual o nome da Fazendo comprada por D. Pedro II para construir seu Palácio de Verão?");
        System.out.println("a) Fazenda do Padre Correia");
        System.out.println("b) Fazenda do Córrego Seco");
        System.out.println("c) Fazenda Engenhoca");
        Scanner sc = new Scanner(System.in);

        resposta1 = sc.nextLine();

        if (!resposta1.equals("b")) {
            tentativas--;
            System.out.println("Você errou, restam " + tentativas + " tentativas.");
        }

        System.out.println("2) A antiga casa de veraneio de D. Pedro II, hoje é...");
        System.out.println("a) O Museu Imperial");
        System.out.println("b) A Casa da Princesa Isabel");
        System.out.println("c) O Hotel Quitandinha");

        resposta2 = sc.nextLine();

        if (!resposta2.equals("a")) {
            tentativas--;
            System.out.println("Você errou, restam " + tentativas + " tentativas.");
        }

        System.out.println("3) Qual o santo padroeiro da cidade de Petrópolis?");
        System.out.println("a) São Jorge");
        System.out.println("b) Santo Antônio");
        System.out.println("c) São Pedro de Alcântara");

        resposta3 = sc.nextLine();

        if (!resposta3.equals("c")) {
            tentativas--;
            System.out.println("Você errou, restam " + tentativas + " tentativas.");
        }
        if (tentativas == 0) {
            System.out.println("Suas três tentativas terminaram, você perdeu!");
        } else {
            System.out.println("4) Qual a data da Fundação de Petrópolis?");
            System.out.println("a) 16 de março de 1840");
            System.out.println("b) 16 de março de 1843");
            System.out.println("c) 16 de março de 1845");

            resposta4 = sc.nextLine();

            if (!resposta4.equals("b")) {
                tentativas--;
                System.out.println("Você errou, restam " + tentativas + " tentativas.");
            }
            if (tentativas == 0) {
                System.out.println("Suas três tentativas terminaram, você perdeu!");
            } else {
                System.out.println("5) Última pergunta. Quem foi Paulo Barbosa da Silva?");
                System.out.println("a) Mordomo-Real de D. Pedro II");
                System.out.println("b) Engenheiro-Real de D. Pedro II");
                System.out.println("c) Amigo de D. Pedro II");

                resposta5 = sc.nextLine();

                if (!resposta5.equals("a")) {
                    tentativas--;
                    System.out.println("Você errou, restam " + tentativas + " tentativas.");
                }
                if (tentativas == 0) {
                    System.out.println("Suas três tentativas terminaram, você perdeu!");
                } else {
                    System.out.println("Parabéns, você sabe tudo sobre Petrópolis!");
                }
            }
        }
        sc.close();
    }
}
