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
public class EjercicioPracticaif2 {

    public static void main(String[] args) {
        //calculaddora ecucaciones de segundo grado
        //ax*2 +bx + c = o
        Scanner sc = new Scanner (System.in);
        System.out.println("Determina tus variables para calcular la ecuacion de segundo grado");
        //declaracion de variables
        int a = 0;
        System.out.println("Introduce a");
        a = sc.nextInt();
        
        int b = 0;
        System.out.println("Introduce b");
        b = sc.nextInt();
        
        int c = 0;
        System.out.println("Introduce c");
        c = sc.nextInt();
        
        double d = Math.sqrt(b*b - 4 * a * c) ;
        double x1 = ((-b-d)/(2*a));
        double x2 = ((-b+d)/(2*a));
        if (a == 0){
            System.out.println("La operacion no se puede realizar");
        }else{
            if (d < 0){
                System.out.println("La operacion no puede realizarse");
            }else{
                System.out.println("x1: " + x1 +"x2" +x2); 
            }                   
  
        }
           
        
    }
    
}
