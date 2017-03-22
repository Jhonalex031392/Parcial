
package parciallpaii;

import java.util.Scanner;


public class ParcialLPAII {

    
    public static void main(String[] args) {
        int horas;
        int costo_horas;
        int porcentaje;
        //Variables
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese las horas trabajadas");
        horas = leer.nextInt();
        System.out.println("Ingrese el costo por hora");
        costo_horas = leer.nextInt();
        System.out.println("Ingrese el porcentaje de retencion (%)");
        porcentaje = leer.nextInt();//Lecturas
        
        int sueldo_bruto = horas * costo_horas;
        double retencion = sueldo_bruto * (porcentaje /100.0);
        double sueldo_neto =  sueldo_bruto - retencion;//Calculos del programa
        
        System.out.println("El sueldo bruto es de :$"+sueldo_bruto);
        System.out.println("La retencion es de :$"+retencion);
        System.out.println("El sueldo neto a pagar es de :$"+sueldo_neto);//Impresion por pantalla
    }
    
}
