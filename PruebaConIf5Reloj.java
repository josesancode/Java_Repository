/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package If;

import java.util.Scanner;

/**
 *
 * @author joses
 */
public class PruebaConIf5Reloj {

    
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Introduce la hora");
     int hora = sc.nextInt();
     
     System.out.println("Introduce los minutos");
     int minutos = sc.nextInt();
     
     System.out.println("Introduce los segundos");
     int segundos = sc.nextInt();
     
     segundos ++;
     
     if (segundos >= 60 ){
      segundos = 60 - segundos;
      minutos++;
      if (minutos >=60){
          minutos = minutos - 60;
          hora++;
          if (hora >= 23){
              hora = hora - 24;
          }
        }
      }
        System.out.println(hora+":"+minutos+":"+segundos);
    }
}
