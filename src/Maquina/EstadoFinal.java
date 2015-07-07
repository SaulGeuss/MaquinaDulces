/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maquina;

/**
 *
 * @author adiseño.2015
 */
public class EstadoFinal implements Estado{

    public int estado;
    
    @Override
    public void cambioEstado(MaquinaDulce miMaquina) {
        
        miMaquina.setEstado(0);
        miMaquina.setMoneda(Boolean.FALSE);
        System.out.println("Tomar dulce");
    }
    
    
    
}
