/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author cthulhu
 */
public class AlterarPortao implements Funcionalidade {
	private Portao portao;
	public AlterarPortao(Portao portao){
		this.portao = portao;
	}
	@Override
	public void execute() {
		
		if (portao.isAberto == true){
			System.out.println("Fechando Portao!");
		}
		else{
			System.out.println("Abrindo Portao!");
		}
		
		portao.isAberto = !portao.isAberto;
	}
	
}
