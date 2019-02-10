/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio9;

import java.util.Scanner;

/**
 *
 * @author Gabriel Leme
 */
public class Exercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] cars = new String[5];
        int[] kilometer = new int[5];

        for (int i = 0; i < cars.length; i++) {
            System.out.println("Enter the name of car: ");
            cars[i] = sc.next();
            System.out.println("Kilometer: ");
            kilometer[i] = sc.nextInt();
        }

        int economic = kilometer[0];
        int index = 0;
        for (int i = 0; i < kilometer.length; i++) {
            if (kilometer[i] < economic) {
                economic = kilometer[i];
                index = i;
            }
        }

        System.out.println("Economic: \n"
                + cars[index] + ", " + kilometer[index]);

    }

}
