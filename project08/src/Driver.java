public class Driver{
	public static void main(String[] args){
	//Create
	BoardGame test = new BoardGame();
	
	//Add Player
	test.addPlayer("Winner", GamePiece.RED_RACER, Location.LOUNGE);
	test.addPlayer("Loser", GamePiece.RED_THIMBLE, Location.STUDHALL);
	
	//Try
	GamePiece playerPiece = test.getPlayerGamePiece("Winner");
	System.out.print(playerPiece);
	
	}
}