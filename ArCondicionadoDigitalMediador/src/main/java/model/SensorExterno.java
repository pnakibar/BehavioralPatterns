/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import observerUtils.Sensor;

/**
 *
 * @author cthulhu
 */
public class SensorExterno extends Sensor {

	private int temperatura;

	public SensorExterno(int temp) {
		this.temperatura = temp;
	}

	public int broadcast() {
		return getTemperatura();
	}

	/**
	 * @return the temperatura
	 */
	public int getTemperatura() {
		return temperatura;
	}

	/**
	 * @param temperatura the temperatura to set
	 */
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

}
