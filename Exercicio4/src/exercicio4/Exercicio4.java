/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

import java.util.Scanner;

/**
 *
 * @author Gabriel Leme
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[7];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter with " + i + "° number: ");
            numbers[i] = sc.nextInt();
        }

        // order in which they were inserted
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // decreasing
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

    }

}
