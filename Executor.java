package com.music;

public class Executor {
	
	public static void main(String[] args) {
		
		  MusicEras era1 = new MusicEras();
		  era1.printInfo();
		  System.out.println("__________");
		  
		  MusicEras era2 = new MusicEras(21, "New age");
		  era2.printInfo();
		  System.out.println("__________");
		  
		  Rhythm rhythm1 = new Rhythm(18, "neoclassizm", "major");
		  rhythm1.printInfo();
		  System.out.println("__________");
		 
		  Styles style1 = new Styles(18, "neoclassizm", "major", "rock");
    	  style1.printInfo();
		  System.out.println("__________");
		  
		  
		  Author composer1 = new Author(19, "modern", "minor", "classic", "Glinka");
		  composer1.printInfo();
		  		  		  		
		  String composer = composer1.getComposer();
		  System.out.println(composer);
		  System.out.println("__________");
		  
		  Types genre1 = new Types(17, "neomodern", "minor", "opera");
		  genre1.printInfo();
		  System.out.println("__________");
		  
		  WayOfExecution way1 = new WayOfExecution(19, "neomodern", "minor", "opera", "instrumental");
		  way1.printInfo();
		  System.out.println("__________");
		  
		  Instrument quantity1 = new Instrument(19, "neomodern", "minor", "opera", "instrumental", 12);
		  quantity1.printInfo();
		  
		  int quantity = quantity1.getQuantity();
		  System.out.println(quantity);
		  System.out.println("__________");
		  
		  Vocals voc1 = new Vocals(20, "90s", "minor", "rockopera", "vocal", "with music");
		  voc1.printInfo();
		  System.out.println("__________");
		  
		  Acapella singer1 = new Acapella(20, "90s", "minor", "rockopera", "vocal", "with music", "trio");
		  singer1.printInfo();
		  		  		  		
		  String singer = singer1.getSinger();
		  System.out.println(singer);
		  System.out.println("__________");
		  
		  Choir singers0 = new Choir(21, "00s", "minor", "rock", "ballade", "with music", 2);
		  singer1.printInfo();
		  		  		  		
		  int singers = singers0.getSingers();
		  System.out.println(singers);
		  System.out.println("__________");
		  		  
		}

}
