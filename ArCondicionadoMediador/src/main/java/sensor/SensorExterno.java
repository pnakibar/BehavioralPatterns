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
public class SensorExterno {
	private int temp=0;
	private Arcondicionado ac;
	
	public int getTemp(){
		return temp;
	}
	public void setTemp(int temp){
		this.temp = temp;
		ac.update();
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
}
