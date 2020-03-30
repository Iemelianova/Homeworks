package com.music;

public class WayOfExecution extends Types {
			
		private String way = "instrumental";
		
	    public WayOfExecution() {
			
		}
		
		public WayOfExecution(int century, String era, String kind, String genre) {
			super(century, era, kind, genre);
					
		}
		
		public void setWay(String value) {
			this.way = value;
			
		}
		
		public String getWay() {
			return this.way;
		}
		
			public void printInfo() {
						         
		}
	}
