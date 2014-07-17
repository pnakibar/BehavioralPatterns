/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import br.mediaplayer.MediaPlayer;
import codec.AviCodec;
import codec.Mp4Codec;

/**
 *
 * @author cthulhu
 */
public class Main {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		MediaPlayer mp = new MediaPlayer();
		mp.setCodec(new AviCodec());
		mp.playVideo("Inglorious Basterds", "Legenda Herbert Richards");
		mp.pararVideo();
		
		System.out.println("");
		
		mp.setCodec(new Mp4Codec());
		mp.playVideo("Pulp Fiction", "Marshmallow São Paulo");
		mp.pararVideo();
		
		System.out.println("");
		
		mp.setCodec(new AviCodec());
		mp.playVideo("Django Unchained", "Canarinho Brasil");
		mp.pararVideo();
	}
	
}
