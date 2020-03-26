package com.music;

public class WayOfExecution extends Types {
			
		String way = "instrumental";
		
	    public WayOfExecution() {
			
		}
		
		public WayOfExecution(int century, String era, String kind, String genre, String way) {
			super(century, era, kind, genre);
			this.way = way;
			
		}
			
			public void printInfo() {
				System.out.println("Century:" + century);
				System.out.println("Era:" + era);
		        System.out.println("Kind:" + kind);
		        System.out.println("Genre:" + genre);
		        System.out.println("Way:" + way);
		         
		}
	}
