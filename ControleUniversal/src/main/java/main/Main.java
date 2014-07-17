package main;

import model.AlterarPortao;
import model.Funcionalidade;
import model.Portao;

import model.controle.ControleUniversal;

public class Main {
	public static void main(String [] args){
		Portao portao = new Portao();
		Funcionalidade foo = new AlterarPortao(portao);
		
		ControleUniversal cu = new ControleUniversal(foo, foo );
		
		cu.doSomething();
		cu.undoSomething();
	}
}