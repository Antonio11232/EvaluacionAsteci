package examen.antonio.ejercicio10;

public class OperacionMatriz {
    public static void main(String[] args) {

        int[][] matriz01 = new int[3][3];
        int[][] matriz02 = new int[3][3];
        int[][] matrizResultado = new int[3][3];

        matriz01[0][0]=2;matriz01[0][1]=0;matriz01[0][2]=1;
        matriz01[1][0]=3;matriz01[1][1]=0;matriz01[1][2]=0;
        matriz01[2][0]=5;matriz01[2][1]=1;matriz01[2][2]=1;

        matriz02[0][0]=1;matriz02[0][1]=0;matriz02[0][2]=1;
        matriz02[1][0]=1;matriz02[1][1]=2;matriz02[1][2]=1;
        matriz02[2][0]=1;matriz02[2][1]=1;matriz02[2][2]=0;



        for (int i = 0; i < matriz01.length; i++) {
            for (int j = 0; j < matriz02[i].length; j++) {
                for (int k=0; k<matriz02.length; k++)
                    matrizResultado[i][j] = matrizResultado[i][j] + matriz01[i][k] * matriz02[k][j];
            }
        }

        imprimir(matrizResultado);
    }

    public static void imprimir(int[][] array){
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array[i].length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
