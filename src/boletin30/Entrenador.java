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
public class Entrenador extends SeleccionFutbol{
    private int idFederacion;

    public Entrenador(int id, String nombre, String apellidos, int edad,int idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion= idFederacion;
    }
    
    public void planificarEntrenamiento(){
        System.out.println("entrenador planificando entrenamiento");
    }

    @Override
    public void concentrarse() {
        System.out.println("concentrarse entrenador");
    }

    @Override
    public void viajar() {
        System.out.println("viajando entrenador");
    }

    @Override
    public void entrenar() {
        System.out.println("entenando entrenador");
    }

    @Override
    public void jugarPartido() {
        System.out.println("entrenador jugando partido");
    }
}
