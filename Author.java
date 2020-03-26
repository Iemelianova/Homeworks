package com.music;

public class Author extends Styles {
	
    private String composer = "Edvard Greig";
	
    public Author() {
		
	}
	
	public Author(int century, String era, String kind, String musstyle, String composer) {
		super(century, era, kind, musstyle);	
		this.composer = composer;
		
	}
	
	public void setComposer(String value) {
		this.composer = value;
		
	}
	
	public String getComposer() {
		return this.composer;
	}
	
		public void printInfo() {
			System.out.println("Century:" + century);
			System.out.println("Era:" + era);
	        System.out.println("Kind:" + kind);
	        System.out.println("Music style:" + musstyle);
	        System.out.println("Composer:");
	        
	}
}




