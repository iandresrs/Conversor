/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Operacion;
import vista.Vista;



/**
 *
 * @author claus
 */
public class Controlador implements ActionListener{

  private Vista vista = null;
  private Operacion operacion =null;

    public Controlador(Operacion operacion, Vista vista) {
        super();
        this.vista=vista;
        this.operacion=operacion;
        actionListener(this);
        
    }
    
    private void actionListener(ActionListener controlador){
        System.out.println("ggg");
     vista.btnConvertirPesos.addActionListener(controlador);
     vista.btnConvertirPesosDolar.addActionListener(controlador);
     
    
    }

    @Override
    public void actionPerformed(ActionEvent e){
     try{  
         System.out.println("ggg");
         if(e.getActionCommand().contentEquals("Convertir a Pesos")) {
             System.out.println("ggtttg");
          double dinero = Double.parseDouble(vista.txtNumero.getText());
          operacion.setDinero(dinero);
          operacion.setMoneda(3000.0);
          operacion.convertirPesosDolar();
          vista.txtResult.setText(operacion.getResultado().toString());
    
          } else if(e.getActionCommand().contentEquals("Convertir a Dolares")){
            double dinero = Double.parseDouble(vista.txtNumero.getText());
          operacion.setDinero(dinero);
          operacion.setMoneda(0.003);
          operacion.convertirDolarPeso();
          vista.txtResult.setText(operacion.getResultado().toString());
              
             
            }
        }catch(Exception ex){
            ex.printStackTrace();
            
            System.out.println("ggtttt");
                       }
   }
}
    
    
  
  
          
    
  
    

