package Day03;

enum Rainbow {
	RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

public class EX08_Enum {

	public static void main(String[] args) {

		Rainbow[] rainbow = Rainbow.values();
		for (Rainbow color : rainbow) {
			System.out.println(color + " ");

		}
		System.out.println();

		Rainbow G = Rainbow.valueOf("GREEN");
		System.out.println("G : " + G);

		int index = G.ordinal();
		System.out.println("GREEN의 index : " + index);

	}

}