package arcondicionado;

import java.util.ArrayList;
import java.util.Iterator;
import sensor.SensorExterno;
import sensor.SensorInterno;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author cthulhu
 */
public class Arcondicionado {

	private int temperaturaDesejada = 25;
	private SensoresManager sensoresManager = new SensoresManager(this);

	public void update() {
		if (sensoresManager.getTemperaturaSala() > temperaturaDesejada) {
			aumentarIntensidade();
		} else {
			diminuirrIntensidade();
		}
	}

	
	public void aumentarIntensidade() {
		System.out.println("Aumentar intensidade.");
	}

	public void diminuirrIntensidade() {
		System.out.println("Diminuir intensidade.");
	}

	public void addSensorInterno(SensorInterno si) {
		sensoresManager.addSensorInterno(si);
	}

	public void addSensorExterno(SensorExterno se) {
		sensoresManager.addSensorExterno(se);
	}
}
