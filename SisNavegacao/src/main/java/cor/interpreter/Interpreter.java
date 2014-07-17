/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cor.interpreter;

import br.sisnavegacao.SisNavegacao;

/**
 *
 * @author cthulhu
 */
public class Interpreter {
	private InterpreterPipeline interpreterPipeline;
	
	public Interpreter(SisNavegacao sn){
		 interpreterPipeline = new InterpreterPipeline(sn);
	}
	
	public void interpretar(String s) {
		String buffer = "";
		char c;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				interpreterPipeline.interpret(buffer);
				buffer = "";
			} else {
				buffer += s.charAt(i);
			}
		}
	}

}
