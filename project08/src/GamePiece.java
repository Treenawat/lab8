public enum GamePiece{
	RED, GREEN, BLUE, YELLOW, CYAN, MAGENTA;
	
	private GamePieceAppearance appearance;
	private int priority;
	
	private GamePiece(GamePieceAppearance appearance, int priority){
		this.appearance = appearance;
		this.priority = priority;
		
	}
	private GamePiece() {
		
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