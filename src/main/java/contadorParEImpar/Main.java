package contadorParEImpar; /**
 * "Escreva um programa que leia um conjunto de números..."
 * ( 1- quando o enunciado diz que o programa deve ler significa que o número vai ser definido pelo usuário;
 * 2- como se trata de um CONJUNTO, então precisaremos de um loop)
 *
 * "... e imprima a quantidade de números pares..."
 * (1 - precisaremos de uma condicional para verificar se o número é par;
 * 2- precisaremos armazenar a soma da quantidade de números pares em uma variável;
 * 3- precisamos mostrar na tela o total de números pares digitados)
 *
 * "... e imprima a quantidade de números ímpares..."
 * (1 - precisaremos de uma condicional para verificar se o número é ímpar;
 *  2- precisaremos armazenar a soma da quantidade de números ímpares em uma variável - que não pode ser a mesma
 *  dos números pares, pois queremos as quantidades de forma separada e não o total de números;
 *  3- precisamos mostrar na tela o total de números ímpares digitados)
 *
 * "...Assuma que o valor -1 representa o fim da entrada de dados..."
 * (1- o loop finaliza quando o usuário digita -1;
 * 2- só devemos verificar se o número é par ou ímpar, caso ele seja diferente de -1)
 */
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        int numeroEntrada = 0, par = 0, impar = 0, resto; // declaração de variáveis
        Scanner sc = new Scanner(System.in);

        while (numeroEntrada != -1) { // escolha do loop e condição de parada
            System.out.println("Digite um número: "); // entrada de dados do usuário
            numeroEntrada = sc.nextInt(); // armazenamento do dado digitado pelo usuário em uma variável

            if (numeroEntrada != -1) { // condição para execução do bloco de código - só entra se a condição for true (verdadeira)
                resto = numeroEntrada % 2; // armazenamento do resto da divisão do número digitado pelo usuário por 2
                if (resto == 0) { //condição que verifica se o o número digitado pelo usuário é par - só entra se o resto for igual a zero
                    par++; // atribuição de +1 número a variável par (sempre de 1 em 1)
                } // fim do segundo if
                else { //condição contrária/ ou exceção da condição anterior ( se não for 0, entra aqui)
                    impar++;  // atribuição de +1 número a variável ímpar (sempre de 1 em 1)
                } // fim do else
            } // fim do primeiro if
        } //fim do loop

        System.out.println("A quantidade de números pares digitadas pelo usuário foi: " + par); // mostra na tela o total de números pares
        System.out.println("A quantidade de números ímpares digitadas pelo usuário foi: " + impar); // mostra na tela o total de números ímpares
    } // fim do método main
}// fim da classe Main
