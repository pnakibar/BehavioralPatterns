/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.controle;

import model.Funcionalidade;

/**
 *
 * @author cthulhu
 */
public class ControleUniversal implements Controle{
	private Funcionalidade func1;
	private Funcionalidade func2;
	
	public ControleUniversal(Funcionalidade func1, Funcionalidade func2){
		this.func1 = func1;
		this.func2 = func2;
	}
	public void doSomething(){
		func1.execute();
	};
	public void undoSomething(){
		func2.execute();
	};	

}
