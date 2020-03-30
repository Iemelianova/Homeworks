package com.music;

public class Instrument extends WayOfExecution {
		
		private int quantity = 7;
		
	    public Instrument() {
			
		}
		
		public Instrument(int century, String era, String kind, String genre) {
			super(century, era, kind, genre);	
			
		}
		
		public void setQuantity(int value) {
			this.quantity = value;
			
		}
		
		public int getQuantity() {
			return this.quantity;
		}
		
			public void printInfo() {
				    
		}
	}