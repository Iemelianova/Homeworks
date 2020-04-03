package com.solvd;

import music.rhythm.Rhythm;
import music.rhythm.Types;
import music.rhythm.WayOfExecution;
import music.rhythm.instrument.Instrument;
import music.rhythm.style.Author;
import music.rhythm.style.Styles;
import music.rhythm.vocals.Acapella;
import music.rhythm.vocals.Choir;

public class Executor {

	public static void main(String[] args) {

		Rhythm rhythm1 = new Rhythm();
		rhythm1.printInfo();

		System.out.println("Century:" + rhythm1.century);
		System.out.println("Era:" + rhythm1.era);
		System.out.println("Kind:" + rhythm1.kind);
		System.out.println("__________");

		Styles style1 = new Styles();
		style1.printInfo();

		System.out.println("Century:" + style1.century);
		System.out.println("Era:" + style1.era);
		System.out.println("Kind:" + style1.kind);
		System.out.println("Music style:" + style1.musstyle);
		System.out.println("__________");

		Author composer1 = new Author(19, "modern", "minor", "classic");
		composer1.printInfo();

		System.out.println("Century:" + composer1.century);
		System.out.println("Era:" + composer1.era);
		System.out.println("Kind:" + composer1.kind);
		System.out.println("Music style:" + composer1.musstyle);
		System.out.println("Composer:");
		String composer = composer1.getComposer();
		System.out.println(composer);
		System.out.println("__________");

		Types genre1 = new Types(17, "neomodern", "minor", "opera");
		genre1.printInfo();

		System.out.println("Century:" + genre1.century);
		System.out.println("Era:" + genre1.era);
		System.out.println("Kind:" + genre1.kind);
		System.out.println("Genre:" + genre1.genre);
		System.out.println("__________");

		WayOfExecution way1 = new WayOfExecution();
		way1.printInfo();

		System.out.println("Century:" + way1.century);
		System.out.println("Era:" + way1.era);
		System.out.println("Kind:" + way1.kind);
		System.out.println("Genre:" + way1.genre);
		System.out.println("Way:");

		String way = way1.getWay();
		System.out.println(way);
		System.out.println("__________");

		Instrument quantity1 = new Instrument();
		quantity1.printInfo();
		quantity1.era();
		quantity1.era(15);

		System.out.println("__________");

		Acapella singer1 = new Acapella();
		singer1.printInfo();

		System.out.println("Century:" + singer1.century);
		System.out.println("Era:" + singer1.era);
		System.out.println("Kind:" + singer1.kind);
		System.out.println("Genre:" + singer1.genre);
		System.out.println("Way:");
		System.out.println(singer1.getWay());

		System.out.println("Vocalist:" + singer1.vocalist);
		System.out.println("Singer:");
		String singer = singer1.getSinger();
		System.out.println(singer);
		System.out.println(singer1.isSoprano);
		System.out.println("__________");

		Choir singers0 = new Choir(21, "00s", "minor", "rock");
		singers0.printInfo();

		System.out.println("Century:" + singers0.century);
		System.out.println("Era:" + singers0.era);
		System.out.println("Kind:" + singers0.kind);
		System.out.println("Genre:" + singers0.genre);
		System.out.println("Way:");
		System.out.println(singers0.getWay());
		System.out.println("Vocalist:" + singers0.vocalist);
		System.out.println("Singers:");

		int singers = singers0.getSingers();
		System.out.println(singers);
		System.out.println("__________");

	}

}
