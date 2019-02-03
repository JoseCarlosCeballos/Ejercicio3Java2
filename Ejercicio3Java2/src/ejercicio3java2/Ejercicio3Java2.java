/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3java2;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM 1
 */
public class Ejercicio3Java2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x[] = new int[10];
        int y[] = new int[10];
        int z;
        int cont;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < x.length; i++) {

            x[i] = i + 1;
            System.out.println("Introduce el elemento " + (i + 1) + " :");
            z = sc.nextInt();
            x[i] = z;

        }
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + i + "\t ");
        }

        System.out.println("");

        for (int i = 0; i < 10; i++) {
            System.out.print(" " + x[i] + "\t ");
        }
        System.out.println("\nEl array con los primos primero es: ");

//        ----------------------------------------------------------------------------------------;
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + i + "\t ");
        }

        System.out.println("");

        cont = 0;
        
        for (int i = 1; i <= x[i]; i++) 
        {
            if((x[i] % i) == 0)
            {
            cont++;
            }
        }
        if(cont <= 2)
        {
        for (int j = 0; j < 10; j++) {
            System.out.print(" " + x[j] + "\t ");
        }
        }else{
        for (int k = 0; k < 10; k++) {
            System.out.print(" " + x[k] + "\t ");
        }
        }
        
    }
}
