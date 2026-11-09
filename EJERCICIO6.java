/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sánchez_ortiz_prac2;


public class EJERCICIO6 {

    public static void main(String[] args) {
        int [] numeros = {1 ,2 , 6 , 14 , 10 ,12};
        int ContadorNumeros = 0;
               
        for (int i = 0; i <numeros.length; i++) {
            if (numeros[i] % 2 == 0 && numeros [i] > 10){
                System.out.println(numeros[i]);
                ContadorNumeros++;
            }
        }
        
        System.out.println("Las condiciones se cumplen en un total de: " + ContadorNumeros + " veces.");
    }
    
}
