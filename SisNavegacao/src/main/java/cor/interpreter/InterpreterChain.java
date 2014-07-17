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
public abstract class InterpreterChain {
	protected SisNavegacao sn;
	private InterpreterChain next = null;
	
	public InterpreterChain(SisNavegacao sn){
		this.sn = sn;
	}
	
	public abstract void interpretar(String s);
	
	public void interpretarComando(String s){
		this.interpretar(s);
	}
	
	public void proximoInterpretar(String s){
		if (next != null) next.interpretarComando(s);
	}
	public void setNext(InterpreterChain next){
		this.next=next;
	}
}
