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
public class Problema2 {

    static Scanner entrada = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Ingrese para Calcular"
                + " 1 Area Cuadrado 2 Area Triangulo 3 Area Rectangulo ");
        int opcion = entrada.nextInt();
        if (opcion == 1) {
            areaCuadrado();
        } else {
            if (opcion == 2) {
                areaTriangulo();
            } else {
                if (opcion == 3) {
                    areaRectangulo();
                }
            }

        }
    }

    public static void areaCuadrado() {
        double area;
        System.out.println("Ingrese el valor del lado ");
        double lado = entrada.nextDouble();
        area = lado * lado * lado * lado;
        System.out.printf(" Area del cuadrado es: %.2f\n", area);
    }

    public static void areaTriangulo() {
        double area;
        System.out.println("Ingrese el valor de la base ");
        double base = entrada.nextDouble();
        System.out.println("Ingrese el valor de la altura ");
        double altura = entrada.nextDouble();
        area = (base * altura) / 2;
        System.out.printf(" Area del triangulo es: %.2f\n", area);
    }

    public static void areaRectangulo() {
        double area;
        System.out.println("Ingrese el valor de la base ");
        double base = entrada.nextDouble();
        System.out.println("Ingrese el valor de la altura ");
        double altura = entrada.nextDouble();
        area = base * altura;
        System.out.printf(" Area del rectangulo es: %.2f\n", area);
    }

}
