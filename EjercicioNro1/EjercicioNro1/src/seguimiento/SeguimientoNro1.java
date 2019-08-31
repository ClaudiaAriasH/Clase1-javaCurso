/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguimientonro1;

import java.util.Scanner;

/**
 *
 * @author s109e9
 */
public class SeguimientoNro1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombreMes;
        //Creación de un objeto Scanner, que permite ingresar información por consola
        Scanner entradaEscaner = new Scanner(System.in);
        System.out.println("************* Seguimiento 1 ****************");
        System.out.println("\n" + "************* Meses del año****************");
        System.out.println("\n" + "Ingrese un número: ");
        //Se captura el número del mes
        int numeroMes = entradaEscaner.nextInt();

        //Sentencia condiciona swith para saber que mes es
        switch (numeroMes) {
            case 1:
                nombreMes = "Enero";
                //Llamado procedimiento para imprimir mes
                imprimirMes(nombreMes);
                break;
            case 2:
                nombreMes = "Febrero";
                //Llamado procedimiento para imprimir mes
                imprimirMes(nombreMes);
                break;
            case 3:
                nombreMes = "Marzo";
                //Llamado procedimiento para imprimir mes
                imprimirMes(nombreMes);
                break;
            case 4:
                nombreMes = "Abril";
                //Llamado procedimiento para imprimir mes
                imprimirMes(nombreMes);
                break;
            case 5:
                nombreMes = "Mayo";
                //Llamado procedimiento para imprimir mes
                imprimirMes(nombreMes);
                break;
            case 6:
                nombreMes = "Junio";
                //Llamado procedimiento para imprimir mes
                imprimirMes(nombreMes);
                break;
            case 7:
                nombreMes = "Julio";
                //Llamado procedimiento para imprimir mes
                imprimirMes(nombreMes);
                break;
            case 8:
                nombreMes = "Agosto";
                //Llamado procedimiento para imprimir mes
                imprimirMes(nombreMes);
                break;
            case 9:
                nombreMes = "Septiembre";
                //Llamado procedimiento para imprimir mes
                imprimirMes(nombreMes);
                break;
            case 10:
                nombreMes = "Octubre";
                //Llamado procedimiento para imprimir mes
                imprimirMes(nombreMes);
                break;
            case 11:
                nombreMes = "Noviembre";
                //Llamado procedimiento para imprimir mes
                imprimirMes(nombreMes);
                break;
            case 12:
                nombreMes = "Diciembre";
                //Llamado procedimiento para imprimir mes
                imprimirMes(nombreMes);
                break;
            default:
                System.out.println("El número ingresado no coincide con ningun mes, ingrese un número valido");
                break;
        }
    }

    /**
     * Procedimiento para imprimir mes
     *
     */
    private static void imprimirMes(String mes) {

        System.out.print("El mes equivalente al número ingresado es: " + mes + "\n");

    }

}