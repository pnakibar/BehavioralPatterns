package br.machine;


import br.statemachine.states.State;
import br.statemachine.states.WaitingState;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cthulhu
 */
public class StateMachine {
	private static StateMachine machine = null;
	private static State actualState = new WaitingState();
	private static int moedas = 0;
	private static int gomas = 3;
	
	private StateMachine(){}
	
	
	public static StateMachine getInstanceOf(){
		if (machine == null) machine = new StateMachine();
		return machine;
	}
	
	
	public static  void pucharAlavanca(){
		actualState.pucharAlavanca();
	}
	
	public static void inserirMoeda(){
		actualState.inserirMoeda();
	}
	
	public static void removerMoeda(){
		actualState.removerMoeda();
	}
	
	
	
	
	public static void setState(State state){
		actualState = state;
	}

	/**
	 * @return the moedas
	 */
	public static int getMoedas() {
		return moedas;
	}

	/**
	 * @param aMoedas the moedas to set
	 */
	public static void setMoedas(int aMoedas) {
		moedas = aMoedas;
	}

	/**
	 * @return the gomas
	 */
	public static int getGomas() {
		return gomas;
	}

	/**
	 * @param aGomas the gomas to set
	 */
	public static void setGomas(int aGomas) {
		gomas = aGomas;
	}
}
