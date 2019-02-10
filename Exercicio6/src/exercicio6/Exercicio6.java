/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio6;

import java.util.Scanner;

/**
 *
 * @author Gabriel Leme
 */
public class Exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter with a number: ");
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }

        int average = sum / numbers.length;
        System.out.println("Average: " + average);

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > average){
                System.out.println("is higher: " + numbers[i]);
            }
        }

    }

}
