/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.planeta;

/**
 *
 * @author Joseliebana
 */
public class Planeta {
    private String NombrePlaneta;
    private int cantidadsatelites;
    private double volumen;
    private double masa;
    private int diametro;
    private int distanciaSol;
    private tipoPlaneta tipo;
    private boolean esobservable;

    public Planeta(String NombrePlaneta, int cantidadsatelites, double volumen, double masa, int diametro, int distanciaSol, tipoPlaneta tipo, boolean esobservable) {
        this.NombrePlaneta = NombrePlaneta;
        this.cantidadsatelites = cantidadsatelites;
        this.volumen = volumen;
        this.masa = masa;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.tipo = tipo;
        this.esobservable = esobservable;
    }
    
    public void imprimir(){
        System.out.println("Datos del planeta: ");
        System.out.println("Nombre: " + this.NombrePlaneta);
        System.out.println("Cantidad de satelites: " + this.cantidadsatelites);
        System.out.println("Volumen: " + this.volumen);
        System.out.println("Masa: " + this.masa);
        System.out.println("Diametro: " + this.diametro);
        System.out.println("Distancia al sol: " + this.distanciaSol);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Es observable: " + this.esobservable);
    }
    
    public double calcularDensidad(){
        double densidad = this.masa/this.volumen;
        return densidad;
    }
    
    public boolean esExterior(){
        
    double limite = 3.4 * 149597870;
    
    if (distanciaSol > limite){
        return true;
    } else {
        return false;
    }
    }      
}
