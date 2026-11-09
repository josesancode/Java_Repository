/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package STRING;


public class EjemploString_30_10_2026 {

        public static void main(String[] args) {
        String nombre = "hola que tal, ";
        nombre = nombre + "como estas";
            System.out.println(nombre);
            System.out.println(nombre.length());//medir el tamaño de la cadena de texto (comenzando en 0) por consola (espacios cuentan)
            System.out.println(nombre.charAt(5));// indica el caracter que hay en la posicion qeu le indiquemos
            System.out.println(nombre.compareTo("hola que tal, como estas")); //comaparar dos cadenas de texto de manera alfabética
            System.out.println(nombre.equals("hola que tal estas"));//compara dos cadenas de texto y si hambas son iguales devuelve un true, si no, es false
            System.out.println(nombre.equalsIgnoreCase("Hola que tal, Como estas"));//compara ambas cadenas de texto pero ignora las mayusculas y las minusculas
            System.out.println(nombre.contains("que"));//devuelve true o false en caso de si tiene o no esta palabra
            System.out.println(nombre.indexOf("q"));// indica donde se encuentra una letra
            System.out.println(nombre.indexOf("a", 5));//empieza a buscar una letra desde el numero que le indiquemos (contando que la cadena de texto comienza por 0)
            System.out.println(nombre.isEmpty());
            System.out.println(nombre.replace("que","QUE"));//sustituye una palabra determinada
            System.out.println(nombre.substring(5,9));
            System.out.println(nombre.toLowerCase());
            System.out.println(nombre.toUpperCase());
            char[] array = nombre.toCharArray(); //convierte tu cadena de texto en un array de char
            System.out.println(nombre.trim());//quita / se carga los espacios del principio y del final
            
            
            String num = String.valueOf(25); //convierte un numero a string
            System.out.println(num);
    }
    
}
 