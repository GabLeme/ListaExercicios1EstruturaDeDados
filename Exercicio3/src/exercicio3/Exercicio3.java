/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Gabriel Leme
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.ENGLISH);
        
        double maxNote = 0;
        double minNote = 10;

        System.out.println("Enter with a number betwen three and ten: ");
        int response = sc.nextInt();
        while (response < 3 || response > 10) {
            System.out.println("Error, enter again: ");
            response = sc.nextInt();
        }

        for (int i = 0; i < response; i++) {
            double noteOne = 0;
            double noteTwo = 0;
            double average = 0;

            System.out.println("Enter with note one: ");
            noteOne = sc.nextDouble();

            System.out.println("Enter with note two: ");
            noteTwo = sc.nextDouble();

            average = calcAverage(noteOne, noteTwo);

            System.out.println("Average: " + average);
            if (average >= 5) {
                System.out.println("approved");
            } else {
                System.out.println("disapproved");
            }

            if (average > maxNote) {
                maxNote = average;
            }
            if (average < minNote) {
                minNote = average;
            }

        }
        
        System.out.println("lowest note: " + minNote);
        System.out.println("higher note: " + maxNote);
    }

    public static double calcAverage(double noteOne, double noteTwo) {
        return noteOne * 0.4 + noteTwo * 0.6;
    }

}
