/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import observerUtils.Sensor;
import observerUtils.Subject;

/**
 *
 * @author cthulhu
 */
public class SensorPessoas extends Sensor {

	private int quantidadePessoas;
	
	public SensorPessoas(int pessoas){
		this.quantidadePessoas=pessoas;
	}
	@Override
	public int broadcast() {
		return this.getQuantidadePessoas();
	}

	/**
	 * @return the quantidadePessoas
	 */
	public int getQuantidadePessoas() {
		return quantidadePessoas;
	}

	/**
	 * @param quantidadePessoas the quantidadePessoas to set
	 */
	public void setQuantidadePessoas(int quantidadePessoas) {
		this.quantidadePessoas = quantidadePessoas;
	}

}
