/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

import controlador.Controlador;
import modelo.Operacion;
import vista.Vista;

/**
 *
 * @author claus
 */


public class Conversor {
    
    

       

    /**
     * @paramthe command line arguments
     */
    public static void main(String[] args) {
        
        Vista v=new Vista();
        Operacion oper=new Operacion();
        Controlador control = new Controlador(oper,v);
        // TODO code application logic here
       
    }
    
}
