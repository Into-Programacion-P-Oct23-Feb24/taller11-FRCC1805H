/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema5 {

    public static void main(String[] args) {
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int sumaTotal = valorSuma(informacion);
        System.out.printf("La suma del arreglo bidimensional es: %d\n",
                sumaTotal);
    }

    public static int valorSuma(int[][] arreglo) {
        int suma = 0;

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                suma = suma + arreglo[i][j];
            }
        }

        return suma;
    }

}
