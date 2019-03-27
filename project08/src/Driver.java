import java.util.ArrayList;
import java.util.Comparator;
import org.junit.Assert;
import org.junit.Test;

public class Driver{
	static BoardGame test = new BoardGame();
	public static void main(String[] args) {
	}
	public void testAddPlayer(){
	test.addPlayer("Winner", GamePiece.RED_RACER, Location.LOUNGE);
	test.addPlayer("Loser", GamePiece.RED_THIMBLE, Location.CONSERVATORY);
	Assert.assertEquals( "player values incorrect.", "RED_RACER: a RED RACECAR with priority 0", test.getPlayerGamePiece("Winner"));
	}

	public void testLocation () {
		Assert.assertEquals( "Location enum values incorrect.", Location.KITCHEN, Location.valueOf("KITCHEN")) ;
	}
	
	public void GetPlayerGamePiece() {	
		GamePiece playerPiece = test.getPlayerGamePiece("Winner");
		Assert.assertEquals( "playerPiece values incorrect.", playerPiece, test.getPlayerGamePiece("Winner"));
	}
	
	public void getPlayerWithGamePiece() {
		String playerName = test.getPlayerWithGamePiece(GamePiece.RED_RACER);
		Assert.assertEquals( "playerName values incorrect.", playerName, test.getPlayerWithGamePiece(GamePiece.RED_RACER));
	}
	
	public void movePlayer() {
		test.movePlayer("Winner", Location.LIBRARY);
	}
	
	public void moveTwoPlayers(){
		String[] player = new String[2];
		player[0] = "Winner";
		player[1] = "Loser";
		Location[] location = new Location[2];
		location[0] = Location.LOUNGE;
		location[1] = Location.CONSERVATORY;
		String[] twoMove = new String[2];
		twoMove = test.moveTwoPlayers(location, player);
		Assert.assertEquals( "twoMove values incorrect.", twoMove, test.moveTwoPlayers(location, player));
	}
	public void getPlayersLocation() {
		Location name = test.getPlayersLocation("Winner");
		Assert.assertEquals( "Location values incorrect.", name, test.getPlayersLocation("Winner"));
	}
	public void getPlayersAtLocation() {
		ArrayList<String> name3 = test.getPlayersAtLocation(Location.LOUNGE);
		Assert.assertEquals( "Player at location values incorrect.", name3, test.getPlayersAtLocation(Location.LOUNGE));
	}
	public void getGamePiecesAtLocation() {
		ArrayList<GamePiece> name2 = test.getGamePiecesAtLocation(Location.LOUNGE);
		Assert.assertEquals( "Player at location values incorrect.", name2, test.getGamePiecesAtLocation(Location.LOUNGE));
	}
	public void testShapeToString () {
		Assert.assertEquals("Shape toString incorrect.", "thimble" , Shape.THIMBLE.toString());
		}
}

