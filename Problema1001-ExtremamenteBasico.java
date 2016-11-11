/*
Problema: 1001 - Extremamente B�sico

Leia 2 valores inteiros e armazene-os nas vari�veis A e B. Efetue a soma de A e B atribuindo o seu resultado na vari�vel X. Imprima X conforme exemplo apresentado abaixo. N�o apresente mensagem alguma al�m daquilo que est� sendo especificado e n�o esque�a de imprimir o fim de linha ap�s o resultado, caso contr�rio, voc� receber� "Presentation Error".
*Entrada

A entrada cont�m 2 valores inteiros.
Sa�da

Imprima a vari�vel X conforme exemplo abaixo, com um espa�o em branco antes e depois da igualdade. Obs: O X est� em mai�sculo e deve ter um espa�o antes e um espa�o depois do sinal de igualdade.

*/
import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        int X = scn.nextInt();
        int Y = scn.nextInt();
        System.out.println("X = " + (X+Y));
    }
 
}