/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package codec;

import java.io.File;

/**
 *
 * @author cthulhu
 */
public abstract class Codec {
	protected abstract void loadVideo(String media);
	protected abstract void loadSubtitile(String subtitle);
	protected abstract void play();
	
	public abstract void stopVideo();
	
	
	public  void initiate(String media, String subtitle){
		loadVideo(media);
		loadSubtitile(subtitle);
		play();
	};
	
	
	
	
	
	
	
}
