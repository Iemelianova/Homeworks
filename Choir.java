package com.music;

public class Choir extends Vocals {
						
			private int singers = 4;
			
		    public Choir() {
				
			}
			
			public Choir(int century, String era, String kind, String genre, String way, String vocalist, int singers) {
				super(century, era, kind, genre, way, vocalist);
				this.singers = singers;
				
			}
				
			public void setSingers(int value) {
					this.singers = value;
					
			}
				
			public int getSingers() {
					return this.singers;
					
			}
					
				public void printInfo() {
					System.out.println("Century:" + century);
					System.out.println("Era:" + era);
			        System.out.println("Kind:" + kind);
			        System.out.println("Genre:" + genre);
			        System.out.println("Way:" + way);
			        System.out.println("Vocalist:" + vocalist);
			        System.out.println("Singers:");
			           
			}

}
