/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadorImpRenda;

/**
 *
 * @author pdr
 */
public class ImpostoCalculator {
    private Calculador calculador;
    
    public ImpostoCalculator(Calculador c){
        this.calculador = c;
    }
    
    public float calcular(float valor) throws Exception{
        return calculador.calcular(valor);
        
    }
    
}
