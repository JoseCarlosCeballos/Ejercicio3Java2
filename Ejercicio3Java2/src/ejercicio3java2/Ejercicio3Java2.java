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
        int x []= new int [10];
        int y []= new int [10];
        int z;
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < x.length; i++) {
            
            x[i] = i + 1;
           System.out.println("Introduce el elemento "+(i+1)+" :");
           z = sc.nextInt();
           x[i]=z;       
                       
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(" "+i+ "\t ");        
        }
        
        System.out.println("");
        
        for (int i = 0; i < 10; i++) {
            System.out.print(" "+x[i]+ "\t ");
        }
        System.out.println("\nEl array con los primos primero es: ");
        
        
        
    }
    
}
