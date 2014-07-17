/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import model.ArCondicionado;
import model.SensorExterno;
import model.SensorPessoas;

/**
 *
 * @author cthulhu
 */
public class Main {
	public static void main(String [] args){
		ArCondicionado ac = new ArCondicionado();
		
		ac.addObserver(new SensorExterno(33));
		ac.addObserver(new SensorExterno(33));
		ac.addObserver(new SensorExterno(33));
		
		ac.addObserver(new SensorPessoas(6));
		ac.addObserver(new SensorPessoas(9));
		ac.addObserver(new SensorPessoas(3));
		
		ac.update();
		System.out.println(ac.getTemperaturaSala());
	}
}
