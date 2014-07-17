/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Observer;
import observerUtils.Sensor;
import observerUtils.Subject;

/**
 *
 * @author cthulhu
 */
public class ArCondicionado extends Subject {

	private int temperaturaSala = 0;
	
	
	

	@Override
	public void update() {
		int quantidadePessoas=0;
		int temperaturaExterna=0;
		int quantidadeSensoresExternos=0;
		int quantidadeSensoresInternos=0;
		
		for (Sensor sensor : getObseververs()) {
			if (SensorPessoas.class == sensor.getClass()) {
				quantidadePessoas += sensor.broadcast();
				quantidadeSensoresInternos++;
				;
			} else if (SensorExterno.class == sensor.getClass()) {
				temperaturaExterna += sensor.broadcast();
				quantidadeSensoresExternos++;
			}
		}
		
		temperaturaExterna = temperaturaExterna/quantidadeSensoresExternos;
		quantidadePessoas = quantidadePessoas/quantidadeSensoresInternos;
		
		this.setTemperaturaSala(temperaturaExterna + quantidadePessoas);
		
	}

	/**
	 * @return the temperaturaSala
	 */
	public int getTemperaturaSala() {
		return temperaturaSala;
	}

	/**
	 * @param temperaturaSala the temperaturaSala to set
	 */
	public void setTemperaturaSala(int temperaturaSala) {
		this.temperaturaSala = temperaturaSala;
	}

}
