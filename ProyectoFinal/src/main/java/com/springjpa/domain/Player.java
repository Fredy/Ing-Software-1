package com.springjpa.domain;
import java.time.Instant;

public class Player {
	
	protected Instant songPauseState;
	protected PlayQueue queue;
	
	public Instant getSongPauseState(){
		return songPauseState;
	}
	
	public void play(){
		//something
	}
	
	public void pause(){
		//something
	}
	public void stop(){
		//something
	}
	public void next(){
		queue.next();
		
	}
	public void prev(){
		queue.prev();
	}
	public void random(){
		//something
	}
	
}
