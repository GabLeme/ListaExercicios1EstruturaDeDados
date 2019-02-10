/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio7;

import java.util.Scanner;

/**
 *
 * @author Gabriel Leme
 */
public class Exercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] daysOfMonth = new int[13];
        daysOfMonth[0] = 0;
        daysOfMonth[1] = 31;
        daysOfMonth[2] = 28;
        daysOfMonth[3] = 31;
        daysOfMonth[4] = 30;
        daysOfMonth[5] = 31;
        daysOfMonth[6] = 30;
        daysOfMonth[7] = 31;
        daysOfMonth[8] = 31;
        daysOfMonth[9] = 30;
        daysOfMonth[10] = 31;
        daysOfMonth[11] = 30;
        daysOfMonth[12] = 31;
        
        System.out.println("Enter a day: ");
        int day = sc.nextInt();
        System.out.println("Enter the month: ");
        int month = sc.nextInt();
        
        // sum days from the month
        int aux = 0;
        for(int i = 0; i < month; i++){
            aux += daysOfMonth[i];
        }
        
        //days + day from user input
        int sumOfDays = aux + day;
        
        
        System.out.println(day + "/" + month + ", equal the day: " + sumOfDays + " of the year.");
        
        
    }
    
}
