package examen.antonio.ejercicio02;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        //juan, pedro, jose, maria, sofia
        List<String> nombres = new ArrayList<>();
        nombres.add("juan");
        nombres.add("pedro");
        nombres.add("jose");
        nombres.add("maria");
        nombres.add("sofia");

        for (int i = 0; i < nombres.size(); i++) {
            if(i == 0){
                String nombre = nombres.get(i);
                char caracter = nombre.charAt(0);
                nombres.set(i, nombre.replace(caracter,Character.toUpperCase(caracter)));
            }
        }
        for (String nombre: nombres) {
            System.out.println(nombre);
        }




    }
}
