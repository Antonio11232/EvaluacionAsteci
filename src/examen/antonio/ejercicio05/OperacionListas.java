package examen.antonio.ejercicio05;

import java.util.ArrayList;
import java.util.List;

public class OperacionListas {
    public static void main(String[] args) {
        //1,8,5,2,33,54,22,6,88,13
        List<Integer> listaEnteros = new ArrayList<>();
        listaEnteros.add(1);
        listaEnteros.add(8);
        listaEnteros.add(5);
        listaEnteros.add(2);
        listaEnteros.add(33);
        listaEnteros.add(54);
        listaEnteros.add(22);
        listaEnteros.add(6);
        listaEnteros.add(88);
        listaEnteros.add(13);

        for (Integer enteros :listaEnteros) {
            if(enteros%2==0){
                System.out.println(enteros);
            }
        }


    }
}
