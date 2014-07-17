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
public class SensorInterno extends SensorAbs{
	private int pessoas=0;

	public SensorInterno(SensoresManager sm) {
		super(sm);
	}
	
	
	public int getPessoas(){
		return pessoas;
	}

	/**
	 * @param pessoas the pessoas to set
	 */
	public void setPessoas(int pessoas) {
		this.pessoas = pessoas;
		update();
	}

	
}
