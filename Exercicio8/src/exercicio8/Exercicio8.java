/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio8;

import java.util.Scanner;

/**
 *
 * @author Gabriel Leme
 */
public class Exercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter with a number: ");
            numbers[i] = sc.nextInt();
        }
        
        System.out.println("Type a number to search: ");
        int aux = sc.nextInt();
        
        int occurrence = 0;
        for(int n : numbers){
            if(n == aux)
                occurrence++;
        }
        
        if(occurrence > 0){
            System.out.println(aux + " pops up " + occurrence + " times");
        }
        
    }

}
