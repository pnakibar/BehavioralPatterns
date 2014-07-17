/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cor.interpreter;

import br.sisnavegacao.SisNavegacao;
import utils.cidades.Cidade;
import utils.enums.Posicoes;

/**
 *
 * @author cthulhu
 */
public class InterpreterPosicao extends InterpreterChain{

	public InterpreterPosicao(SisNavegacao sn) {
		super(sn);
	}

	@Override
	public void interpretar(String s) {
		Cidade cidadeMais  = sn.getFilaCidades().getFirst();
		
		if (s.toUpperCase().contains(Posicoes.NORTE.toString())){
			for (Cidade cidadeCompara : sn.getFilaCidades()){
				if (cidadeCompara.getPosY() > cidadeMais.getPosY()) cidadeMais = cidadeCompara;
			}
		}
		
		else if (s.toUpperCase().contains(Posicoes.SUL.toString())){
			for (Cidade cidadeCompara : sn.getFilaCidades()){
				if (cidadeCompara.getPosY() < cidadeMais.getPosY()) cidadeMais = cidadeCompara;
			}
		}
		
		else if (s.toUpperCase().contains(Posicoes.LESTE.toString())){
			for (Cidade cidadeCompara : sn.getFilaCidades()){
				if (cidadeCompara.getPosX() < cidadeMais.getPosX()) cidadeMais = cidadeCompara;
			}
		}
		
		else if (s.toUpperCase().contains(Posicoes.OESTE.toString())){
			for (Cidade cidadeCompara : sn.getFilaCidades()){
				if (cidadeCompara.getPosX() > cidadeMais.getPosX()) cidadeMais = cidadeCompara;
			}
		}
		
		sn.getFilaCidades().addFirst(cidadeMais);
		
	}
	
}
