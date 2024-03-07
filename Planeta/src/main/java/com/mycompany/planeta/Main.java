/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.planeta;

/**
 *
 * @author Joseliebana
 */
public class Main {

    public static void main(String[] args) {

        Planeta planeta1 = new Planeta("Tierra", 1, 1.08321E12, 5.9736E24, 12742, 150000000, tipoPlaneta.terrestre, true);

        Planeta planeta2 = new Planeta("Júpiter", 1, 1.4313E15, 1.899E27, 139820, 750000000, tipoPlaneta.gaseoso, true);

        planeta1.imprimir();
        System.out.println(" ");

        planeta2.imprimir();

        System.out.println(" ");

        System.out.println("La densidad de La Tierra es: " + planeta1.calcularDensidad());
        System.out.println(" ");

        System.out.println("La densidad de Júpiter es: " + planeta2.calcularDensidad());

        System.out.println(" ");

        System.out.println("La Tierra es exterior: " + planeta1.esExterior());
        System.out.println(" ");

        System.out.println("Júpiter es exterior: " + planeta2.esExterior());
    }
}
