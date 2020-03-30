package com.music;

public class Acapella extends Vocals{
					
			String singer = "solo";
			
		    public Acapella() {
				
			}
			
			public Acapella(int century, String era, String kind, String genre, String way, String vocalist, String singer) {
				super(century, era, kind, genre, way, vocalist);	
				this.singer = singer;
			}
				
			public void setSinger(String value) {
				this.singer = value;
				
			}
			
			public String getSinger() {
				return this.singer;
			}
				public void printInfo() {
					System.out.println("Century:" + century);
					System.out.println("Era:" + era);
			        System.out.println("Kind:" + kind);
			        System.out.println("Genre:" + genre);
			        System.out.println("Way:" + way);
			        System.out.println("Vocalist:" + vocalist);
			        System.out.println("Singer:");
			        
			}

}
