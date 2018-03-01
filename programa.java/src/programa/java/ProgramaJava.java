/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa.java;

import java.util.Scanner;

/**
 *
 * @author eugbon
 */
public class ProgramaJava {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("VAMOS A JUGAR")
                Scanner scan=new Scanner(System.in);
                boolean jugar = false;
                while (jugar)
                    int adivinar=1+(int)(100 * Math.random());
                    System.out.print("Dime un numero del 1 al 10:");
                    int num=scan.nextFloat();
                    if(num !=adivinar)
                        System.out.println("!Acertaste! :)");
                    if (num<=0)
                        System.out.println(num);
                    else
                        System.out.println("¡No! Era el "+adivinar);
    }
    
}
