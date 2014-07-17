/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sisnavegacao;

import cor.interpreter.Interpreter;
import cor.interpreter.InterpreterChain;
import cor.interpreter.InterpreterCidade;
import cor.interpreter.InterpreterPosicao;
import java.util.LinkedList;
import utils.cidades.Cidade;
import utils.cidades.GeradorCidades;
import utils.enums.NomeCidades;

/**
 *
 * @author cthulhu
 */
public class SisNavegacao {

	private Interpreter interpreter = new Interpreter(this);
	private GeradorCidades bancoCidades = new GeradorCidades();
	private LinkedList<Cidade> filaCidades;

	/**
	 * @return the bancoCidades
	 */
	public GeradorCidades getBancoCidades() {
		return bancoCidades;
	}

	public void addCidade(Cidade c) {
		getFilaCidades().add(c);
	}

	/**
	 * @return the filaCidades
	 */
	public LinkedList<Cidade> getFilaCidades() {
		return filaCidades;
	}
	
	public void interpret(String comando){
		filaCidades = new LinkedList<>();
		interpreter.interpretar(comando);
		System.out.println(filaCidades.getFirst());
		
	}

}
