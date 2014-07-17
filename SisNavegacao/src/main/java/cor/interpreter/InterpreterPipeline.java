/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cor.interpreter;

import br.sisnavegacao.SisNavegacao;

/**
 *
 * @author cthulhu
 */
public class InterpreterPipeline {
	private InterpreterChain chain;
	
	public InterpreterPipeline(SisNavegacao sn){
		chain  = new InterpreterCidade(sn);
		chain.setNext(new InterpreterPosicao(sn));
		
	}
	
	public void interpret(String s){
		chain.interpretar(s);
	}
	

}
