/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import arcondicionado.Arcondicionado;
import sensor.SensorExterno;
import sensor.SensorInterno;

/**
 *
 * @author cthulhu
 */
public class Main {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Arcondicionado ac = new Arcondicionado();
		
		SensorExterno se1 = new SensorExterno(ac);
		SensorExterno se2 = new SensorExterno(ac);
		SensorExterno se3 = new SensorExterno(ac);
		
		SensorInterno si1 = new SensorInterno(ac);
		SensorInterno si2 = new SensorInterno(ac);
		SensorInterno si3 = new SensorInterno(ac);
		
		ac.addSensorExterno(se1);
		ac.addSensorExterno(se2);
		ac.addSensorExterno(se3);
		
		ac.addSensorInterno(si1);
		ac.addSensorInterno(si2);
		ac.addSensorInterno(si3);
		
		se1.setTemp(40);
		se2.setTemp(35);
		se3.setTemp(30);
		
		si1.setPessoas(5);
		si2.setPessoas(3);
		si3.setPessoas(4);
		
		
		
	}
	
}

