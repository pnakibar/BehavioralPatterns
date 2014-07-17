/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codec;

/**
 *
 * @author cthulhu
 */
public class Mp3Codec extends Codec {

	@Override
	protected void loadVideo(String media) {
		System.out.println(media + " Carregado");
	}

	@Override
	protected void loadSubtitile(String subtitle) {
		System.out.println(subtitle + " Carregado");
	}

	@Override
	protected void play() {
		System.out.println(this.getClass()+" tocando!");
	}

	@Override
	public void stopVideo() {
		System.out.println(this.getClass()+" parado!");
	}

}
