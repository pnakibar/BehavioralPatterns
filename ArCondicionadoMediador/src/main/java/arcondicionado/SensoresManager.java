/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package arcondicionado;

import java.util.ArrayList;
import sensor.SensorExterno;
import sensor.SensorInterno;

/**
 *
 * @author cthulhu
 */
public class SensoresManager {
	private Arcondicionado ac;
	private ArrayList<SensorInterno> sensoresInternos = new ArrayList<>();
	private ArrayList<SensorExterno> sensoresExternos = new ArrayList<>();
	
	public SensoresManager(Arcondicionado ac){
		this.ac = ac;
	}
	
	public int getTemperaturaSala(){
		return getTemperaturaExterna() + getTemperaturaInterna();
	}
	
	public void update(){
		ac.update();
	}
	
	public int getTemperaturaExterna() {
		int temperaturaExterna = 0;
		for (SensorExterno sensorExterno : sensoresExternos) {
			temperaturaExterna += sensorExterno.getTemp();
		}
		return temperaturaExterna / sensoresExternos.size();
	}

	public int getTemperaturaInterna() {
		int quantidadePessoas = 0;
		for (SensorInterno sensorInterno : sensoresInternos) {
			quantidadePessoas += sensorInterno.getPessoas();
		}
		return quantidadePessoas / sensoresInternos.size();
	}
	
	public void addSensorInterno(SensorInterno si) {
		sensoresInternos.add(si);
	}

	public void addSensorExterno(SensorExterno se) {
		sensoresExternos.add(se);
	}
}
