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
public class SensorInterno {
	private int pessoas=0;
	private Arcondicionado ac;
	
	public int getPessoas(){
		return pessoas;
	}

	/**
	 * @param pessoas the pessoas to set
	 */
	public void setPessoas(int pessoas) {
		this.pessoas = pessoas;
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
