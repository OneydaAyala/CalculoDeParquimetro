/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculodeparquimetro;
import java.util.Scanner;

/**
 *
 * @author oneyda
 */
public class CalculoDeParquimetro {
    public static void main(String[] args) {
        System.out.print("Ingrese Nombre del Cliente: ");
        Scanner leer= new Scanner(System.in);
        
        String Cliente = leer.next();
        System.out.print("Ingrese Cantidad de minutos: ");
        
        int minutos = leer.nextInt();
        
        int Horas = 0;
        int TotalMinutos = 0;
        double TotalPagar = 0;
        
       
         if(minutos == 60)
         {
             Horas = 1;
             TotalMinutos = 0;
             TotalPagar = 0;
         }else if(minutos > 60 )
         {
             Horas = minutos/60;
             TotalMinutos = (minutos - (Horas * 60));
             TotalPagar = (((Horas - 1)*20) + 20);
             
         }else if(minutos < 60)
         {
             Horas = 0;
             TotalMinutos = minutos;
             TotalPagar = 0;
         }
             
         System.out.println("Total de Horas: "+Horas);
         System.out.println("Total minutos: "+TotalMinutos);
         System.out.println("Total Neto a pagar: "+TotalPagar);
    }
    
}
