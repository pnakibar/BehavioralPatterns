/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sensor;

import arcondicionado.Arcondicionado;
import arcondicionado.SensoresManager;

/**
 *
 * @author cthulhu
 */
public class SensorExterno extends SensorAbs{
	private int temp=0;

	public SensorExterno(SensoresManager sm) {
		super(sm);
	}
	
	
	public int getTemp(){
		return temp;
	}
	public void setTemp(int temp){
		this.temp = temp;
		update();
	}
}
