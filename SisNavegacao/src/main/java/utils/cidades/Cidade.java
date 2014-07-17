/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utils.cidades;

import utils.enums.NomeCidades;

/**
 *
 * @author cthulhu
 */
public class Cidade {
	private NomeCidades nome;
	private int posX;
	private int posY;
	
	public static Cidade gerar(NomeCidades nome, int posx, int posy){
		return new Cidade(nome, posx, posy);
		
	}
	
	private Cidade(NomeCidades nome, int posx, int posy){
		this.nome = nome;
		this.posX = posx;
		this.posY = posy;
	}
	public String toString(){
		return nome.toString();
	}
		
	/**
	 * @return the nome
	 */
	public NomeCidades getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(NomeCidades nome) {
		this.nome = nome;
	}

	/**
	 * @return the posX
	 */
	public int getPosX() {
		return posX;
	}

	/**
	 * @param posX the posX to set
	 */
	public void setPosX(int posX) {
		this.posX = posX;
	}

	/**
	 * @return the posY
	 */
	public int getPosY() {
		return posY;
	}

	/**
	 * @param posY the posY to set
	 */
	public void setPosY(int posY) {
		this.posY = posY;
	}
}
