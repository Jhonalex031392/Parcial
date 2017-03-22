/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parciallpaii;

import java.util.Scanner;

/**
 *
 * @author acerpc
 */
public class ParcialLPAII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int horas;
        int costo_horas;
        int porcentaje;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese las horas trabajadas");
        horas = leer.nextInt();
        System.out.println("Ingrese el costo por hora");
        costo_horas = leer.nextInt();
        System.out.println("Ingrese el porcentaje de retencion (%)");
        porcentaje = leer.nextInt();
    }
    
}
