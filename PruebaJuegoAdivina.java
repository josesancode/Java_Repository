/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema.pkg2;

import java.util.Scanner;

/**
 *
 * @author joses
 */
public class PruebaJuegoAdivina {

    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in); 
        System.out.println("Introduce un numero del 0 al 99");
     int NumeroUsuario = sc.nextInt();
        
     int NumeroPrograma = (int)(Math.random()*100); //numeros del 0 al 99
        System.out.println("El numero elegido por el programa es " + NumeroPrograma);
     
        
        System.out.println("Es mayor?: " + (NumeroUsuario > NumeroPrograma));
        System.out.println("Es menor?: " + (NumeroUsuario < NumeroPrograma));
        System.out.println("Es igual?: " + (NumeroUsuario == NumeroPrograma));
    }
    
}
