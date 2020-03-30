package com.music;

public class Rhythm extends MusicEras{
	
	String kind = "minor";
		
    public Rhythm() {
		
	}
	
	public Rhythm(int century, String era, String kind) {
		super(century, era);
		this.kind = kind;
	}
	
		public void printInfo() {
			System.out.println("Century:" + century);
			System.out.println("Era:" + era);
	        System.out.println("Kind:" + kind);
	}
}
