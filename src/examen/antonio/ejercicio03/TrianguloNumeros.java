package examen.antonio.ejercicio03;

import java.util.Scanner;

public class TrianguloNumeros {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese la longitud del triangulo: ");
        int longitud = scan.nextInt();

        int numeros = 1;
        for (int i = 0; i < longitud; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print((numeros++)+" ");
            }
            System.out.println();
        }
    }
}
