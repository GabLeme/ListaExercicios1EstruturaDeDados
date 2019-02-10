/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

import java.util.Scanner;

/**
 *
 * @author Gabriel Leme
 */
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int response = 0;
        while (response != 4) {
            System.out.println("Choose a exercise: ");
            response = sc.nextInt();
            switch (response) {
                case 1:
                    one();
                    break;
                case 2:
                    two(sc);
                    break;
                case 3:
                    three(sc);
                    break;
            }
        }
    }

    public static void one() {
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void two(Scanner sc) {
        int i = 0;
        double sum = 0;
        while (i < 10) {
            System.out.println("Enter with " + i + "° number: ");
            double response = sc.nextDouble();
            sum += response;
            i++;
        }
        System.out.println("Sum: " + sum);
    }

    public static void three(Scanner sc) {
        double response;
        int pair = 0;

        do {
            System.out.println("Enter with a number: ");
            response = sc.nextDouble();
            if (response % 2 == 0) {
                pair++;
            }

        } while (response > 0);
        System.out.println("Pair numbers: " + pair);
    }

}
