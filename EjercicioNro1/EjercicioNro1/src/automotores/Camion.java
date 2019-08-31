/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automotores;

/**
 *
 * @author s109e9
 */
public class Camion {

    private String color;
    private int numeroPuertas;
    private int modelo;
    private String marca;
    private int numeroLlanta;
    private double capacidadCarga;

    public Camion() {

    }

    public Camion(String color, int numeroPuertas, int modelo, String marca, int numeroLlanta, double capacidadCarga) {
        this.color = color;
        this.numeroPuertas = numeroPuertas;
        this.modelo = modelo;
        this.marca = marca;
        this.numeroLlanta = numeroLlanta;
        this.capacidadCarga = capacidadCarga;
    }

    public void imprimirInformación() {

        System.out.println("Marca: " + this.numeroLlanta);
        System.out.println("Color: " + this.capacidadCarga);

    }
}
