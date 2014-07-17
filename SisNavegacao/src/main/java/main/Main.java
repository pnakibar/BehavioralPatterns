/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import br.sisnavegacao.SisNavegacao;
import cor.interpreter.InterpreterCidade;

/**
 *
 * @author cthulhu
 */
public class Main {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		SisNavegacao sn = new SisNavegacao();
		sn.interpret("CARIACICA VITORIA NORTE");
		sn.interpret("GUARAPARI VITORIA SUL");
	}
	
}
