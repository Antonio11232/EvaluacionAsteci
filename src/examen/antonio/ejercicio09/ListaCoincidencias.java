package examen.antonio.ejercicio09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaCoincidencias {
    public static void main(String[] args) {
        //1,2,4,6,8,0,3,44,52,43,129)
        List<Integer> enteros01 = new ArrayList<>(Arrays.asList(1,2,4,6,8,0,3,44,52,43,129));
        // (23,4,6,2,34,7,99,52,5,8)
        List<Integer> enteros02 = new ArrayList<>(Arrays.asList(23,4,6,2,34,7,99,52,5,8));
        List<Integer> nuevaLista = new ArrayList<>();


        for (Integer entero: enteros01) {
            if(enteros02.contains(entero)){
                nuevaLista.add(entero);
            }
        }

        for (Integer entero: nuevaLista) {
            System.out.print(entero + " ");
        }
    }

}
