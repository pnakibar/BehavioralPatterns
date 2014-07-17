/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.statemachine.states;

import br.machine.StateMachine;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cthulhu
 */
public class LoadedState extends State{

	@Override
	public void pucharAlavanca() {
		if (StateMachine.getGomas() > 0){
			StateMachine.setGomas(StateMachine.getGomas()-1);
			
			System.out.println("Aqui está a sua goma!");
			System.out.println("Restam apenas "+StateMachine.getGomas()+" goma na maquina!");
			super.removerMoeda();
		}
		
		if (StateMachine.getGomas() == 0){
			StateMachine.setState(new EmptyState());
		}
		
	
		
	}
	
}
