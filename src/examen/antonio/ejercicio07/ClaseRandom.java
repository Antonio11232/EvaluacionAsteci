package examen.antonio.ejercicio07;

import java.util.Random;
import java.util.Scanner;

public class ClaseRandom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
       int  numeroAleatoreo = numeroAleatoreo = rand.nextInt(101);
       if (numeroAleatoreo ==0){ numeroAleatoreo=1;}
        System.out.println(numeroAleatoreo);

       int contadorIntentos = 5;
        int evaluarNumero=0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese su numero a evaluar["+(i+1)+"]");
            evaluarNumero = scan.nextInt();
            if(evaluarNumero == numeroAleatoreo){
                System.out.println("Felicidaes!!" + "Numero aleatoreo == "+ numeroAleatoreo);
                break;
            }
            else {
                if(evaluarNumero > numeroAleatoreo){
                    System.out.println("El nuero es menor");
                }else{
                    System.out.println("El numero es mayor");
                }
            }
        }


    }
}
