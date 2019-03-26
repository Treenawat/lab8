import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class BoardGame{
	protected LinkedHashMap<String, GamePiece> playerPieces = new LinkedHashMap<String, GamePiece>();
	protected LinkedHashMap<String, Location> playerLocations = new LinkedHashMap<String, Location>();
	
	public BoardGame(){
	
	}
	public boolean addPlayer(String playerName, GamePiece gamePiece, Location intialLocation) {
		if (playerPieces.containsValue(gamePiece)) {
		return false;
		}
		
		playerPieces.put(playerName, gamePiece);
		playerLocations.put(playerName, intialLocation);
		return true;
	}
	public GamePiece getPlayerGamePiece(String playerName) {
		return playerPieces.get(playerName);
	}
	
	public String getPlayerWithGamePiece(GamePiece gamePiece) {
		for (String key : playerPieces.keySet()) {
			if (playerPieces.containsValue(gamePiece)) {
				return key;
			}
		}
		return null;
	}
	
	public void movePlayer(String playerName, Location newLocation) {
		playerLocations.replace(playerName, newLocation);
	}
	
	public String moveTwoPlayers(Location[] newLocations, String[] playerNames) {
		
	}
	
	
	public Location getPlayersLocation(String player) {
		return playerLocations.get(player);
	}
	
	public ArrayList<String> getPlayersAtLocation(Location loc){
		ArrayList<String> getLocation = new ArrayList<String>();
		for(int i = 0; i < playerLocations.size(); i++) {
			if (playerLocations.containsValue(loc)) {
				getLocation.add(playerLocations.get(i).toString());
			}
		}
		return getLocation;
	}
	
	public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc){
		ArrayList<GamePiece> getPiece = new ArrayList<GamePiece>();
		for(int i = 0; i < playerLocations.size(); i++) {
			if (playerLocations.containsValue(loc)) {
				String a = playerLocations.toString();
				getPiece.add(a);
			}
		}
		return getPiece;
	}
	public Set<String> getPlayers(){
		Set<String> players = new HashSet<String>();
		players.add(playerPieces.toString());
		return players;
	}
	public Set<Location> getPlayerLocations(){
		Set<Location> location = new HashSet<Location>();
		location.add(playerLocations.toString());
		return location;
	}
	public Set<GamePiece> getPlayerPieces(){
		
	}
}