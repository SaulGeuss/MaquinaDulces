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
public class GiroInicial implements Estado{
  
    @Override
    public void cambioEstado(MaquinaDulce miMaquina) {
        
        if (miMaquina.getMoneda() == Boolean.TRUE) {
            miMaquina.setEstado(2);
            System.out.println("Se cambio del estado Giro al estado Final");
        }else{
            miMaquina.setEstado(0);
            System.out.println("Se cambio del estado Giro al estado Inicial porque no hay moneda");
        }
        
    }
    
}
