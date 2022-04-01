/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author claus
 */
public class Operacion {
    
    Double dinero;
    Double moneda;
    Double resultado;

    //Constructor
    public Operacion() {
    }
    
    
    //Constructor
    public Operacion(Double dinero, Double moneda, Double resultado) {
        this.dinero = dinero;
        this.moneda = moneda;
        this.resultado = resultado;
    }
    
    

    //metodos getter and setter
    public Double getDinero() {
        return dinero;
    }

    public Double getMoneda() {
        return moneda;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setDinero(Double dinero) {
        this.dinero = dinero;
    }

    public void setMoneda(Double moneda) {
        this.moneda = moneda;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }
    
    public void convertirDolarPeso(){
    resultado=dinero*moneda;
    }
    
    public void convertirPesosDolar(){
    resultado=dinero*moneda;
    }
}
