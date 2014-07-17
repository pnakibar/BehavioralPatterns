/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.mediaplayer;

import codec.Codec;

/**
 *
 * @author cthulhu
 */
public class MediaPlayer {
	private Codec codec;
	
	public void playVideo(String filme, String legenda){
		getCodec().initiate(filme, legenda);
	}
	
	public void pararVideo(){
		getCodec().stopVideo();
	}

	/**
	 * @return the codec
	 */
	public Codec getCodec() {
		return codec;
	}

	/**
	 * @param codec the codec to set
	 */
	public void setCodec(Codec codec) {
		this.codec = codec;
	}
}
