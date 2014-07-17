/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.statemachine.states;

import br.machine.StateMachine;



/**
 *
 * @author cthulhu
 */
public abstract class State {
	
	public abstract void pucharAlavanca();
	
	public void inserirMoeda(){
		StateMachine.setMoedas(StateMachine.getMoedas()+1);
		System.out.println("Moeda inserida.");
		StateMachine.setState(new LoadedState());
	}
	
	public void removerMoeda(){
		StateMachine.setMoedas(StateMachine.getMoedas()-1);
		System.out.println("Moeda removida.");
		
		if (StateMachine.getMoedas() > 0){
			StateMachine.setState(new LoadedState());
		}
		else StateMachine.setState(new WaitingState());
		
	}
	
	
}
