/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema4 {

    static Scanner entrada = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = "";
        String cedula = "";
        System.out.println(" Cuantos clientes desea ingresar ");
        int n = entrada.nextInt();
        for (int c = 0; c < n; c++) {
            entrada.nextLine();
            System.out.println("Ingrese el nombre del cliente");
            nombre = entrada.nextLine();
            System.out.println("Ingrese el numero de cedula");
            cedula = entrada.nextLine();
            System.out.println("Si desea conocer el valor de la planilla de"
                    + " luz ingrese 1, si desea conocer el valor a pagar del "
                    + "predio ingrese 2");
            int luz = entrada.nextInt();
            int predio = entrada.nextInt();
            if (luz == 1) {
                valorLuz(nombre, cedula);
            } else {
                if (predio == 2) {
                    valorPredio(nombre, cedula);
                }
            }
        }
    }

    public static void valorLuz(String nombre, String cedula) {
        double total;
        System.out.println("Ingrese el valor del kilowatio");
        double vk = entrada.nextDouble();
        System.out.println("Ingrese el numero de kilowatios usados en el mes ");
        double nk = entrada.nextDouble();
        total = vk * nk;
        System.out.printf("Cliente: %s con cedula: %s debe cancelar el"
                + " valor de: $%.2f\n", nombre, cedula, total);
    }

    public static void valorPredio(String nombre, String cedula) {
        double total;
        System.out.println("Ingrese el valor de su inmueble");
        double inmueble = entrada.nextDouble();
        total = inmueble - (inmueble * 0.2);
        System.out.printf("Cliente: %s con cedula: %s tiene un bien inmueble "
                + "valorado en: $%.2f y tiene que pagar un predio de: %.2f\n",
                nombre, cedula, inmueble, total);
    }

}
