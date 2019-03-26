public enum GamePiece{
	RED_RACER(new GamePieceAppearance(Color.RED, Shape.RACECAR), 0),
	MAGENTA_RACER(new GamePieceAppearance(Color.MAGENTA, Shape.RACECAR), 1),
	BLUE_RACER(new GamePieceAppearance(Color.BLUE, Shape.RACECAR), 2),
	BLUE_BOOT(new GamePieceAppearance(Color.BLUE, Shape.BOOT), 2),
	YELLOW_BOOT(new GamePieceAppearance(Color.YELLOW, Shape.BOOT), 2),
	GREEN_BOOT(new GamePieceAppearance(Color.GREEN, Shape.BOOT), 2),
	RED_THIMBLE(new GamePieceAppearance(Color.RED, Shape.THIMBLE), 2);
	
	private GamePieceAppearance appearance;
	private int priority;
	
	private GamePiece(GamePieceAppearance appearance, int priority){
		this.appearance = appearance;
		this.priority = priority;
		
	}

	public int getColor() {
		return getColor();
	}
	public int getShape() {
		return getShape();
	}
	public static GamePiece movesFirst(GamePiece a, GamePiece b) {
		if (a.priority < b.priority) {
			return a;
		}
		else if (a.priority > b.priority) {
			return b;
		}
		else {
			return a;
		}
	}
	public String toString() {
		return String.format("%s: a %s %s with priority %d", name(), getColor(), getShape(), priority);
	}
}