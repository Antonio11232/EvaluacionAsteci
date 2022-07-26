package examen.antonio.ejercicio08;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Condicionales {
    //Pedir tres números enteros a,b,c
    //Realizar las posibles condiciones para mostrar de mayor a menor los 3 números
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] enteros = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el valor["+(i+1)+"]: ");
            enteros[i] = scan.nextInt();
        }

        for (int i = 0; i < enteros.length; i++) {
            for (int j = 0; j < enteros.length-1; j++) {
                if(enteros[j] < enteros[j+1]){
                    int respaldo = enteros[j];
                    enteros[j] = enteros[j+1];
                    enteros[j+1]=respaldo;
                }
            }
        }

        for (int i = 0; i < enteros.length; i++) {
            System.out.print( enteros[i] + " ");
        }



    }
}
