/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sensor;

import arcondicionado.Arcondicionado;

/**
 *
 * @author cthulhu
 */
public abstract class SensorAbs {
	protected Arcondicionado ac;
	
	public SensorAbs(Arcondicionado ac){
		this.ac = ac;
	}
	/**
	 * @return the ac
	 */
	public Arcondicionado getAc() {
		return ac;
	}

	/**
	 * @param ac the ac to set
	 */
	public void setAc(Arcondicionado ac) {
		this.ac = ac;
	}
	public void update(){
		ac.update();
	}
}
