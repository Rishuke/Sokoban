import java.util.ArrayList;

public enum Direction {
	GAUCHE(0, -1), DROITE(0, 1), HAUT(-1, 0), BAS(1, 0), AUCUNE(0, 0);

	private ArrayList<Direction> DIRECTIONS = new ArrayList<Direction>();
	private int dx;
	private int dy;
	/*
	public Direction() {
		DIRECTIONS.add(Direction.HAUT);
		DIRECTIONS.add(Direction.BAS);
		DIRECTIONS.add(Direction.DROITE);
		DIRECTIONS.add(Direction.GAUCHE);
	}
	*/
	public Direction(int x, int y) {
		this.dx = x;
		this.dy = y;
	}

	public ArrayList<Direction> getDirections() {
		return DIRECTIONS;
	}

	public int getDX() {
		return dx;
	}

	public int getDY() {
		return dy;
	}

}
