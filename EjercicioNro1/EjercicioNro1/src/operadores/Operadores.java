/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

/**
 *
 * @author s109e9
 */
public class Operadores {

    public static int numeroA;
    public static int numeroB;

    public static void main(String[] args) {
        numeroA = 13;
        numeroB = 13;

        //operador modulo
        int resultadoModulo = numeroA % 2;
        System.out.println("Resultado operación modulo: " + resultadoModulo);

        ///Forma larga
        // operador incremento
        numeroA++;
        int resultaIncremento = numeroA;
        System.out.println("Resultado operación incremento: " + resultaIncremento);

        // operador incremento
        numeroB--;
        int resultaDecremento = numeroB;
        System.out.println("Resultado operación decremento: " + resultaDecremento);

        ///Forma corta 
        numeroB--;
        numeroB = numeroB - 1;
        int resultaDecrementoC = numeroB;
        System.out.println("Resultado operación decremento forma corta: " + resultaDecrementoC);

        numeroA = numeroA + 1;
        int resultaInfrementoC = numeroA;
        System.out.println("Resultado operación incremento forma corta: " + resultaInfrementoC);

        //variables boolean tiene dos opciones (true, false)
        boolean estaVivo = true;
        estaVivo = !estaVivo;
        System.out.println("El valor de boolean es: " + estaVivo);

        //Sentencia condicional if
        if (estaVivo == true) {
            System.out.println("esta vivo ");
        } else {
            System.out.println("No esta vivo ");
        }

        //Sentencia condiciona swith
        String inicialNombre = "z";
        switch (inicialNombre) {
            case "A":
                System.out.println("Caso A");
                break;
            case "B":
                System.out.println("Caso B");
                break;
            default:
                System.out.println("Caso por defecto");
                break;
        }

    }
}
