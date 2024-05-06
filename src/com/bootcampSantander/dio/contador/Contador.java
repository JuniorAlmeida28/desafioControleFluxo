package com.bootcampSantander.dio.contador;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.bootcampSantander.dio.contador.exceptions.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        
        System.out.println("Digite o primeiro parametro:");
        int parametroUm = en.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = en.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } 
        catch(InputMismatchException e){
            System.out.println("Inserir apenas números inteiros!");
        }
        catch(ParametrosInvalidosException e){
            System.out.println(e);
        }
        finally{
            System.out.println("O programa foi finalizado!");
        }


        en.close();
    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }
		
		//realizar o for para imprimir os números com base na variável contagem
		int contagem = parametroDois - parametroUm;
        int contagemDeRepeticoes = 0;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
            contagemDeRepeticoes++;
        }
        System.out.println("O loop foi executado " + contagemDeRepeticoes + " vezes!");
	}
}
