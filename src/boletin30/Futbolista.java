/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg30;

/**
 *
 * @author JP
 */
public class Futbolista extends SeleccionFutbol{
    private int dorsal;
    private String demarcacion;

    public Futbolista(int id,String nombre,String apellidos,int edad,int dorsal,String demarcacion) {
        super(id,nombre,apellidos,edad);
        this.demarcacion=demarcacion;
        this.dorsal=dorsal;
    }
    
    public void entrevista(){
        System.out.println("entrevistando futbolista");
    }

    @Override
    public void concentrarse() {
        System.out.println("concentrando futbolista");
    }

    @Override
    public void viajar() {
        System.out.println("viajando futbolista");
    }

    @Override
    public void entrenar() {
        System.out.println("entrenando futbolista");
    }

    @Override
    public void jugarPartido() {
        System.out.println("futbolista jugando partido");
    }
}
