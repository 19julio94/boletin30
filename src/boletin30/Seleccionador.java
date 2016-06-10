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
public class Seleccionador extends SeleccionFutbol{

    public Seleccionador(int id,String nombre,String apellidos,int edad) {
        super(id,nombre,apellidos,edad);
    }

    public void SeleccionarJugador(){
        System.out.println("seleccionador seleccionando jugador");
    }
    @Override
    public void concentrarse() {
        System.out.println("seleccionador concentrandose");
    }

    @Override
    public void viajar() {
        System.out.println("seleccionador viajando");
    }

    @Override
    public void entrenar() {
        System.out.println("seleccionador entrenando");
    }

    @Override
    public void jugarPartido() {
        System.out.println("seleccionador jugando partido");
    }
    
}