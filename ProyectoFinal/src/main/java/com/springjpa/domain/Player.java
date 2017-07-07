package com.springjpa.domain;
import java.time.Instant;

public class Player {
	
	protected Instant songPauseState;
	protected PlayQueue queue;
	
	public Instant getSongPauseState(){
		return songPauseState;
	}
	
	//TODO: que se mueva el cursor en la linea en tiempo de reproduccion 
	
	public void play(){
		//something
		//TODO: que funcione
		}
	
	public void pause(){
		//something
		//TODO: que funcione
	}
	public void stop(){
		//something
		//TODO: que funcione
	}
	public void next(){
		queue.next();
	}
	public void prev(){
		queue.prev();
	}
	public void random(){
		if(queue.isRandom()){
			queue.setRandom(false);
		}else {
			queue.setRandom(true);
		}
	}
}
