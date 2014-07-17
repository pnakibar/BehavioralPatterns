/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.statemachine.states;

/**
 *
 * @author cthulhu
 */
public class EmptyState extends State {
	
	private void mensagem(){
		System.out.println("Não tem gomas na máquina!");
	}
	@Override
	public void pucharAlavanca() {
		mensagem();
	}
	
	@Override
	public void inserirMoeda(){
		mensagem();
	}
	
	@Override
	public void removerMoeda(){
		mensagem();
	}
	
}
