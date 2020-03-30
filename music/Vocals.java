package com.music;

public abstract class Vocals extends WayOfExecution {
			
		private String vocalist = "with music";
		
	    public Vocals() {
			
		}
		
	    public void setVoc(String value) {
			this.vocalist = value;
			
		}
		
		public String getVoc() {
			return this.vocalist;
		}
		public Vocals(int century, String era, String kind, String genre) {
			super(century, era, kind, genre);				
		}
			
			public void printInfo() {
				
		}
	}

