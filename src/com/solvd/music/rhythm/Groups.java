package com.solvd.music.rhythm;

import com.solvd.music.rhythm.Rhythm;
import com.solvd.music.rhythm.Types;
import com.solvd.music.rhythm.ToolTypes;

public final class Groups extends Types {

	public Rhythm groupName(ToolTypes tooltype) {

		Rhythm rhythm = null;

		switch (tooltype) {
		case STRINGS:

			rhythm = new Rhythm(20, "00s", "major");
			System.out.println(rhythm.century + " " + rhythm.era + " " + rhythm.kind);
			break;

		case KEYBOARDS:

			rhythm = new Rhythm(18, "00s", "major");
			System.out.println(rhythm.century + " " + rhythm.era + " " + rhythm.kind);
			break;

		case PERCUSSION:

			rhythm = new Rhythm(19, "00s", "major");
			System.out.println(rhythm.century + " " + rhythm.era + " " + rhythm.kind);
			break;

		default:
			System.out.println("Choose another tool type.");
			break;
		}

		return rhythm;

	}

}
