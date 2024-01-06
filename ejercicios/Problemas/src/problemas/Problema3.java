/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema3 {

    static Scanner entrada = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese primera nota");
        double nota1 = entrada.nextDouble();
        System.out.println("Ingrese segunda nota");
        double nota2 = entrada.nextDouble();
        System.out.println("Ingrese tercera nota");
        double nota3 = entrada.nextDouble();
        System.out.println("Ingrese cuarta nota");
        double nota4 = entrada.nextDouble();
        String cualitativo = "";
        cualitativo =  calcularPromedio(nota1, nota2, nota3, nota4);
        System.out.printf("El promedio de las notas: %.2f; %.2f"
                + "; %.2f; %.2f es %s\n", nota1, nota2, 
                nota3, nota4, cualitativo);
    }

    public static String calcularPromedio(double nota1, double nota2,
            double nota3, double nota4) {
        entrada.useLocale(Locale.US);
        double promedio;
        String cualitativo;
        cualitativo = " ";
        promedio = (nota1 + nota2 + nota3 + nota4) / 4;
        if ((promedio >= 0) && (promedio <= 5)) {
            cualitativo = "Regular";
        } else {
            if ((promedio > 5) && (promedio <= 8)) {
                cualitativo = "Bueno ";
            } else {
                if ((promedio > 8) && (promedio <= 9)) {
                    cualitativo = "Muy Bueno";
                } else {
                    cualitativo = "Sobresaliente";
                }
            }
        }
        return cualitativo;

    }
}
