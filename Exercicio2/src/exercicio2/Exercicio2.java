/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.Scanner;

/**
 *
 * @author Gabriel Leme
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = 1;
        while (res > 0) {
            System.out.println("Enter with a number: ");
            res = sc.nextInt();
            if (verificaPrimo(res)) {
                System.out.println(res + " is a prime number.");
            }
        }
    }

    public static boolean verificaPrimo(int number) {
        int primeNumber = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                primeNumber++;
            }
        }
        return primeNumber == 2;
    }

}
