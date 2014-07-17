/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utils.cidades;

import java.util.ArrayList;
import java.util.HashMap;
import utils.enums.NomeCidades;

/**
 *
 * @author cthulhu
 */
public class GeradorCidades {
	private ArrayList<Cidade> cidades = new ArrayList<>();
	
	public GeradorCidades(){
		inserirCidade(Cidade.gerar(NomeCidades.ARACRUZ, 40, 150));
		inserirCidade(Cidade.gerar(NomeCidades.VITORIA,50 , 70 ));
		inserirCidade(Cidade.gerar(NomeCidades.VIANA,30 ,40 ));
		inserirCidade(Cidade.gerar(NomeCidades.GUARAPARI,30 , 30 ));
		inserirCidade(Cidade.gerar(NomeCidades.CARIACICA,30 , 60 ));
	}
	
	private void inserirCidade(Cidade c){
		getCidades().add(c);
	}

	/**
	 * @return the cidades
	 */
	public ArrayList<Cidade> getCidades() {
		return cidades;
	}
		
}
