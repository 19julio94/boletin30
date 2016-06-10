/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin30;

import java.util.ArrayList;

/**
 *
 * @author JP
 */
public class Boletin30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<boletin.pkg30.SeleccionFutbol> selfut = new ArrayList();
     boletin.pkg30.SeleccionFutbol ent = new boletin.pkg30.Entrenador(3,"entrenador","apellido",40,5);
     boletin.pkg30.SeleccionFutbol fut = new boletin.pkg30.Futbolista(4,"futolista","apellido",27,5,"demarcacion");
     boletin.pkg30.SeleccionFutbol mas = new boletin.pkg30.Masajista(1, "masajista","apellido",30,"masajeador",5);
     boletin.pkg30.SeleccionFutbol sel = new boletin.pkg30.Seleccionador(2,"seleccionador","apellido",55);
     
     selfut.add(ent);
     selfut.add(fut);
     selfut.add(mas);
     selfut.add(sel);
     
     for(boletin.pkg30.SeleccionFutbol sf:selfut){
         sf.concentrarse();
         sf.entrenar();
         sf.viajar();
         sf.jugarPartido();
     }
    }
    
}
