package com.music;

public class Types extends Rhythm {
			
		String genre = "opera";
		
	    public Types() {
			
		}
		
		public Types(int century, String era, String kind, String genre) {
			super(century, era, kind);	
			this.genre = genre;
			
		}
			
			public void printInfo() {
				System.out.println("Century:" + century);
				System.out.println("Era:" + era);
		        System.out.println("Kind:" + kind);
		        System.out.println("Genre:" + genre);
		        
		   
		}
	}




