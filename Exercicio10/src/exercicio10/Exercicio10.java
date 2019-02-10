/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio10;

import java.util.Scanner;

/**
 *
 * @author Gabriel Leme
 */
public class Exercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetOne = new int[5];
        int[] vetTwo = new int[5];
        int[] vetThree = new int[10];

        for (int i = 0; i < vetOne.length; i++) {
            System.out.println("Enter a number: ");
            vetOne[i] = sc.nextInt();
        }

        for (int i = 0; i < vetTwo.length; i++) {
            System.out.println("Enter a number: ");
            vetTwo[i] = sc.nextInt();
        }

        orderAsc(vetOne);
        orderAsc(vetTwo);

        // ordered arrays
        System.out.println("Array One: ");
        for (int i = 0; i < vetOne.length; i++) {
            System.out.print(vetOne[i] + ", ");
        }

        System.out.println();

        System.out.println("Array Two: ");
        for (int i = 0; i < vetTwo.length; i++) {
            System.out.print(vetTwo[i] + ", ");
        }

//        for (int i = 0; i < 5; i++) {
//            vetThree[i] = vetOne[i];
//        }
//
//        for (int i = 5; i < 10; i++) {
//            for (int j = 0; j < 5; j++) {
//                vetThree[i] = vetTwo[j];
//            }
//        }
//
//        orderAsc(vetThree);
//
//        System.out.println();
//
//        // final Array
//        System.out.println("Final array");
//        for (int i = 0; i < vetThree.length; i++) {
//            System.out.print(vetThree[i] + ", ");
//        }
    }

    // order array
    public static void orderAsc(int elements[]) {
        int cont1, cont2, aux;
        for (cont1 = 0; cont1 < elements.length; cont1++) {
            for (cont2 = 0; cont2 < elements.length - 1; cont2++) {
                if (elements[cont2] > elements[cont2 + 1]) {
                    aux = elements[cont2];
                    elements[cont2] = elements[cont2 + 1];
                    elements[cont2 + 1] = aux;
                }
            }
        }
    }

}
