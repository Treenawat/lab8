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
		int color = ;
		return color;
	}
	public int getShape() {
		int shape = ;
		return shape;
	}
	public GamePiece movesFirst(GamePiece a, GamePiece b) {
		
	}
	public String toString() {
		
	}
}