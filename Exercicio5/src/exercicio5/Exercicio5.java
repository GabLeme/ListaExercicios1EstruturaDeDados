/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

import java.util.Scanner;

/**
 *
 * @author Gabriel Leme
 */
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[10];

        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter with the " + i + "° name: ");
            names[i] = sc.next();
        }

        System.out.println("Type a name: ");
        String name = sc.next();

        int index = 0;
        for (int i = 0; i < names.length; i++) {
            if(names[i].equals(name)){
                index = i;
                System.out.println("index: " + index);
            }
        }

    }

}
