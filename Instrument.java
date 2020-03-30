package com.music;

public class Instrument extends WayOfExecution {
		
		private int quantity = 7;
		
	    public Instrument() {
			
		}
		
		public Instrument(int century, String era, String kind, String genre, String way, int quantity) {
			super(century, era, kind, genre, way);	
			
		}
		
		public void setQuantity(int value) {
			this.quantity = value;
			
		}
		
		public int getQuantity() {
			return this.quantity;
		}
		
			public void printInfo() {
				System.out.println("Century:" + century);
				System.out.println("Era:" + era);
		        System.out.println("Kind:" + kind);
		        System.out.println("Genre:" + genre);
		        System.out.println("Way:" + way);
		        System.out.println("Quantity:");
		      
		        
		}
	}