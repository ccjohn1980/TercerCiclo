/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_mvc;

import Controlador.Controlador;
import Modelo.Modelo_Clase;
import Vista.Vista_1;

/**
 *
 * @author l03m01
 */
public class App_MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Modelo_Clase  mod = new Modelo_Clase  ();
        Vista_1 view = new Vista_1();
        
        Controlador ctrl = new Controlador (view, mod);
        ctrl.iniciar();
        view.setVisible(true);
    }
    
}
