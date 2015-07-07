/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maquina;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author adiseño.2015
 */
public class MaquinaDulce {
    
    public int estado ;
    public Boolean moneda;
    ArrayList<Estado> miLista = new ArrayList<Estado>();
    
    
    public MaquinaDulce(){
        
    }
    
    public MaquinaDulce(ArrayList<Estado> miLista){
        this.miLista = miLista;
        this.estado = 0;
        this.moneda = Boolean.FALSE;
    }
    
    public void procesar(){
        
        this.miLista.get(estado).cambioEstado(this);
        
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Boolean getMoneda() {
        return moneda;
    }

    public void setMoneda(Boolean moneda) {
        this.moneda = moneda;
    }

    public ArrayList<Estado> getMiLista() {
        return miLista;
    }

    public void setMiLista(ArrayList<Estado> miLista) {
        this.miLista = miLista;
    }
    
    
    
}
