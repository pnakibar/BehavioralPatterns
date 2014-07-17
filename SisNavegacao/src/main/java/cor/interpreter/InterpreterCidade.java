/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cor.interpreter;

import br.sisnavegacao.SisNavegacao;
import java.util.ArrayList;
import utils.cidades.Cidade;
import utils.enums.NomeCidades;

/**
 *
 * @author cthulhu
 */
public class InterpreterCidade extends InterpreterChain {

	public InterpreterCidade(SisNavegacao sn) {
		super(sn);
	}

	@Override
	public void interpretar(String s) {
		
		ArrayList<Cidade> cidades = sn.getBancoCidades().getCidades();
		for (Cidade c : cidades){
			if (c.getNome().toString().contains(s.toUpperCase()))  sn.addCidade(c);
		}
		
		proximoInterpretar(s);
		
	}
	
}
