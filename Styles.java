package com.music;

public class Styles extends Rhythm {
	
	String musstyle = "classic";
	
    public Styles() {
		
	}
	
	public Styles(int century, String era, String kind, String musstyle) {
		super(century, era, kind);	
		this.musstyle = musstyle;
	}
	
			public void printInfo() {
			System.out.println("Century:" + century);
			System.out.println("Era:" + era);
	        System.out.println("Kind:" + kind);
	        System.out.println("Music style:" + musstyle);
	}
}

