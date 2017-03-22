
package parciallpaii;

import java.util.Scanner;


public class ParcialLPAII {

    
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
        
        int sueldo_bruto = horas * costo_horas;
        double retencion = sueldo_bruto * (porcentaje /100.0);
        double sueldo_neto =  sueldo_bruto - retencion;
    }
    
}
