/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioestados;

import Maquina.Estado;
import Maquina.EstadoFinal;
import Maquina.EstadoInicial;
import Maquina.GiroInicial;
import Maquina.MaquinaDulce;
import java.util.ArrayList;

/**
 *
 * @author adiseño.2015
 */
public class EjercicioEstados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EstadoInicial miIni = new EstadoInicial();
        GiroInicial miGir = new GiroInicial();
        EstadoFinal miFin = new EstadoFinal();
        
        ArrayList<Estado> miLista = new ArrayList<>();
        miLista.add(miIni);
        miLista.add(miGir);
        miLista.add(miFin);
        
        MaquinaDulce miMaqDul = new MaquinaDulce(miLista);
        miMaqDul.procesar();
        miMaqDul.procesar();
        miMaqDul.setMoneda(Boolean.TRUE);
        miMaqDul.procesar();
        miMaqDul.procesar();
        
        
    }
    
}
