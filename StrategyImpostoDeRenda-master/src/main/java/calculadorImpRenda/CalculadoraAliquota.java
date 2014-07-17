/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorImpRenda;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pdr
 */
public class CalculadoraAliquota implements Calculador {

    private float aliquota;
    private float valorMinimo;
    private float valorMaximo;

    public CalculadoraAliquota(float aliquota, float valorMinimo, float valorMaximo) {
        this.aliquota = aliquota;
        this.valorMinimo = valorMinimo;
        this.valorMaximo = valorMaximo;

    }

    @Override
    public float calcular(float valorBruto) throws Exception{
        if (valorBruto >= valorMinimo && valorBruto <= valorMaximo)return ((valorBruto * aliquota) / 100);
        else throw new Exception();
        
    }
}

