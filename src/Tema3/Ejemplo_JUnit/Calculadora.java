/*
 * Clase con main para probar las operaciones de las clases Resta y Suma
 */
package Tema3.Ejemplo_JUnit;

public class Calculadora {

    public static void main(String[] args) {
       
        Resta rest1 = new Resta();
        
        double resultado = rest1.getResta(5, 3);
        
        System.out.println("Resta: "+ resultado);
        
    }
    
}


