/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicionro1;

import automotores.Carro;
import java.util.Scanner;

/**
 * int=Declara numeros enteros double= Declarar numeros enteros o decimal
 */
/**
 *
 * @author s109e9
 */
public class EjercicioNro1 {

    /**
     * @param args the command line arguments
     */
    static String mensaje;

    public static void main(String[] args) {
        //Creación de un objeto Scanner, que permite ingresar información por consola
        Scanner entradaEscaner = new Scanner(System.in);
        

        // PARTE UNO
        System.out.print("********* Presentación **********" + "\n");
        //llamado al procedimiento imprimir nombre
        imprimirNombre();

        System.out.print("\n" + "************ Calculadora **************" + "\n");
        System.out.print("\n" + "************ Uso Procedimientos **************" + "\n");
        //llamado al procedimiento suma
        sumarNumero();
        //llamado al procedimiento resta
        restarNumero();
        //llamado al procedimiento multiplicación     
        multiplicarNumero();

        //llamado al procedimiento división
        dividirNumero();
        System.out.print("\n" + "************ Uso funciones **************" + "\n");
        //Funcion

        System.out.println("\n" + "Ingrese el número uno: ");
        //Se captura el numero uno
        double numeroUno = entradaEscaner.nextDouble();

        System.out.println("Ingrese el número dos: ");
        //Se captura el numero dos
        double numeroDos = entradaEscaner.nextDouble();

        // informacion ingresada 
        System.out.println("El número uno ingresado es: " + numeroUno);
        System.out.println("El número dos ingresado es: " + numeroDos);

        //Funcion para sumar     
        double sumar = sumarNumeroF(numeroUno, numeroDos);
        //Procedimiento para imprimir 
        imprimirResultados("Sumar Función: ", sumar);

        //Funcion para restar
        double restar = restarNumeroF(numeroUno, numeroDos);
        //Procedimiento para imprimir 
        imprimirResultados("Restar Función: ", restar);

        //Funcion para multiplicar
        double multiplicar = multiplicarNumeroF(numeroUno, numeroDos);
        //Procedimiento para imprimir 
        imprimirResultados("Multiplicar Función: ", multiplicar);

        //Funcion para dividir
        double dividir = dividirNumeroF(numeroUno, numeroDos);
        //Procedimiento para imprimir 
        imprimirResultados("Dividir Función: ", dividir);
        

        //PARTE DOS 
        Carro miPrimerCarro = new Carro("Gris", 4, 2009, "KIA");
        Carro miSegundoCarro = new Carro("Negro", 2, 2016, "Chevrolet");
        System.out.print("\n" + "Información Automotriz" + "\n");
        System.out.print("\n" + "Primer Carro" + "\n");
        miPrimerCarro.imprimirInformación();
        double valorPrimerCarro = miPrimerCarro.valorCarro();
        System.out.println("Valor: " + valorPrimerCarro);
        System.out.print("\n" + "Segundo  Carro" + "\n");
        miSegundoCarro.imprimirInformación();
        double valorSegundoCarro = miSegundoCarro.valorCarro();
        System.out.println("Valor: " + valorSegundoCarro);
    }

    /**
     * Procedimiento para imprimir un nombre
     */
    private static void imprimirNombre() {

        String nombre = "Claudia";
        //imprimir en consola
        System.out.print("Mi nombre es: " + nombre + "\n");

    }

    /**
     * Procedimiento para sumar numeros
     */
    private static void sumarNumero() {

        double numeroUno = 5;
        double numeroDos = 10;
        double resultadoSuma = numeroUno + numeroDos;
        mensaje = "Suma: ";

        imprimirResultados(mensaje, resultadoSuma);

    }

    /**
     *
     * @param numeroUno
     * @param numeroDos
     * @return suma de los numeros ingresados Funcion para sumar numeros
     */
    private static double sumarNumeroF(double numeroUno, double numeroDos) {

        double resultadoSuma = numeroUno + numeroDos;

        return resultadoSuma;
    }

    /**
     * Procedimiento para restar numeros
     */
    private static void restarNumero() {

        double numeroUno = 5;
        double numeroDos = 10;
        double resultadoResta = numeroDos - numeroUno;

        mensaje = "Resta: ";

        imprimirResultados(mensaje, resultadoResta);

    }

    /**
     * funcion para restar numeros
     *
     * @param numeroUno
     * @param numeroDos
     * @return resta de los numeros ingresados
     */
    private static double restarNumeroF(double numeroUno, double numeroDos) {

        double resultadoResta = numeroDos - numeroUno;

        return resultadoResta;
    }

    /**
     * Procedimiento para multiplicar numeros
     */
    private static void multiplicarNumero() {

        double numeroUno = 5;
        double numeroDos = 10;
        double resultadoMultiplicacion = numeroDos * numeroUno;
        mensaje = "Multiplicación: ";

        imprimirResultados(mensaje, resultadoMultiplicacion);

    }

    /**
     * Procedimiento para multiplicar numeros
     *
     * @param numeroUno
     * @param numeroDos
     * @return multiplicacion de los numeros ingresados
     */
    private static double multiplicarNumeroF(double numeroUno, double numeroDos) {

        double resultadoMultiplicacion = numeroDos * numeroUno;

        return resultadoMultiplicacion;

    }

    /**
     * Procedimiento para dividir numeros
     */
    private static void dividirNumero() {

        double numeroUno = 50.6;
        double numeroDos = 10;
        double resultadoDivision = numeroDos / numeroUno;
        mensaje = "División: ";

        imprimirResultados(mensaje, resultadoDivision);

    }

    /**
     * funcion para dividir numeros
     *
     * @param numeroUno
     * @param numeroDos
     * @return division de los numeros ingresados
     */
    private static double dividirNumeroF(double numeroUno, double numeroDos) {

        double resultadoDivision = numeroDos / numeroUno;

        return resultadoDivision;

    }

    /**
     * Procedimiento para imprimir resultados de culaquier operación
     *
     */
    private static void imprimirResultados(String tipoOperacion, double variable) {
        System.out.print("La operación realizada es:" + "\n");
        System.out.print(tipoOperacion + variable + "\n");

    }
}
