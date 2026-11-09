/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ARRAYS;

import java.util.Arrays;


public class UndirLaFlota_Arrays_26_10_2026 {

    public static void main(String[] args) {
       char [][] Undimiento = new char [10][10];
     
       //colocar el submarino con una S de tamaño 1 en horizontal        
       int fila = (int) (Math.random () *10);
       int columna = (int) (Math.random () *10);
       Undimiento [fila] [columna] = 'S';
       
       //creacion de un for para recorrer la matriz
        for (int i = 0; i < Undimiento.length; i++) {
            //Arrays.fill (Undimiento[i], 'A');  manera mas facil y rapida
            for (int j = 0; j < Undimiento[i].length; j++) {
                Undimiento [i][j] = 'A';
            }
        }
        for (int i = 0; i < Undimiento.length; i++) {
            for (int j = 0; j < Undimiento[i].length; j++) {
                Undimiento [fila][columna] = 'S';
            }
        }
        
        do{
            
         //colocar una fragata con una F de tamaño 3 en horizontal
         fila = (int) (Math.random () *10);
         columna = (int) (Math.random () *8);
         Undimiento [fila] [columna] = 'F';
            
        }while (Undimiento [fila][columna] != 'A' && Undimiento [fila][columna + 1] != 'A' && Undimiento [fila][columna + 2] != 'A' );
        Undimiento [fila][columna] = 'F';
        Undimiento [fila][columna + 1] = 'F';
        Undimiento [fila][columna + 2] = 'F';
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < Undimiento[i].length; j++) {
                Undimiento [fila][columna] = 'F';
            }
        }
        
        
        
        //colocar un portaaviones con una P de tamaño 5
        fila = (int) (Math.random () *10);
        columna = (int) (Math.random () *6);
        Undimiento [fila] [columna] = 'P';
       do{
        
           
       }while (Undimiento [fila][columna] != 'A' && Undimiento [fila][columna + 1] != 'A' && Undimiento [fila][columna + 2] != 'A' && Undimiento [fila][columna + 3] != 'A' && Undimiento [fila][columna + 4] != 'A' );
       Undimiento [fila][columna] = 'P';
       Undimiento [fila][columna + 1] = 'P';
       Undimiento [fila][columna + 2] = 'P';
       Undimiento [fila][columna + 3] = 'P';
       Undimiento [fila][columna + 4] = 'P';
       for (int i = 0; i < 3; i++) {
            for (int j = 0; j < Undimiento[i].length; j++) {
                Undimiento [fila][columna] = 'P';
            }
        }
       
        //mostrar la matriz por la consola
        for (int i = 0; i <Undimiento.length; i++) {
            System.out.println(Arrays.toString(Undimiento[i]));
        }
       
       /*private class void mostrar (char [][] Undimiento){
            for (int i = 0; i < Undimiento.length; i++) {
                System.out.println(Arrays.toString(Undimiento[i]));
            }
           
       }*/
  }
    
}
