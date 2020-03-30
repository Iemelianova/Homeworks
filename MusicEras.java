package com.music;
public class MusicEras {

	
	int century = 20;
	String era = "80s";
	
	public MusicEras() {
		
	}
		
	
	public MusicEras(int century, String era) {
		this.century = century;
		this.era = era;
		
	}
	
	public void printInfo() {
		System.out.println("Century:" + century);
		System.out.println("Era:" + era);
	
	}
}

