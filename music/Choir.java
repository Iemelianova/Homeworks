package com.music;

public class Choir extends Vocals {
						
			private int singers = 4;
			
		    public Choir() {
				
			}
			
			public Choir(int century, String era, String kind, String genre) {
				super(century, era, kind, genre);
								
			}
				
			public void setSingers(int value) {
					this.singers = value;
					
			}
				
			public int getSingers() {
					return this.singers;
					
			}
					
				public void printInfo() {
								           
			}

}
