
package ejercicio.calculadora;

import java.util.Scanner;


public class EjercicioCalculadora {

    
    public static void main(String[] args) {    
        int miNum1;
        int miNum2;
        boolean parada=true;
        
        do{
        System.out.println("¿Qué operación deseas realizar? + - * /");
        Scanner datos =new Scanner(System.in);
        char decision=datos.next().toUpperCase().charAt(0);
        switch(decision){
            case '+':
                System.out.println("Dime el primer sumando");
                miNum1=datos.nextInt();
                System.out.println("Dime el segundo sumando");
                miNum2=datos.nextInt();
                System.out.println("El resultado de la suma es: "+(miNum1+miNum2));
                System.out.println("¿Deseas continuar? S/N");
                decision=datos.next().toUpperCase().charAt(0);
                if (decision=='N') {
                parada=false; //parar la ejecución del bucle
                System.out.println("¡Hasta Pronto!");
                }
                break;
            case '-':
                System.out.println("Dime la primera resta");
                miNum1=datos.nextInt();
                System.out.println("Dime la segunda resta");
                miNum2=datos.nextInt();
                System.out.println("El resultado de la resta es: "+(miNum1-miNum2));
                System.out.println("¿Deseas continuar? S/N");
                decision=datos.next().toUpperCase().charAt(0);
                if (decision=='N') {
                parada=false; //parar la ejecución del bucle
                System.out.println("¡Hasta Pronto!");
                }
                break;
            case '*':
                System.out.println("Dime el primer multiplicador");
                miNum1=datos.nextInt();
                System.out.println("Dime el segundo multiplicador");
                miNum2=datos.nextInt();
                System.out.println("El resultado de la multiplicación es: "+(miNum1*miNum2));
                System.out.println("¿Deseas continuar? S/N");
                decision=datos.next().toUpperCase().charAt(0);
                if (decision=='N') {
                parada=false; //parar la ejecución del bucle
                System.out.println("¡Hasta Pronto!");
                }
                break;
            case '/':
                System.out.println("Dime el dividendo");
                miNum1=datos.nextInt();
                System.out.println("Dime el divisor");
                miNum2=datos.nextInt();
                System.out.println("El resultado de la división es: "+(miNum1/miNum2));
                System.out.println("¿Deseas continuar? S/N");
                decision=datos.next().toUpperCase().charAt(0);
                if (decision=='N') {
                parada=false; //parar la ejecución del bucle
                System.out.println("¡Hasta Pronto!");
                }
                break;
               
            default:
                System.err.println("Error de entrada");
                parada=false;
                System.out.println("¡Hasta Pronto!");
                break;
        }
        }
        while (parada==true);           
    }
    
}
