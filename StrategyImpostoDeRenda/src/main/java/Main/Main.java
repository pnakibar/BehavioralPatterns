package Main;

import calculadorImpRenda.Calculador;
import calculadorImpRenda.CalculadoraAliquota;
import calculadorImpRenda.ImpostoCalculator;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pdr
 */
public class Main {
    
    
    public static void main(String args[]){
        
        Calculador ca = new CalculadoraAliquota((float) 7.5, (float) 1000, (float) 2000);
        
        ImpostoCalculator ic = new ImpostoCalculator(ca);
        
        try {
            System.out.println(ca.calcular(3000));
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
