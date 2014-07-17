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

	private ArrayList<SensorInterno> sensoresInternos = new ArrayList<>();
	private ArrayList<SensorExterno> sensoresExternos = new ArrayList<>();

	public void update() {
		int temperaturaInterna = calcularTemperaturaExterna() + calcularTemperaturaInterna();

		if (temperaturaInterna > temperaturaDesejada) {
			aumentarIntensidade();
		} else {
			diminuirrIntensidade();
		}
	}

	private int calcularTemperaturaExterna() {
		int temperaturaExterna = 0;
		for (SensorExterno sensorExterno : sensoresExternos) {
			temperaturaExterna += sensorExterno.getTemp();
		}
		return temperaturaExterna / sensoresExternos.size();
	}

	private int calcularTemperaturaInterna() {
		int quantidadePessoas = 0;
		for (SensorInterno sensorInterno : sensoresInternos) {
			quantidadePessoas += sensorInterno.getPessoas();
		}
		return quantidadePessoas / sensoresInternos.size();
	}

	public void aumentarIntensidade() {
		System.out.println("Aumentar intensidade.");
	}

	public void diminuirrIntensidade() {
		System.out.println("Diminuir intensidade.");
	}

	public void addSensorInterno(SensorInterno si) {
		sensoresInternos.add(si);
	}

	public void addSensorExterno(SensorExterno se) {
		sensoresExternos.add(se);
	}
}
