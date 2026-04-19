
package analisadorDeNumero;

/**
 * Faça um programa que receba vários números positivos, calcule e mostre:
 * a) a soma dos números digitados;
 * b) a quantidade de números digitado;
 * c) a média dos números digitados;
 * d) o maior número digitado;
 * e) o menor número digitado;
 * f) a média dos números pares.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int qtdNumeros = 0;
        double somaPares = 0;
        int qtdPares = 0;
        double soma = 0;

        System.out.println("Digite um número para iniciar: ");
        int numeroEntrada = sc.nextInt();

        int maiorNumero = numeroEntrada;
        int menorNumero = numeroEntrada;

        if(numeroEntrada > 0) {
            qtdNumeros = 1;
            soma = numeroEntrada;

            if (numeroEntrada % 2 == 0) {
                qtdPares = 1;
                somaPares = numeroEntrada;
            }
        }

        double mediaNumeros;
        double mediaPares;

        while (numeroEntrada != -1){
            System.out.println("Digite um número positivo (ou -1 para encerrar): ");
            numeroEntrada = sc.nextInt();

            if(numeroEntrada > 0){
                soma = numeroEntrada + soma;
                qtdNumeros ++;

                if(numeroEntrada > maiorNumero){
                    maiorNumero = numeroEntrada;
                }

                if(menorNumero <= 0) {
                    menorNumero = numeroEntrada;
                }

                if(numeroEntrada < menorNumero){
                    menorNumero = numeroEntrada;
                }

                if(numeroEntrada % 2 == 0){
                    qtdPares ++;
                    somaPares = numeroEntrada + somaPares;
                }
            } else if(numeroEntrada < 1 && numeroEntrada != -1){
                System.out.println("Digite um número válido!");
            }
        }

        System.out.println("Finalizado.");

        System.out.println(" ");

        if(qtdNumeros > 0){
            System.out.println("O maior número digitado foi: " + maiorNumero);
            System.out.println("O menor número digitado foi: " + menorNumero);

            System.out.println(" ");

            System.out.println("A soma dos números digitados é: " + soma);
            System.out.println("A quantidade de números digitados é: " + qtdNumeros);
            mediaNumeros = soma / qtdNumeros;
            System.out.println("A média dos números digitados é: " + mediaNumeros);

            System.out.println(" ");

            if (qtdPares > 0){
                System.out.println("A soma dos números pares digitados é: " + somaPares);
                System.out.println("A quantidade de números pares digitados foi: " + qtdPares);
                mediaPares = somaPares / qtdPares;
                System.out.println("A média dos números pares digitados é: " + mediaPares);
            }
        }
    }
}