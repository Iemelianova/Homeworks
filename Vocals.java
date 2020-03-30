package com.music;

public class Vocals extends WayOfExecution {
			
		String vocalist = "with music";
		
	    public Vocals() {
			
		}
		
		public Vocals(int century, String era, String kind, String genre, String way, String vocalist) {
			super(century, era, kind, genre, way);
			this.vocalist = vocalist;
			
		}
			
			public void printInfo() {
				System.out.println("Century:" + century);
				System.out.println("Era:" + era);
		        System.out.println("Kind:" + kind);
		        System.out.println("Genre:" + genre);
		        System.out.println("Way:" + way);
		        System.out.println("Vocalist:" + vocalist);
		           
		}
	}

