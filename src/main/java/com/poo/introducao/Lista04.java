package com.poo.introducao;

public class Lista04 {

    public void ex01(){
        double[]vendas = {3.50, 7.00, 9.25, 10.00, 8.00};
        double soma = 0;

        for(int i=0; i<=4; i++){
            soma += vendas[i];
        }
        System.out.println("O total de vendas do dia é: " + soma);
    }

}
