package examen.antonio.ejercicio06;

import java.util.ArrayList;
import java.util.List;

public class OperacionesListas {
    public static void main(String[] args) {
        //Rusia, Estados Unidos, Brasil, Canada, México
        List<String > paises = new ArrayList<>();
        List<String> listaResultado = new ArrayList<>();
        paises.add("Rusia");
        paises.add("Estados Unidos");
        paises.add("Brasil");
        paises.add("Canada");
        paises.add("México");

        for (String pais:paises) {
            int ulimoDigito = pais.length()-1;
            if(pais.charAt(ulimoDigito) == 'a' || pais.charAt(ulimoDigito) == 'e' || pais.charAt(ulimoDigito) == 'i' || pais.charAt(ulimoDigito) == 'o' || pais.charAt(ulimoDigito) == 'u'){
                String mayuscula = pais.toUpperCase();
                listaResultado.add(mayuscula);
            }
        }

        for (String pais:listaResultado) {
            System.out.println(pais);
        }
    }
}
