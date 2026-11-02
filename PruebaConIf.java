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
public class PruebaConIf {

    private static Object sc;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
       
        char letra = 'l';
        System.out.println("introduce cualquier dia de la semana para decir si hay programacion o no");
        letra = sc.next().charAt(0);
        
        switch (letra) {
            case 'l':
                System.out.println("Tenemos clase de programacion, es lunes");
                break;
            case 'x':
                //else if == si no si
                System.out.println("Tenemos claase de programacion, es miercoles");
                break;
            case 'v':
                System.out.println("Tenemos dia de programacion, es viernes");
                break;
            default:
                System.out.println("Hoy no tenemos programacion");
                break; //Pruebas con if: ejercicio 1
        }
        
        
        
        /*
        //el usuario va a introducir un numero entero y debemos decir si es par o impar
        System.out.println("Introduce cualquier numero");
        int numero = sc.nextInt();
        
        if (numero %2 == 0){
            if (numero !=0){ //hacemos que si el usuario pone un 0, no se imprima nada
                
            }
            System.out.println("estas introduciendo un numero par");
        }else {
            System.out.println("estas introduceindo un numero impar");
        }*/ // Prueba con if ejercicio 2
        
        
        
        /*System.out.println("Introduce un numero");
        int numero1 = sc.nextInt();
        System.out.println("Introduce otro numero");
        int numero2 = sc.nextInt();
        
        if (numero1 > numero2){
            System.out.println("el primer numero es mayor que el segundo numero");
            System.out.println(+numero1 > numero2);
        }
        else if (numero1<numero2){
            System.out.println("el primer numero es menor que el segundo numero");
            System.out.println(+numero1<numero2);    
        }
        else if (numero1==numero2){
            System.out.println("el primer numero y el segundo numero son iguales");
        }*/ // Prueba con if ejercicio 3
        
        
       /* System.out.println("Intoduce cualquier numero del 0 al 9 ");
        int numero = sc.nextInt();
        
        int NumeroPrograma = (int)(Math.random()*10);
        System.out.println("El numero elegido por el programa es: "+NumeroPrograma);
        
        if (numero > NumeroPrograma){
            System.out.println("El numero que has elegido es mayor que el numero elegido por el programa");
            System.out.println(numero+">"+NumeroPrograma);
            
        }
        else if (numero<NumeroPrograma){
            System.out.println("El numero que has elegido es menor que el numero elegido por el programa");
            System.out.println(numero+"<"+NumeroPrograma);
        }
        else if (numero==NumeroPrograma){
            System.out.println("El numero que has elegido es igual que el numero elegido por el programa, SUERTE!!!");
            System.out.println(numero+"="+NumeroPrograma);
        }*/ //prueba con if ejercicio3
        
        /*System.out.println("Introduce el primer numero");
        int numero = sc.nextInt();
        System.out.println("Introduce el segundo numero");
        int numero2= sc.nextInt();
        System.out.println("Introduce el terecer numero");
        int numero3 = sc.nextInt();
        
        if (numero > numero2 && numero2>numero3){
            System.out.println(numero+">"+numero2+">"+numero3);
            
        }else if (numero < numero2 && numero>numero3){
            System.out.println(numero+"<"+numero2+numero+">"+numero3);
            
        }else if(numero < numero2 && numero2>numero3){
            System.out.println(numero+"<"+numero2+numero2+">"+numero3);
            
        }else if(numero > numero2 && numero2<numero3){
            System.out.println(numero+">"+numero2+numero2+"<"+numero3);
            
        }else if(numero < numero3 && numero3>numero2){
            System.out.println(numero3+">"+numero2+numero+"<"+numero3);
            
        }else if(numero < numero3 && numero3>numero2){
            
        }*/ //Codigo prueba ejercicio4 (por terminar una pequeña parte)
        
        
        System.out.println("introduce cualqueir nota numerica del 0 al 10");
        int nota= sc.nextInt();
        
        if (nota < 5 ){
            
            System.out.println("La nota es insuficiente, haber estudiado");
            
        }else if (nota == 5 ){
            
            System.out.println("Has aprobado");
            
        }else if (nota == 6){
            
            System.out.println("Bien, has aprobado");
        }else if (nota == 7 || nota == 8 ){
          
             System.out.println("Bien, has aprobado con un notable");
             
        }else if (nota == 9 || nota == 10 ){
            
            System.out.println("Bien, has aprobado con un sobresaliente");
        }else if (nota > 10 || 0 > nota  ){
            System.out.println("Nota fuera del rango, lee bien");
        }
            
           
                
        
        

    }
    
}
