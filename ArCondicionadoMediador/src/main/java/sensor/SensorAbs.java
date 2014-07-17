/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sensor;

import arcondicionado.SensoresManager;

/**
 *
 * @author cthulhu
 */
public class SensorAbs {
	private SensoresManager sm;
	
	public SensorAbs(SensoresManager sm){
		this.sm = sm;
	}
	
	public void update(){
		sm.update();
	}
	
	/**
	 * @return the sm
	 */
	public SensoresManager getSm() {
		return sm;
	}
	
	

	/**
	 * @param sm the sm to set
	 */
	public void setSm(SensoresManager sm) {
		this.sm = sm;
	}
}
