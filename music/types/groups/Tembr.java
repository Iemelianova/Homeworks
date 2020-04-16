package music.types.groups;

import music.types.Types;

public final class Tembr extends Types {

	public Types groupTembre(ToolTypes tooltype) {

		Types type = null;

		switch (tooltype) {
		case STRINGS:

			type = new Types(20, "00s", "pop");
			System.out.println(type.century + " " + type.era + " " + type.genre);
			break;

		case KEYBOARDS:

			type = new Types(18, "00s", "classic");
			System.out.println(type.century + " " + type.era + " " + type.genre);
			break;

		case PERCUSSION:

			type = new Types(19, "00s", "classic");
			System.out.println(type.century + " " + type.era + " " + type.genre);
			break;

		default:
			System.out.println("Choose another tool type.");
			break;
		}

		return type;

	}

}
